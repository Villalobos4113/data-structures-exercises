package Problema5;

import java.util.Arrays;

public class Preparatoria extends Estudiante{

    private String escuelaDeProcedencia, grado, especializacion;
    private double promedioAnioAnterior;
    private double[] calificaciones;
    private int noCalificaciones = 0;

    public Preparatoria() {
        this.calificaciones = new double[5];
    }

    public Preparatoria(String nombre, String curp, String fechaDeNacimiento, String nombreMadre, String nombrePadre, String nombreTutor, String escuelaDeProcedencia, String grado, String especializacion, double promedioAnioAnterior) {
        super(nombre, curp, fechaDeNacimiento, nombreMadre, nombrePadre, nombreTutor);
        this.escuelaDeProcedencia = escuelaDeProcedencia;
        this.grado = grado;
        this.especializacion = especializacion;
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

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    @Override
    public String toString() {
        return "Preparatoria {" +
                "escuelaDeProcedencia = '" + escuelaDeProcedencia + '\'' +
                ", grado = '" + grado + '\'' +
                ", especializacion = '" + especializacion + '\'' +
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
