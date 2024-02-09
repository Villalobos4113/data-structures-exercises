package Problema1;

import java.util.Scanner;

public class Executable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Problema1.ComplejoVacacional miComplejoVacacional = new Problema1.ComplejoVacacional("Hotel Inn", 2);
        int i = 0;

        while (!(miComplejoVacacional.isFull())) {
            i++;
            System.out.println("Alberca " + i);
            System.out.println("  Lado 1: ");
            double lado1 = scanner.nextDouble();
            System.out.println("  Lado 2: ");
            double lado2 = scanner.nextDouble();
            System.out.println("");
            miComplejoVacacional.addAlb(lado1, lado2);
        }

        System.out.println("Se necesita un total de " + miComplejoVacacional.totalAreaAlb() + " metros cuadrados de lona.");
        System.out.println("Se necesita un total de " + miComplejoVacacional.totalPerimetro() + " metros de cerca.");
    }
}