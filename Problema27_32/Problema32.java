package Problema27_32;

import java.nio.file.*;

public class Problema32 {

    public static int noPalabras(String fileName) {
        try {
            return noPalabras(readFileAsString(fileName), 0, 0);
        } catch (Exception e) {
            return -1;
        }
    }

    private static int noPalabras(String str, int i, int suma) {
        if (i < str.length()) {
            if (str.charAt(i) == ' ' && i > 0 && str.charAt(i - 1) != ' ') {
                suma++;
            }
            return noPalabras(str, i + 1, suma);
        }
        else if (i > 0 && str.charAt(i - 1) != ' ')
            return suma + 1;
        else
            return suma;
    }

    private static int noPalabras(String str, int i) {
        if (i < str.length()) {
            if (str.charAt(i) == ' ' && i > 0 && str.charAt(i - 1) != ' ')
                return 1 + noPalabras(str, i + 1);
            else
                return noPalabras(str, i + 1);
        }
        else if (i > 0 && str.charAt(i - 1) != ' ')
            return 1;
        else
            return 0;
    }

    private static String readFileAsString(String fileName) throws Exception {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public static void main(String[] args) throws Exception {
        String data = readFileAsString("C:\\Users\\fvbit\\Documents\\ITAM\\Semestres\\Tercer Semestre\\Materias\\Estructuras de Datos\\IntellijIdea\\Problema27_32\\test.txt");
        System.out.println(data);

        System.out.println(noPalabras("C:\\Users\\fvbit\\Documents\\ITAM\\Semestres\\Tercer Semestre\\Materias\\Estructuras de Datos\\IntellijIdea\\Problema27_32\\test.txt"));
    }
}
