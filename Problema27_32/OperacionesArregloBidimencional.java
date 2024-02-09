package Problema27_32;

public class OperacionesArregloBidimencional {

    // Suma Por Renglón

    public static double sumaPorRenglon(double [][] matriz, int renglones, int columnas) {
        return sumaPorRenglon(matriz, renglones, columnas, 0, 0);
    }

    private static double sumaPorRenglon(double [][] matriz, int renglones, int columnas, int j, double suma) {
        if (renglones == 0)
            return suma;

        if (j < columnas) {
            suma += matriz[renglones - 1][j];
            return sumaPorRenglon(matriz, renglones, columnas, j + 1, suma);
        } else
            return sumaPorRenglon(matriz, renglones - 1, columnas, 0, suma);
    }

    // Suma Por Columna

    public static double sumaPorColumna(double[][] matriz, int renglones, int columnas) {
        return sumaPorColumna(matriz, renglones, columnas, 0, 0);
    }

    private static double sumaPorColumna(double[][] matriz, int renglones, int columnas, int i, double suma) {
        if (columnas == 0)
            return suma;

        if (i < renglones) {
            suma += matriz[i][columnas - 1];
            return sumaPorColumna(matriz, renglones, columnas, i + 1, suma);
        } else
            return sumaPorColumna(matriz, renglones, columnas - 1, 0, suma);
    }

    // To String

    public static String toString(double[][] matriz, int renglones, int columnas) {
        if (matriz != null)
            return "[" + toString(matriz, renglones, columnas, 0, 0) + "]";
        return "[]";
    }

    private static String toString(double[][] matriz, int renglones, int columnas, int i, int j) {
        if (columnas == 1) {
            if (i == renglones - 1)
                return "[" + matriz[i][j] + "]";
            else
                return "[" + matriz[i][j] + "], " + toString(matriz, renglones, columnas, i + 1, 0);
        }
        else if (j < columnas - 1) {
            if (j == 0)
                return "[" + matriz[i][j] + ", " + toString(matriz, renglones, columnas, i, j + 1);
            else
                return matriz[i][j] + ", " + toString(matriz, renglones, columnas, i, j + 1);
        }
        else {
            if (i == renglones - 1)
                return matriz[i][j] + "]";
            else
                return matriz[i][j] + "], " + toString(matriz, renglones, columnas, i + 1, 0);
        }
    }

    public static String toString2(double[][] matriz, int renglones, int columnas) {
        if (matriz != null)
            return toString2(matriz, renglones, columnas, 0, 0);
        return "[]";
    }

    private static String toString2(double[][] matriz, int renglones, int columnas, int i, int j) {
        if (columnas == 1) {
            if (i == renglones - 1)
                return "\n" + matriz[i][j] + "\n";
            else
                return matriz[i][j] + "\t" + toString2(matriz, renglones, columnas, i + 1, 0);
        }
        else if (j < columnas - 1) {
            if (j == 0)
                return "\n" + matriz[i][j] + "\t" + toString2(matriz, renglones, columnas, i, j + 1);
            else
                return matriz[i][j] + "\t" + toString2(matriz, renglones, columnas, i, j + 1);
        }
        else {
            if (i == renglones - 1)
                return matriz[i][j] + "\n";
            else
                return matriz[i][j] + "\t" + toString2(matriz, renglones, columnas, i + 1, 0);
        }
    }

    // Suma Diagonal Principal

    public static double sumaDiagonalPrincipal(double[][] matriz, int renglones, int columnas) {
        if (renglones == columnas) {
             return sumaDiagonalPrincipal(matriz, renglones, 0.0);
        } else
            throw new RuntimeException();
    }

    private static double sumaDiagonalPrincipal(double[][] matriz, int i, double suma) {
        if (i > 0) {
            suma += matriz[i - 1][i - 1];
            return sumaDiagonalPrincipal(matriz, i - 1, suma);
        }
        else
            return suma;
    }

    // Suma y Resta Matriz

    public static double[][] sumaMatrices(double[][] matrizA, double[][] martizB, int renglonesA, int columnasA, int renglonesB, int columnasB) {
        if (renglonesA == renglonesB && columnasA == columnasB) {
            double[][] matrizAux = new double[renglonesA][columnasA];

            return sumaMatrices(matrizA, martizB, matrizAux, renglonesA, columnasA, 0);
        } else
            return null;
    }

    private static double[][] sumaMatrices(double[][] matrizA, double[][] matrizB, double[][] matrizAux, int renglones, int columnas, int j) {
        if (renglones == 0) {
            return matrizAux;
        }

        if (j < columnas) {
            matrizAux[renglones - 1][j] = matrizA[renglones - 1][j] + matrizB[renglones - 1][j];
            return sumaMatrices(matrizA, matrizB, matrizAux, renglones, columnas, j + 1);
        } else
            return sumaMatrices(matrizA, matrizB, matrizAux, renglones - 1, columnas, 0);
    }

    public static double[][] restaMatrices(double[][] matrizA, double[][] martizB, int renglonesA, int columnasA, int renglonesB, int columnasB) {
        if (renglonesA == renglonesB && columnasA == columnasB) {
            double[][] matrizAux = new double[renglonesA][columnasA];

            return restaMatrices(matrizA, martizB, matrizAux, renglonesA, columnasA, 0);
        } else
            return null;
    }

    private static double[][] restaMatrices(double[][] matrizA, double[][] matrizB, double[][] matrizAux, int renglones, int columnas, int j) {
        if (renglones == 0) {
            return matrizAux;
        }

        if (j < columnas) {
            matrizAux[renglones - 1][j] = matrizA[renglones - 1][j] - matrizB[renglones - 1][j];
            return restaMatrices(matrizA, matrizB, matrizAux, renglones, columnas, j + 1);
        } else
            return restaMatrices(matrizA, matrizB, matrizAux, renglones - 1, columnas, 0);
    }

    // Multiplicación Matrices

    public static double[][] multiplicacionMatrices(double[][] matrizA, double[][] martizB, int renglonesA, int columnasA, int renglonesB, int columnasB) {
        if (columnasA == renglonesB) {
            double[][] matrizAux = new double[renglonesA][columnasB];

            return multiplicacionMatrices(matrizA, martizB, matrizAux, renglonesA, columnasA, renglonesB, columnasB, 0, 0);
        } else
            return null;
    }

    private static double[][] multiplicacionMatrices(double[][] matrizA, double[][] matrizB, double[][] matrizAux, int renglonesA, int columnasA, int renglonesB, int columnasB, int i, int j) {
        if (i >= renglonesA)
            return matrizAux;

        if (j < columnasB) {
            matrizAux[i][j] = multiplicacionMatrices(matrizA, matrizB, renglonesB, columnasA, i, j, 0);
            return multiplicacionMatrices(matrizA, matrizB, matrizAux, renglonesA, columnasA, renglonesB, columnasB, i, j + 1);
        } else
            return multiplicacionMatrices(matrizA, matrizB, matrizAux, renglonesA, columnasA, renglonesB, columnasB, i + 1, 0);
    }

    private static double multiplicacionMatrices(double[][] matrizA, double[][] matrizB, int renglonesB, int columnasA, int renglonA, int columnaB, int suma) {
        if (renglonesB == 0 || columnasA == 0)
            return suma;
        else
            suma += matrizA[renglonA][columnasA - 1] * matrizB[renglonesB - 1][columnaB];
        return multiplicacionMatrices(matrizA, matrizB, renglonesB - 1, columnasA - 1, renglonA, columnaB, suma);
    }
}
