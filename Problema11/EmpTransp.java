package Problema11;

import java.io.*;
import java.util.ArrayList;

public class EmpTransp implements Serializable{

    private String nombreEmp, datosCamiones;
    private int totCamiones, noCamiones;

    /*

    public EmpTransp(String nombreEmp) {
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(nombreEmp))) {
            this = (EmpTransp) entrada.readObject();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

     */

    public EmpTransp(String nombreEmp, int totCamiones) {
        this.nombreEmp = nombreEmp;
        this.totCamiones = totCamiones;
        this.datosCamiones = "Camiones_" + nombreEmp + ".obj";
        this.noCamiones = 0;
    }

    @Override
    public String toString() {
        return "EmpTransp{" +
                "nombreEmp='" + nombreEmp + '\'' +
                ", datosCamiones='" + datosCamiones + '\'' +
                ", totCamiones=" + totCamiones +
                '}';
    }

    // Primer requisito

    public String camionesDisponibles(char tipoCamion, int totPasajeros, double totKilometros) {
        StringBuilder sb = new StringBuilder();

        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(datosCamiones))) {

            switch (tipoCamion) {
                case 'T' -> camionesDisponiblesTurismo(totPasajeros, totKilometros, sb, entrada);
                case 'E' -> camionesDisponiblesEscolar(totPasajeros, totKilometros, sb, entrada);
                default -> throw new RuntimeException();
            }

            if (sb.isEmpty())
                sb.append("\tNo se cuenta con camiones que cumplan los requisitos.\n");

            sb.insert(0, "=============================================================================================================================================================================================\n");
            sb.append("=============================================================================================================================================================================================\n");

        } catch (Exception e) {
            sb.append("ERROR: No hay camiones registrados");
        }

        return sb.toString();
    }

    private void camionesDisponiblesTurismo(int totPasajeros, double totKilometros, StringBuilder sb, ObjectInputStream lee) {
        Object dato;

        try {
            dato = lee.readObject();

            if (dato instanceof Turismo && ((Turismo) dato).getTotalPasaj() >= totPasajeros)
                sb.append("\t" + dato.toString() + "\tCosto: $" + ((Turismo) dato).calculaCostoServicio(totKilometros) + "\n");

            camionesDisponiblesTurismo(totPasajeros, totKilometros, sb, lee);
        } catch (Exception e) {
        }
    }

    private void camionesDisponiblesEscolar(int totPasajeros, double totKilometros, StringBuilder sb, ObjectInputStream lee) {
        Object dato;

        try {
            dato = lee.readObject();

            if (dato instanceof Escolar && ((Escolar) dato).getTotalPasaj() >= totPasajeros)
                sb.append("\t" + dato.toString() + "\tCosto: $" + ((Turismo) dato).calculaCostoServicio(totKilometros) + "\n");

            camionesDisponiblesEscolar(totPasajeros, totKilometros, sb, lee);
        } catch (Exception e) {
        }
    }

    // Segundo requisito

    public boolean satisfaceDemanda(char tipoCamion, int totPasajeros, int noCamiones) {

        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(datosCamiones))) {

            return switch (tipoCamion) {
                case 'T' -> satisfaceDemandaTurismo(totPasajeros, 0, entrada, noCamiones) >= noCamiones;
                case 'E' -> satisfaceDemandaEscolar(totPasajeros, 0, entrada) >= noCamiones;
                default -> throw new RuntimeException();
            };

        } catch (Exception e) {
            return false;
        }
    }

    private int satisfaceDemandaTurismo(int totPasajeros, int camiones, ObjectInputStream lee, int noCamiones) {
        Object dato;
        if (camiones <= noCamiones) {
            try {
                dato = lee.readObject();

                if (dato instanceof Turismo && ((Turismo) dato).getTotalPasaj() >= totPasajeros)
                    camiones++;

                return satisfaceDemandaTurismo(totPasajeros, camiones, lee, noCamiones);
            } catch (Exception e) {
                return camiones;
            }
        } else
            return camiones;
    }

    private int satisfaceDemandaEscolar(int totPasajeros, int camiones, ObjectInputStream lee) {
        Object dato;

        try {
            dato = lee.readObject();

            if (dato instanceof Escolar && ((Escolar) dato).getTotalPasaj() >= totPasajeros)
                camiones++;

            return satisfaceDemandaEscolar(totPasajeros, camiones, lee);
        } catch (Exception e) {
            return camiones;
        }
    }

    // Tercer requisito

    public boolean camionDisponible(String placas) {

        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(datosCamiones))) {
            return camionDisponible(placas, entrada);
        } catch (Exception e) {
            return false;
        }
    }

    private boolean camionDisponible(String placas, ObjectInputStream lee) {
        Object dato;

        try {
            dato = lee.readObject();

            if (dato instanceof Camion && dato.equals(placas))
                return true;

            return camionDisponible(placas, lee);
        } catch (Exception e) {
            return false;
        }
    }

    // Cuarto requisito

    public String camionesEscolaresProyectos() {

        StringBuilder sb = new StringBuilder();

        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(datosCamiones))) {

            camionesEscolaresProyectos(sb, entrada);

            if (sb.isEmpty())
                sb.append("\tNo se cuenta con camiones que cumplan los requisitos.\n");

            sb.insert(0, "=======================\n");
            sb.append("=======================\n");

        } catch (Exception e) {
            sb.append("ERROR: No hay camiones registrados");
        }

        return sb.toString();
    }

    private void camionesEscolaresProyectos(StringBuilder sb, ObjectInputStream lee) {
        Object dato;

        try {
            dato = lee.readObject();

            if (dato instanceof Escolar && ((Escolar) dato).getTotalPasaj() >= 20 && ((Escolar) dato).isLugarProyecto())
                sb.append(((Escolar) dato).getPlacas() + "\n");

            camionesEscolaresProyectos(sb, lee);
        } catch (Exception e) {
        }
    }

    // Quinto requisito

    public int totCamiones(String marca, double totKilometros, double maxCosto) {
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(datosCamiones))) {
            return totCamiones(marca, totKilometros, maxCosto, 0, entrada);
        } catch (Exception e) {
            return 0;
        }
    }

    private int totCamiones(String marca, double totKilometros, double maxCosto, int camiones, ObjectInputStream lee) {
        Object dato;

        try {
            dato = lee.readObject();

            if (dato instanceof Turismo && ((Turismo) dato).getMarca() == marca && ((Turismo) dato).calculaCostoServicio(totKilometros) < maxCosto && ((Turismo) dato).serviBar)
                camiones++;

            return totCamiones(marca, totKilometros, maxCosto, camiones, lee);
        } catch (Exception e) {
            return camiones;
        }
    }

    // Sexto requisito

    public boolean escribirEmpresa() {
        try (ObjectOutputStream escribe = new ObjectOutputStream(new FileOutputStream(nombreEmp + ".obj"))) {
            escribe.writeObject(this);
            escribe.close();

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // Other

    public void altaCamion(String marca, String numMotor, String placas, Double costoCamion, int totalPasaj, boolean lugarProyecto) {

        if (noCamiones < totCamiones) {
            ArrayList<Object> arrayList = new ArrayList<>();

            try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(datosCamiones))) {
                toArrayList(arrayList, entrada);

                if (arrayList.size() == noCamiones) {
                    arrayList.add(new Escolar(marca, numMotor, placas, costoCamion, totalPasaj, lugarProyecto));
                    try (ObjectOutputStream escribe = new ObjectOutputStream(new FileOutputStream(datosCamiones))) {
                        for (int i = 0; i < arrayList.size(); i++)
                            escribe.writeObject(arrayList.get(i));
                        noCamiones++;
                    } catch (Exception e) {
                    }
                }
            } catch (Exception e) {
                arrayList.add(new Escolar(marca, numMotor, placas, costoCamion, totalPasaj, lugarProyecto));
                try (ObjectOutputStream escribe = new ObjectOutputStream(new FileOutputStream(datosCamiones))) {
                    for (int i = 0; i < arrayList.size(); i++)
                        escribe.writeObject(arrayList.get(i));
                    noCamiones++;
                } catch (Exception a) {

                }
            }
        }
    }

    public void altaCamion(String marca, String numMotor, String placas, Double costoCamion, int totalPasaj, boolean asientoCama, boolean serviBar) {

        if (noCamiones < totCamiones) {
            ArrayList<Object> arrayList = new ArrayList<>();

            try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(datosCamiones))) {
                toArrayList(arrayList, entrada);

                if (arrayList.size() == noCamiones) {
                    arrayList.add(new Turismo(marca, numMotor, placas, costoCamion, totalPasaj, asientoCama, serviBar));
                    try (ObjectOutputStream escribe = new ObjectOutputStream(new FileOutputStream(datosCamiones))) {
                        for (int i = 0; i < arrayList.size(); i++)
                            escribe.writeObject(arrayList.get(i));
                        noCamiones++;
                    } catch (Exception e) {
                    }
                }
            } catch (Exception e) {
                arrayList.add(new Turismo(marca, numMotor, placas, costoCamion, totalPasaj, asientoCama, serviBar));
                try (ObjectOutputStream escribe = new ObjectOutputStream(new FileOutputStream(datosCamiones))) {
                    for (int i = 0; i < arrayList.size(); i++)
                        escribe.writeObject(arrayList.get(i));
                    noCamiones++;
                } catch (Exception a) {

                }
            }
        }
    }

    private void toArrayList(ArrayList<Object> arrayList, ObjectInputStream lee) {

        try {
            arrayList.add(lee.readObject());
            toArrayList(arrayList, lee);
        } catch (Exception e) {
        }
    }

    public String getNombreEmp() {
        return nombreEmp;
    }

    public String getDatosCamiones() {
        return datosCamiones;
    }

    public int getTotCamiones() {
        return totCamiones;
    }

    public String toStringCamiones() {
        StringBuilder sb = new StringBuilder();

        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(datosCamiones))) {

            sb.append("=============================================================================================================================================================================================\n");

            toStringCamiones(sb , entrada);

            sb.append("=============================================================================================================================================================================================\n");

        } catch (Exception e) {
            sb.append("ERROR: No hay camiones registrados");
        }

        return sb.toString();
    }

    private void toStringCamiones(StringBuilder sb, ObjectInputStream lee) {
        Object dato;

        try {
            dato = lee.readObject();

            if (dato instanceof Camion)
                sb.append("\t" + dato.toString() + "\n");

            toStringCamiones(sb, lee);
        } catch (Exception e) {
        }
    }
}
