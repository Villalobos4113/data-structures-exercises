package Problemas23_26.Problema25;

import Problemas23_26.ArraySet;
import Problemas23_26.SetADT;
import java.util.Iterator;

public class Escuela {

    private String nombre, direccion;
    private SetADT<Alumno> ingenieria, licenciatura;

    public Escuela(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ingenieria = new ArraySet<>();
        this.licenciatura = new ArraySet<>();
    }

    @Override
    public String toString() {
        return "Escuela{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", ingenieria=" + ingenieria +
                ", licenciatura=" + licenciatura +
                '}';
    }

    public void agregaAlumno(String nombre, boolean ingenieria, boolean licenciatura, int edad, double promedio) {
        Alumno alumno = new Alumno(nombre, ingenieria, licenciatura, edad, promedio);

        if (ingenieria)
            this.ingenieria.add(alumno);
        if (licenciatura)
            this.licenciatura.add(alumno);
    }

    public boolean eliminaAlumno(String nombre, boolean ingenieria, boolean licenciatura, int edad, double promedio) {
        boolean res = true;
        Alumno alumno = new Alumno(nombre, ingenieria, licenciatura, edad, promedio);

        if (ingenieria && this.ingenieria.delete(alumno) == null)
                res = false;

        if (licenciatura && this.licenciatura.delete(alumno) == null)
            res = false;

        return res;
    }

    public SetADT<Alumno> todosLosAlumnos() {
        return ingenieria.union(licenciatura);
    }

    public SetADT<Alumno> alumnosIngenieriaYLicenciatura() {
        return ingenieria.intersection(licenciatura);
    }

    public SetADT<Alumno> alumnosIngenieriaOLicenciatura() { return (ingenieria.difference(licenciatura)).union(licenciatura.difference(ingenieria)); }

    public double promedioAlumnosIngenieria() {
        try {
            int res = 0;

            for (Iterator<Alumno> it = ingenieria.iterator(); it.hasNext(); )
                res += it.next().getPromedio();

            return res / ingenieria.size();
        } catch (Exception e) {
            return -1;
        }
    }

    public int noAlumnosMayores(int edad) {
        int res = 0;

        for (Iterator<Alumno> it = licenciatura.iterator(); it.hasNext(); ) {
            if (it.next().getEdad() > edad)
                res++;
        }

        return res;
    }
}
