package Problema6;

import Problema4.Empleado;

public class Administrativo extends Empleado {

    private String departamento, telefono;

    public Administrativo() {
    }

    public Administrativo(String nombreEmpleado, double sueldoBase, String departamento, String telefono) {
        super(nombreEmpleado, sueldoBase);
        this.departamento = departamento;
        this.telefono = telefono;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Administrativo {" +
                "departamento = '" + departamento + '\'' +
                ", telefono = '" + telefono + '\'' +
                ", " + super.toString() +
                '}';
    }
}
