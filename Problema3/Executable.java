package Problema3;

public class Executable {
    public static void main(String[] args) {
        Escuela miEscuela = new Escuela("ITAM", "Río Hondo", 3);

        // Alta Primer Alumno

        miEscuela.altaAlumno("Alumno 1");

        int totalMaterias = (int) (Math.random()*(49)) + 1;

        for (int i = 0; i < totalMaterias; i++)
            miEscuela.altaCalificacionAlumno(100, (int) (Math.random()*(40) + 60));

        // Alta Segundo Alumno

        miEscuela.altaAlumno("Alumno 2");

        totalMaterias = (int) (Math.random()*(49)) + 1;

        for (int i = 0; i < totalMaterias; i++)
            miEscuela.altaCalificacionAlumno(101, (int) (Math.random()*(40) + 60));

        // Alta Tercer Alumno

        miEscuela.altaAlumno("Alumno 3");

        totalMaterias = (int) (Math.random()*(49)) + 1;

        for (int i = 0; i < totalMaterias; i++)
            miEscuela.altaCalificacionAlumno(102, (int) (Math.random()*(40) + 60));

        // Busqueda Alumnos

        System.out.println(miEscuela.buscaAlumno(100));
        System.out.println(miEscuela.buscaAlumno(101));
        System.out.println(miEscuela.buscaAlumno(102));
        System.out.println(miEscuela.buscaAlumno(103));

        // Promedio Alumnos

        System.out.println("\n" + miEscuela.promedioAlumnos());

        // Alumno Mayor Numero Materias Aprobadas

        System.out.println(miEscuela.alumMayorNumMateriasAprob());
    }
}
