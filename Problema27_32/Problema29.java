package Problema27_32;

import Ranrandom.Ranrandom;

public class Problema29 {

    public static void main(String[] args) {

        ArregloGenerico<String> arregloGenerico = new ArregloGenerico<>();

        String[] array = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        Ranrandom.shuffle(array, array.length);

        for (String str : array)
            arregloGenerico.add(str);

        System.out.println(arregloGenerico);
        arregloGenerico.sort();
        System.out.println(arregloGenerico);
    }
}
