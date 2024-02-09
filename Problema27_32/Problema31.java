package Problema27_32;

public class Problema31 {
    public static void main(String[] args) {
        double[][] matriz = {{7, 48, 5}, {84, 9, 4}, {4, 9, 5}}, matriz1 = {{78, 5, 9}, {8, 51, 4}, {84, 9, 84}}, matriz2 = {{1, -2, 3}, {1, 0, -1}}, matriz3 = {{4}, {5}, {6}};

        /*
        System.out.println(OperacionesArregloBidimencional.sumaPorRenglon(matriz, 3, 3));
        System.out.println(OperacionesArregloBidimencional.sumaPorColumna(matriz, 3, 3));
        System.out.println(OperacionesArregloBidimencional.toString(matriz, 3, 3));
        System.out.println(OperacionesArregloBidimencional.sumaDiagonalPrincipal(matriz, 3, 3));
        System.out.println(OperacionesArregloBidimencional.toString(OperacionesArregloBidimencional.sumaMatrices(matriz, matriz1, 3, 3, 3, 3), 3, 3));
        System.out.println(OperacionesArregloBidimencional.toString(OperacionesArregloBidimencional.restaMatrices(matriz, matriz1, 3, 3, 3, 3), 3, 3));
        System.out.println(OperacionesArregloBidimencional.toString(OperacionesArregloBidimencional.multiplicacionMatrices(matriz2, matriz3, 2, 3, 3, 1), 2, 1));
        System.out.println(OperacionesArregloBidimencional.toString(null, 0, 0));

         */

        System.out.println(OperacionesArregloBidimencional.toString(matriz2, 2, 3));
        System.out.println("*");
        System.out.println(OperacionesArregloBidimencional.toString(matriz3, 3, 1));
        System.out.println("=");
        System.out.println(OperacionesArregloBidimencional.toString(OperacionesArregloBidimencional.multiplicacionMatrices(matriz2, matriz3, 2, 3, 3, 1), 2, 1));
    }
}
