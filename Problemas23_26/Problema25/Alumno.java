package Problemas23_26.Problema25;

import java.util.Objects;

public class Alumno {

    private String nombre;
    private boolean ingenieria, licenciatura;
    private int edad;
    private double promedio;

    public Alumno(String nombre, boolean ingenieria, boolean licenciatura, int edad, double promedio) {
        this.nombre = nombre;
        this.ingenieria = ingenieria;
        this.licenciatura = licenciatura;
        this.edad = edad;
        this.promedio = promedio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof String) return this.nombre.equals((String) o);
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(getNombre(), alumno.getNombre());
    }

    @Override
    public String toString() {
        String res = "Alumno{" + "nombre='" + nombre + '\'';
        if (ingenieria)
            res += ", Ingeniero";
        if (licenciatura)
            res += ", Licenciado";

        return res + ", edad=" + edad + ", promedio=" + promedio + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre());
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isIngeniero() {
        return ingenieria;
    }

    public boolean isLicenciado() {
        return licenciatura;
    }

    public int getEdad() { return edad; }

    public double getPromedio() { return promedio; }
}
