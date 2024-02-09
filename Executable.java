

public class Executable {
    public static boolean matrizTriangularInferior(Integer[][] matriz, int noRenglones, int noColumnas) {
        if (matriz != null && noRenglones == noColumnas && noRenglones > 0)
            return matrizTriangularInferior(matriz, noRenglones, noColumnas, 1, 0);
        else
            return false;
    }

    public static boolean matrizTriangularInferior(Integer[][] matriz, int noRenglones, int noColumnas, int i, int j) {
        if (i < noRenglones) {
            if (j < i) {
                if (matriz[i][j] != 0)
                    return false;
                return matrizTriangularInferior(matriz, noRenglones, noColumnas, i, j + 1);
            } else
                return matrizTriangularInferior(matriz, noRenglones, noColumnas, i + 1, 0);
        } else
            return true;
    }

    public static void main(String[] args) {
        Integer[][] matriz2 = {{1, 0}, {0, 1}}, mattriz3 = {{}}, matriz4 = {{1, 2, 3}, {0, 1, 2}, {-1, 0, 1}}, matriz5 = {{1, 2, 3}, {0, 1, 2}, {0, 0, 1}};
        System.out.println(matrizTriangularInferior(null, 0, 0));
        System.out.println(matrizTriangularInferior(matriz2, 2, 2));
        System.out.println(matrizTriangularInferior(mattriz3, 0, 0));
        System.out.println(matrizTriangularInferior(matriz4, 3, 3));
        System.out.println(matrizTriangularInferior(matriz5, 3, 3));
    }
}
