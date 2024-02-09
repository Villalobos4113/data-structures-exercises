package Problema3;

import java.util.Arrays;
import java.util.Objects;

public class Alumno {

    private static int serie = 100;
    private int claveUnica, totalCalif;
    private String nombreAlum;
    private double [] califMateriasAprob;
    private final int MAX_CALIF = 50;

    public Alumno() {
        this.califMateriasAprob = new double[MAX_CALIF];
    }

    public Alumno(String nombreAlum) {
        this();
        this.nombreAlum = nombreAlum;
        this.claveUnica = serie;
        serie++;
    }

    public String getNombreAlum() {
        return nombreAlum;
    }

    public int getClaveUnica() {
        return claveUnica;
    }

    public int getTotalCalif() {
        return totalCalif;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return getClaveUnica() == alumno.getClaveUnica() && Objects.equals(getNombreAlum(), alumno.getNombreAlum());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClaveUnica(), getNombreAlum());
    }

    @Override
    public String toString() {
        return "Alumno {" +
                "claveUnica = " + claveUnica +
                ", totalCalif = " + totalCalif +
                ", nombreAlum = '" + nombreAlum + '\'' +
                ", califMateriasAprob = " + Arrays.toString(califMateriasAprob) +
                '}';
    }

    public boolean altaCalificacion(double calificacion) {
        if (totalCalif < MAX_CALIF) {
            califMateriasAprob[totalCalif] = calificacion;
            totalCalif++;
            return true;
        } else
            return false;
    }

    public double calcularPromedio() {
        if (totalCalif > 0) {
            double resp = 0;

            for (int i = 0; i <= totalCalif; i++)
                resp += califMateriasAprob[i];

            return resp / totalCalif;
        } else
            return -1;
    }
}
