package Problemas23_26;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator <T> implements Iterator<T> {

    private T[] array;
    private int size, i;

    public ArrayIterator(T[] array, int total) {
        this.array = array;
        this.size = total;
        this.i = 0;
    }

    @Override
    public boolean hasNext() {
        return i < size;
    }

    @Override
    public T next() {
        if (i < size) {
            i++;
            return array[i - 1];
        }
        throw new NoSuchElementException();
    }
}
