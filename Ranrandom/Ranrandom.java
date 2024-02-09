package Ranrandom;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author Fernando Villalobos Betancourt
 *
 */

public class Ranrandom {

    public static double randRange(double min, double max) { return (Math.random()*(max - min)) + min; }

    public static double random(double top) { return Math.random() * top; }

    public static int randInt(int min, double max) {
        return (int) (Math.random()*(max - min)) + min;
    }

    public static int randInt(int top) {
        return (int) (Math.random() * top);
    }

    public static <T> T choice(T[] array, int noElements) {
        return array[(int) (Math.random() * noElements)];
    }

    public static <T> T choice(ArrayList<T> arrayList) { return arrayList.get((int) (Math.random() * arrayList.size())); }

    public static <T> T[] choices(T[] array, int noElements) {
        if (noElements >= 2) {
            T[] auxArray = (T[]) Array.newInstance(array[0].getClass(), (int) (Math.random() * (noElements - 1)) + 1);
            RandIterator<T> randIterator = new RandIterator<>(array, noElements);

            for (int i = 0; i < auxArray.length; i++)
                auxArray[i] = randIterator.pop();

            return (T[]) auxArray;
        } else
            return null;
    }

    public static <T> T[] choices(T[] array, int noElements, int length) {
        if (noElements <= 2) {
            if (length < noElements) {
                T[] auxArray = (T[]) Array.newInstance(array[0].getClass(), length);
                RandIterator<T> randIterator = new RandIterator<>(array, noElements);

                for (int i = 0; i < length; i++)
                    auxArray[i] = randIterator.pop();

                return (T[]) auxArray;
            } else
                return null;
        } else
            return null;
    }

    public static <T> T[] choices(ArrayList<T> arrayList) {
        if (arrayList.size() <= 2) {
            T[] auxArray = (T[]) Array.newInstance(arrayList.get(0).getClass(), (int) (Math.random() * (arrayList.size() - 1)) + 1);
            RandIterator<T> randIterator = new RandIterator<>(arrayList);

            for (int i = 0; i < auxArray.length; i++)
                auxArray[i] = randIterator.pop();

            return auxArray;
        } else
            return null;
    }

    public static <T> T[] choices(ArrayList<T> arrayList, int length) {
        if (arrayList.size() <= 2) {
            if (length < arrayList.size()) {
                T[] auxArray = (T[]) Array.newInstance(arrayList.get(0).getClass(), length);;
                RandIterator<T> randIterator = new RandIterator<>(arrayList);

                for (int i = 0; i < length; i++)
                    auxArray[i] = randIterator.pop();

                return auxArray;
            } else
                return null;
        } else
            return null;
    }

    public static <T> void shuffle(T[] array, int noElementos) {
        RandIterator<T> randIterator = new RandIterator<>(array, noElementos);

        for (int i = 0; i < noElementos; i++)
            array[i] = randIterator.pop();
    }
}