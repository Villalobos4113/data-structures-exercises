package Problema27_32;

public class Problema27 {
    public static int sumArray(int[] arr, int i) {
        if (i <= 0)
            return 0;
        else
            return arr[i - 1] + sumArray(arr, i - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(sumArray(arr, 10));
    }
}
