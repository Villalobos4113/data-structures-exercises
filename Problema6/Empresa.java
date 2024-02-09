package Problema6;

import java.util.ArrayList;
import java.util.Objects;

public class Empresa {

    private String nombre, direccion, dueno;
    private Empleado[] empleados;
    private int noEmpleados = 0;
    private int MAXEMPLEADOS = 25;

    public Empresa() {
        this.empleados = new Empleado[MAXEMPLEADOS];
    }

    public Empresa(String nombre, String direccion, String dueno) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.dueno = dueno;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDueno() {
        return dueno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return Objects.equals(getNombre(), empresa.getNombre()) && Objects.equals(getDireccion(), empresa.getDireccion()) && Objects.equals(getDueno(), empresa.getDueno());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getDireccion(), getDueno());
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", dueno='" + dueno + '\'' +
                ", empleados=" + empleados +
                '}';
    }

    public boolean altaEmpleado(String nombreEmpleado, double sueldoBase, String departamento, String telefono) {
        return true;
    }
}
