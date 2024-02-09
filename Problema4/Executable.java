package Problema4;

public class Executable {
    public static void main(String[] args) {
        Empresa miEmpresa = new Empresa("ITAM", "Rio Hondo", "Raul Bailleres Chavez");

        int noAdministrativos = (int)Math.floor(Math.random()*(50-1+1)+1);

        for (int i = 0; i < noAdministrativos; i++) {
            int sueldoBase = (int)Math.floor(Math.random()*(100000-20000+1)+20000);
            miEmpresa.altaEmpleado("Administrativo " + i, sueldoBase, "Administración", "55 3148 5420");
        }

        int noOperarios = (int)Math.floor(Math.random()*(200-1+1)+1);

        for (int i = 0; i < noOperarios; i++) {
            int sueldoBase = (int)Math.floor(Math.random()*(20000-2000+1)+2000);
            int horasExtras = (int)Math.floor(Math.random()*(12+1));
            miEmpresa.altaEmpleado("Operario " + i, sueldoBase, horasExtras);
        }

        System.out.println(miEmpresa.reporteAdministrativo());

        int aumento = (int)Math.floor(Math.random()*(100-1+1)+1);
        miEmpresa.aumentoSueldoAdministrativo(100, aumento);

        System.out.println(miEmpresa.reporteAdministrativo());

        System.out.println(miEmpresa.reporteOperarios(15000));
    }
}
