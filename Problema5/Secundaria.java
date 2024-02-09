package Problema5;

import java.util.Arrays;

public class Secundaria extends Estudiante{

    private String escuelaDeProcedencia, grado, actArtDep;
    private double promedioAnioAnterior;
    private double[] calificaciones;
    private int noCalificaciones = 0;

    public Secundaria() {
        this.calificaciones = new double[5];
    }

    public Secundaria(String nombre, String curp, String fechaDeNacimiento, String nombreMadre, String nombrePadre, String nombreTutor, String escuelaDeProcedencia, String grado, String actArtDep, double promedioAnioAnterior) {
        super(nombre, curp, fechaDeNacimiento, nombreMadre, nombrePadre, nombreTutor);
        this.escuelaDeProcedencia = escuelaDeProcedencia;
        this.grado = grado;
        this.actArtDep = actArtDep;
        this.promedioAnioAnterior = promedioAnioAnterior;
    }

    public String getEscuelaDeProcedencia() {
        return escuelaDeProcedencia;
    }

    public double getPromedioAnioAnterior() {
        return promedioAnioAnterior;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getActArtDep() {
        return actArtDep;
    }

    public void setActArtDep(String actArtDep) {
        this.actArtDep = actArtDep;
    }

    @Override
    public String toString() {
        return "Secundaria {" +
                "escuelaDeProcedencia = '" + escuelaDeProcedencia + '\'' +
                ", grado = '" + grado + '\'' +
                ", actArtDep = '" + actArtDep + '\'' +
                ", promedioAnioAnterior = " + promedioAnioAnterior +
                ", calificaciones = " + Arrays.toString(calificaciones) +
                ", " + super.toString() +
                '}';
    }

    public boolean altaCalificacion(double calificacion) {
        if (noCalificaciones < 5) {
            calificaciones[noCalificaciones] = calificacion;
            noCalificaciones++;
            return true;
        }

        return false;
    }
}
