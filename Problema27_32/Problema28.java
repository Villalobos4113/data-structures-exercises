package Problema27_32;

public class Problema28 {
    public static void printArray(int[] arr, int n, String lado) {
        switch (lado) {
            case "izq" -> printArray(arr, n, 0);
            case "der" -> printArray(arr, n);
            default -> System.out.println("Not a valid option");
        }
    }

    private static void printArray(int[] arr, int n, int i) {
        if (i < n) {
            System.out.println(arr[i]);
            printArray(arr, n, i + 1);
        }
    }

    private static void printArray(int[] arr, int n) {
        if (n > 0) {
            System.out.println(arr[n - 1]);
            printArray(arr, n - 1);
        }
    }












    private static void printArray2(int[] arr, int n) {
        if (n > 0) {
            printArray2(arr, n - 1);
            System.out.println(arr[n - 1]);
        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        printArray2(arr, 10);
    }
}
