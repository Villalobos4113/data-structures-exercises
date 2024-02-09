package Problema27_32;

public class ArregloGenerico <T> {

    private T[] array;
    private int anInt;
    private final int MAX = 25;

    public ArregloGenerico() {
        array = (T[]) new Object[MAX];
        anInt = -1;
    }

    // Basic Functionality

    public String toString() {
        if (anInt < 0)
            return "[]";
        return "[" + toString(0);
    }

    private String toString(int i) {
        if (i < anInt)
            return array[i] + ", " + toString(i + 1);
        else
            return array[i] + "]";
    }

    public int size() {
        return anInt;
    }

    // Retrieve information array

    public void add(T data) {
        if (anInt == array.length - 1)
            expand();

        anInt++;
        array[anInt] = data;
    }

    private void expand() {
        T[] newStack = (T[]) new Object[array.length * 2];

        for (int i = 0; i < array.length; i++)
            newStack[i] = array[i];

        array = newStack;
    }

    public T get(int i) {
        T resp = null;

        if (i >= 0 && i <= anInt)
            resp = array[i];

        return resp;
    }

    public T del(int i) {
        T resp = null;

        if (i >= 0 && i <= anInt) {
            resp = array[i];
            recorreIzq(i);
        }

        return resp;
    }

    public void insert(T data, int i) {
        if (i > anInt)
            add(data);

        recorreDer(i);
        array[i] = data;
    }

    // Busquedas

    // Busqueda Secuencial

    public int busquedaSecuencial(T data) {
        return busquedaSecuencial(data, 0);
    }

    private int busquedaSecuencial(T data, int i) {
        if (i <= anInt) {
            if (array[i].equals(data))
                return i;
            else
                return busquedaSecuencial(data, i + 1);
        } else
            return -1;
    }

    // Busqueda Binaria

    public int busquedaBinaria(T data) {
        return busquedaBinaria(data, anInt, 0);
    }

    private int busquedaBinaria(T data, int top, int bottom) {
        if (top < bottom)
            return -(bottom + 1);
        else {
            int middle = (top + bottom) / 2;

            if (array[middle].equals(data))
                return middle;

            else if (((Comparable) array[middle]).compareTo(data) < 0)
                return busquedaBinaria(data, top, middle + 1);

            else
                return busquedaBinaria(data, middle - 1, bottom);
        }
    }

    // Mayor y Menor

    public int mayor() {
        if (anInt >= 0)
            return mayor(1, 0);
        return -1;
    }

    public int mayorAPos(int i) {
        if (anInt >= 0)
            return mayor(i, i);
        return -1;
    }

    private int mayor(int i, int mayor) {
        if (i <= anInt) {
            if (((Comparable) array[i]).compareTo(array[mayor]) > 0)
                return mayor(i + 1, i);
            else
                return mayor(i + 1, mayor);
        } else
            return mayor;
    }

    public int menor() {
        if (anInt >= 0)
            return menor(1, 0);
        return -1;
    }

    public int menorAPos(int i) {
        if (anInt >= 0)
            return menor(i, i);
        return -1;
    }

    private int menor(int i, int menor) {
        if (i <= anInt) {
            if (((Comparable) array[i]).compareTo(array[menor]) < 0)
                return menor(i + 1, i);
            else
                return menor(i + 1, menor);
        } else
            return menor;
    }

    // Elimina Ocurrencias

    public void eliminaOcurrencias(T data) {
        eliminaOcurrencias(data, 0);
    }

    private void eliminaOcurrencias(T data, int i) {
        if (i <= anInt) {
            if (array[i].equals(data)) {
                del(i);
                eliminaOcurrencias(data, i);
            }
            else
                eliminaOcurrencias(data, i + 1);
        }
    }

    // Recorrimientos

    private void recorreIzq(int i) {
        if (i < anInt) {
            array[i] = array[i + 1];
            recorreIzq(i + 1);
        }
        else {
            array[i] = null;
            anInt--;
        }
    }

    public void recorreDer(int i) {
        recorreDerRec(i);
        array[i] = null;
    }

    private void recorreDerRec(int i) {
        if (i < anInt) {
            recorreDer(i + 1);
            array[i + 1] = array[i];
        } else
            add(array[i]);
    }

    // Sort

    public void sort() {
        sort(0);
    }

    private void sort(int i) {
        if (i <= anInt) {
            int posMenor = menorAPos(i);
            T menor = array[posMenor];
            array[posMenor] = array[i];
            array[i] = menor;
            sort(i + 1);
        }
    }
}
