package Ranrandom;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Executable {
    public static <T> T[] copy(T[] array, int noElements) {
        if (noElements > 0) {
            T[] auxArray = (T[]) Array.newInstance(array[0].getClass(), noElements);

            for (int i = 0; i < noElements; i++)
                auxArray[i] = array[i];

            return auxArray;
        } else
            return null;
    }

    public static <T> String toString(T[] array, int noElements) {
        StringBuilder sb = new StringBuilder();

        if (noElements != 0) {
            sb.append("[");

            for (int i = 0; i < noElements - 1; i++)
                sb.append(array[i] + ", ");

            sb.append(array[noElements - 1] + "]");
        } else
            sb.append("[]");

        return sb.toString();
    }

    public static void main(String[] args) {

        String[] array = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        try {
            String[] array1 = (String[]) copy(array, array.length);
            System.out.println("\nSe guarda en String[]");
            System.out.println("Class" + array1.getClass().getSimpleName());
            System.out.println(toString(array1, array1.length));

        } catch (Exception e) {
            Object[] array1 = copy(array, array.length);
            System.out.println("\nSe guarda en Object[]");
            System.out.println("Class" + array1.getClass().getSimpleName());
            System.out.println(toString(array1, array1.length));
        }

        // Lo que quiero saber es si existe la posibilidad de que el metodo copy() regrese el array en tipo T en lugar de en Object

        Object[] array2 = Ranrandom.choices(array, array.length);
        System.out.println(toString(array2, array2.length));
        System.out.println(array2.getClass().getSimpleName());
    }
}
