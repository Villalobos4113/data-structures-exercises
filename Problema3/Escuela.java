package Problema3;

import java.util.ArrayList;
import java.util.Objects;

public class Escuela {

    private String nombre, direccion;
    private int numAlumnos;
    private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

    public Escuela(String nombre, String direccion, int numAlumnos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numAlumnos = numAlumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNumAlumnos() {
        return numAlumnos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Escuela escuela = (Escuela) o;
        return getNumAlumnos() == escuela.getNumAlumnos() && Objects.equals(getNombre(), escuela.getNombre()) && Objects.equals(getDireccion(), escuela.getDireccion()) && Objects.equals(alumnos, escuela.alumnos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getDireccion(), getNumAlumnos(), alumnos);
    }

    @Override
    public String toString() {
        return "Escuela{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", numAlumnos=" + numAlumnos +
                ", alumnos=" + alumnos.toString() +
                '}';
    }

    private Alumno busqueda(int claveUnica) {
        if (alumnos.size() > 0) {
            for (int i = 0; i < alumnos.size(); i++) {
                if (alumnos.get(i).getClaveUnica() == claveUnica)
                    return alumnos.get(i);
            }
        }

        return null;
    }

    public boolean altaAlumno(String nombreAlum) {
        if (alumnos.size() < numAlumnos) {
            Alumno alumno = new Alumno(nombreAlum);
            alumnos.add(alumno);
            return true;
        } else
            return false;
    }

    public boolean altaCalificacionAlumno(int claveUnica, double calificacion) {
        Alumno alumno = busqueda(claveUnica);

        if (alumno != null && alumno.altaCalificacion(calificacion))
            return true;
        else
            return false;
    }

    public String buscaAlumno(int claveUnica) {
        Alumno alumno = busqueda(claveUnica);

        if (alumno != null)
            return alumno.toString();
        else
            return "Not found";
    }

    public String promedioAlumnos() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < alumnos.size(); i++) {
            sb.append(alumnos.get(i).getNombreAlum() + ": " + alumnos.get(i).calcularPromedio() + "\n");
        }

        return sb.toString();
    }

    public String alumMayorNumMateriasAprob() {
        if (alumnos.size() > 0) {
            ArrayList<Alumno> alumnos_mayor = new ArrayList<Alumno>();
            alumnos_mayor.add(alumnos.get(0));

            for (int i = 1; i < alumnos.size(); i++) {
                if (alumnos.get(i).getTotalCalif() > alumnos_mayor.get(0).getTotalCalif()) {
                    alumnos_mayor.clear();
                    alumnos_mayor.add(alumnos.get(i));
                }

                if (alumnos.get(i).getTotalCalif() == alumnos_mayor.get(0).getTotalCalif())
                    alumnos_mayor.add(alumnos.get(i));
            }

            return alumnos_mayor.toString();
        } else
            return "No hay alumnos";
    }
}