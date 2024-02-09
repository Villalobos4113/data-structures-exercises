package Problema6;

import java.util.Objects;

public abstract class Empleado {

    private static int serie = 100;
    private int claveEmpleado;
    private String nombreEmpleado;
    protected double sueldoBase;

    protected Empleado() {
        this.claveEmpleado = serie;
        serie++;
    }

    protected Empleado(String nombreEmpleado, double sueldoBase) {
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
        return getClaveEmpleado() == empleado.getClaveEmpleado();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClaveEmpleado());
    }
}
