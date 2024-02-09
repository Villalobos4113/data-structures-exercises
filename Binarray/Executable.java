package Binarray;

import java.util.ArrayList;
import java.util.Arrays;

public class Executable {
    public static void main(String[] args) {
        String[] array = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"},
                array1 = {}, array2 = {"A"}, array3 = {"A", "B"}, array4 = {"A", "B", "C"}, array5 = {"Start", null, null, null};

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");

        Binarray.reverse(array1, array1.length);
        System.out.println(Binarray.toString(array1, array1.length));

        Binarray.reverse(array2, array2.length);
        System.out.println(Binarray.toString(array2, array2.length));

        Binarray.reverse(array3, array3.length);
        System.out.println(Binarray.toString(array3, array3.length));

        Binarray.reverse(array4, array4.length);
        System.out.println(Binarray.toString(array4, array4.length));

        Binarray.reverse(array, array.length);
        System.out.println(Binarray.toString(array, array.length));

        Binarray.clear(array, array.length);
        System.out.println(Binarray.toString(array, array.length));

        Binarray.extend(array5, 1, arrayList.iterator());
        System.out.println(Binarray.toString(array5, array5.length));
    }
}