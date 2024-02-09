package Problemas23_26.Problema25;

import Datai.Datai;
import Ranrandom.Ranrandom;
import java.util.Iterator;

public class Executable {

    public static void agregaAlumnos(Escuela escuela, int noAlumnos) {
        Boolean[] booleans = {true, false};
        boolean ingenieria;

        for (int i = 0; i < noAlumnos; i++) {
            ingenieria = Ranrandom.choice(booleans, 2);

            if (ingenieria)
                escuela.agregaAlumno(Datai.name(), ingenieria, Ranrandom.choice(booleans, 2), Ranrandom.randInt(18, 30), Ranrandom.randInt(60, 100));
            else
                escuela.agregaAlumno(Datai.name(), ingenieria, true, Ranrandom.randInt(18, 30), Ranrandom.randInt(60, 100));
        }
    }

    public static <T> String toStringIterator(Iterator<T> it, String pre, String post) {
        StringBuilder sb = new StringBuilder();

        for (Iterator<T> i = it; i.hasNext(); )
            sb.append(pre + i.next() + post);

        return sb.toString();
    }

    public static void main(String[] args) {
        Escuela escuela = new Escuela("ITAM", "Rio Hondo");

        System.out.println("\n===== Alta Alumno =====");
        escuela.agregaAlumno("Marcy Copeland Zamora", true, true, 18, 9.63);
        System.out.println(escuela);

        System.out.println("\n===== Baja Alumno =====");
        System.out.println("Verificador de baja = " + escuela.eliminaAlumno("Marcy Copeland Zamora", true, true, 18, 9.63));
        System.out.println(escuela);

        agregaAlumnos(escuela, Ranrandom.randInt(10, 101));

        System.out.println("\n===== Todos Los Alumnos =====");
        System.out.println(toStringIterator(escuela.todosLosAlumnos().iterator(), "\t", "\n"));

        System.out.println("\n===== Alumnos Ingenieria y Licenciatura =====");
        System.out.println(toStringIterator(escuela.alumnosIngenieriaYLicenciatura().iterator(), "\t", "\n"));

        System.out.println("\n===== Alumnos Ingenieria o Licenciatura =====");
        System.out.println(toStringIterator(escuela.alumnosIngenieriaOLicenciatura().iterator(), "\t", "\n"));

        System.out.println("\n===== Promedio Alumnos Ingenieria =====");
        System.out.println("\t" + escuela.promedioAlumnosIngenieria());

        System.out.println("\n===== Alumnos Licenciatura Mayores a 20 =====");
        System.out.println("\t" + escuela.noAlumnosMayores(20));
    }
}
