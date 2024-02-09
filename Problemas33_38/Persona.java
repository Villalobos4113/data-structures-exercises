package Problemas33_38;

import Datai.Datai;

public class Persona {

    private String nombre, fechaNac;
    private int edad;

    public Persona() {
        String[] person = Datai.fullPerson();

        this.nombre = person[0];
        this.fechaNac = person[4];
        this.edad = Integer.parseInt(person[3]);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", fechaNac='" + fechaNac + '\'' +
                ", edad=" + edad +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public int getEdad() {
        return edad;
    }
}
