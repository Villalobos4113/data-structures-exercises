package Problema5;

import java.util.Arrays;

public class Primaria extends Estudiante{

    private String escuelaDeProcedencia, grado;
    private double promedioAnioAnterior;
    private double[] calificaciones;
    private int noCalificaciones = 0;

    public Primaria() {
        this.calificaciones = new double[5];
    }

    public Primaria(String nombre, String curp, String fechaDeNacimiento, String nombreMadre, String nombrePadre, String nombreTutor, String escuelaDeProcedencia, String grado, double promedioAnioAnterior) {
        super(nombre, curp, fechaDeNacimiento, nombreMadre, nombrePadre, nombreTutor);
        this.escuelaDeProcedencia = escuelaDeProcedencia;
        this.grado = grado;
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

    @Override
    public String toString() {
        return "Primaria {" +
                "escuelaDeProcedencia = '" + escuelaDeProcedencia + '\'' +
                ", grado = '" + grado + '\'' +
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
