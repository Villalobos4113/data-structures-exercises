package Binarray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @author Fernando Villalobos Betancourt
 *
 */

public class Binarray {

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

    public static <T> T delete(T[] array, int noElements, int index) {
        T res = null;

        if (index >= 0 && index < noElements) {
            res = array[index];
            moveLeft(array, noElements, index);
        }

        return res;
    }

    public static <T> boolean insert(T data, T[] array, int noElements, int index) {
        boolean res = false;

        if (array.length > noElements && index < array.length && index >= 0) {
            if (moveRight(array, noElements, index)); {
                array[index] = data;
                res = true;
            }
        }

        return res;
    }

    public static <T> boolean moveLeft(T[] array, int noElements, int index) {
        if (index < noElements - 1) {
            array[index] = array[index + 1];
            moveLeft(array, noElements, index + 1);
        } else
            array[index] = null;

        return true;
    }

    public static <T> boolean moveRight(T[] array, int noElements, int index) {
        if (array.length > noElements) {
            if (noElements == index) {
                array[index] = null;
                return true;
            }
            else {
                array[noElements] = array[noElements - 1];
                return moveRight(array, noElements - 1, index);
            }
        } else
            return false;
    }

    public static <T> int binarySearch(T data, T[] array, int noElementos) {
        return binarySearch(data, array, noElementos, 0);
    }

    private static <T> int binarySearch(T data, T[] array,  int top, int bottom) {
        if (top < bottom)
            return -(bottom + 1);
        else {
            int middle = (top + bottom) / 2;

            if (array[middle].equals(data))
                return middle;

            else if (((Comparable) array[middle]).compareTo(data) < 0)
                return binarySearch(data, array, top, middle + 1);

            else
                return binarySearch(data, array, middle - 1, bottom);
        }
    }

    public static <T> int search(T data, T[] array, int noElementos) {
        int res = -1, i = 0;

        while (res == -1 && i < noElementos) {
            if (array[i].equals(data))
                res = i;
            i++;
        }

        return res;
    }

    public static <T> void sort(T[] array, int noElementos) {

    }

    public static <T> T[] copy(T[] array, int noElements) {
        if (noElements > 0) {
            T[] resArray = (T[]) Array.newInstance(array[0].getClass(), noElements);

            for (int i = 0; i < noElements; i++)
                resArray[i] = array[i];

            return resArray;
        } else
            return null;
    }

    public static <T> void reverse(T[] array, int noElements) {
        if (noElements > 0) {
            int i = 0;
            T aux;

            while (i < noElements - 1) {
                aux = array[i];
                array[i] = array[noElements - 1];
                array[noElements - 1] = aux;
                noElements--;
                i++;
            }
        }
    }

    public static <T> void clear(T[] array, int noElements) {
        for (int i = 0; i < noElements; i++)
            array[i] = null;
    }

    public static <T> boolean extend(T[] array, int noElements, Iterator<T> iterable) {
        boolean res = false;
        try {
            int i = noElements;
            for (Iterator<T> it = iterable; it.hasNext(); ) {
                T data = it.next();
                array[i] = data;
                i++;
            }

            res = true;
        } catch (Exception e) {

        }

        return res;
    }
}
