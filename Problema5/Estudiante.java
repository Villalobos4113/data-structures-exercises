package Problema5;

import java.util.Objects;

public class Estudiante {

    private String nombre, curp, fechaDeNacimiento, nombreMadre, nombrePadre, nombreTutor;

    public Estudiante() {
    }

    public Estudiante(String nombre, String curp, String fechaDeNacimiento, String nombreMadre, String nombrePadre, String nombreTutor) {
        this.nombre = nombre;
        this.curp = curp;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.nombreMadre = nombreMadre;
        this.nombrePadre = nombrePadre;
        this.nombreTutor = nombreTutor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCurp() {
        return curp;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public String getNombreMadre() {
        return nombreMadre;
    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public String getNombreTutor() {
        return nombreTutor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante that = (Estudiante) o;
        return Objects.equals(getCurp(), that.getCurp());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCurp());
    }

    @Override
    public String toString() {
        return "Estudiante {" +
                "nombre = '" + nombre + '\'' +
                ", curp = '" + curp + '\'' +
                ", fechaDeNacimiento = '" + fechaDeNacimiento + '\'' +
                ", nombreMadre = '" + nombreMadre + '\'' +
                ", nombrePadre = '" + nombrePadre + '\'' +
                ", nombreTutor = '" + nombreTutor + '\'' +
                '}';
    }
}
