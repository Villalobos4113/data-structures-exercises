package Problema11;

import java.io.*;
import java.util.Scanner;

public class Executable {
    public static void writeTest(EmpTransp empTransp) {

        for (int i = 0; i < empTransp.getTotCamiones(); i++) {
            switch ((int) (Math.random() * 2)) {
                case 0 -> empTransp.altaCamion(marcaRandom(), numMotorRandom(), placasRandom(), 1000000 + (Math.random() * 3000000), (int) (10 + (Math.random() * 50)), booleanRandom(), booleanRandom());
                default -> empTransp.altaCamion(marcaRandom(), numMotorRandom(), placasRandom(), 1000000 + (Math.random() * 3000000), (int) (10 + (Math.random() * 30)), booleanRandom());
            }
        }

    }

    public static String marcaRandom() {
        String[] marcas = {"Freightliner", "Kenworth", "International", "Isuzu", "Mercedes-Benz", "Scania", "Volvo"};

        return marcas[(int) (Math.random() * 7)];
    }

    public static String numMotorRandom() {
        String[] num = {"6","8"};

        return "V" + num[(int) (Math.random() * 2)];
    }

    public static String placasRandom() {
        String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"}, num = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        String resp = "";

        for (int i = 0; i < 3; i++)
            resp += letras[(int) (Math.random() * 26)];

        resp += "-";

        for (int i = 0; i < 3; i++)
            resp += num[(int) (Math.random() * 10)];

        return resp;
    }

    public static boolean booleanRandom() {
        return (int) (Math.random() * 2) == 1;
    }

    public static void main(String[] args) {
        EmpTransp empTransp = new EmpTransp("COTREP", (int) (1 + (Math.random() * 101)));

        writeTest(empTransp);

        System.out.println(empTransp.toStringCamiones());

        System.out.println("\n==============================\nPrimer Requisito\n==============================\n");

        System.out.println(empTransp.camionesDisponibles('T', 35, 250));

        System.out.println("\n==============================\nSegundo Requisito\n==============================\n");

        System.out.println(empTransp.satisfaceDemanda('E', 25, 5));

        System.out.println("\n==============================\nTercer Requisito\n==============================\n");

        Scanner myObj = new Scanner(System.in);
        System.out.println("Placas = ");

        String placas = myObj.nextLine();

        System.out.println("\n" + empTransp.camionDisponible(placas));

        System.out.println("\n==============================\nCuarto Requisito\n==============================\n");

        System.out.println(empTransp.camionesEscolaresProyectos());

        System.out.println("\n==============================\nQuinto Requisito\n==============================\n");

        System.out.println(empTransp.totCamiones("Volvo", 250, 350));

        System.out.println("\n==============================\nSexto Requisito\n==============================\n");

        System.out.println(empTransp.escribirEmpresa());
    }
}
