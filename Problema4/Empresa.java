package Problema4;

import java.util.ArrayList;
import java.util.Arrays;

public class Empresa {

    private String nombre, direccion, dueno;
    private ArrayList<Administrativo> administrativos = new ArrayList<Administrativo>();
    private ArrayList<Operario> operarios = new ArrayList<Operario>();

    public Empresa(String nombre, String direccion, String dueno) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.dueno = dueno;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", dueno='" + dueno + '\'' +
                ", administrativos=" + administrativos +
                ", operarios=" + operarios +
                '}';
    }

    public void altaEmpleado(String nombreEmpleado, double sueldoBase, String departamento, String telefono) {
        Administrativo administrativo = new Administrativo(nombreEmpleado, sueldoBase, departamento, telefono);
        this.administrativos.add(administrativo);
    }

    public void altaEmpleado(String nombreEmpleado, double sueldoBase, int horasExtras) {
        Operario operario = new Operario(nombreEmpleado, sueldoBase, horasExtras);
        this.operarios.add(operario);
    }

    public String reporteAdministrativo() {
        StringBuilder sb = new StringBuilder();

        sb.append("============================================================\nReporte Administrativo\n============================================================\n");

        for (int i = 0; i < this.administrativos.size(); i++)
            sb.append("    Nombre: " + this.administrativos.get(i).getNombreEmpleado() + ", Sueldo: " + this.administrativos.get(i).getSueldoBase() + "\n");

        sb.append("============================================================");

        return sb.toString();
    }

    public boolean aumentoSueldoAdministrativo(int claveEmpleado, double aumento) {
        for (int i = 0; i < this.administrativos.size(); i++) {
            if (this.administrativos.get(i).getClaveEmpleado() == claveEmpleado) {
                this.administrativos.get(i).setSueldoBase(this.administrativos.get(i).getSueldoBase() * ((aumento/100) + 1));
                return true;
            }
        }

        return false;
    }

    public boolean cambioDepartamentoAdministrativo(int claveEmpleado, String departamento) {
        for (int i = 0; i < this.administrativos.size(); i++) {
            if (this.administrativos.get(i).getClaveEmpleado() == claveEmpleado) {
                this.administrativos.get(i).setDepartamento(departamento);
                return true;
            }
        }

        return false;
    }

    public double salarioOperario(int claveEmpleado, double prestac, double deduc, double precioHE) {
        for (int i = 0; i < this.operarios.size(); i++) {
            if (this.operarios.get(i).getClaveEmpleado() == claveEmpleado)
                return this.operarios.get(i).calculaSalario(prestac, deduc, precioHE);
        }

        return -1;
    }

    public String reporteOperarios(double maxSueldoBase) {
        StringBuilder sb = new StringBuilder();
        int noOperarios = 0;

        sb.append("============================================================\nReporte Operario\n============================================================\n");

        for (int i = 0; i < this.operarios.size(); i++) {
            if (this.operarios.get(i).getSueldoBase() < maxSueldoBase) {
                sb.append("    Nombre: " + this.operarios.get(i).getNombreEmpleado() + "\n");
                noOperarios++;
            }
        }

        sb.append("\n  No. Operarios: " + noOperarios + "\n============================================================");
        return sb.toString();
    }
}
