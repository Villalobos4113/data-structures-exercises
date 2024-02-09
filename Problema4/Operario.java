package Problema4;

public class Operario extends Empleado{

    private int horasExtras;

    public Operario() {
    }

    public Operario(String nombreEmpleado, double sueldoBase, int horasExtras) {
        super(nombreEmpleado, sueldoBase);
        this.horasExtras = horasExtras;
    }

    @Override
    public String toString() {
        return "Operario {" +
                "horasExtras = " + horasExtras +
                ", " + super.toString() +
                '}';
    }

    public double calculaSalario(double prestac, double deduc, double precioHE) {
        return getSueldoBase() + (getSueldoBase() * (prestac / 100)) + (this.horasExtras * precioHE) - (getSueldoBase() * (deduc / 100));
    }
}
