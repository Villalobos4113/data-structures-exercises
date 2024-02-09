package Problema4;

import java.util.Objects;

public class Empleado {

    private static int serie = 100;
    private int claveEmpleado;
    private String nombreEmpleado;
    private double sueldoBase;

    public Empleado() {
        this.claveEmpleado = serie;
        serie++;
    }

    public Empleado(String nombreEmpleado, double sueldoBase) {
        this.claveEmpleado = serie;
        this.nombreEmpleado = nombreEmpleado;
        this.sueldoBase = sueldoBase;

        serie++;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public int getClaveEmpleado() {
        return claveEmpleado;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    @Override
    public String toString() {
        return "Empleado {" +
                "claveEmpleado = " + claveEmpleado +
                ", nombreEmpleado = '" + nombreEmpleado + '\'' +
                ", sueldoBase = " + sueldoBase +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return claveEmpleado == empleado.claveEmpleado && Double.compare(empleado.getSueldoBase(), getSueldoBase()) == 0 && Objects.equals(getNombreEmpleado(), empleado.getNombreEmpleado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(claveEmpleado, getNombreEmpleado(), getSueldoBase());
    }

    public double calculaSalario(double prestac, double deduc) {
        return this.sueldoBase + (this.sueldoBase * (prestac / 100)) - (this.sueldoBase * (deduc / 100));
    }
}
