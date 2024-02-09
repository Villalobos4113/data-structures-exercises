package Ranrandom;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @author Fernando Villalobos Betancourt
 *
 */

public class RandIterator <T> {

    private ArrayList<T> arrayList;

    public RandIterator(T[] array, int noElements) {
        this.arrayList = new ArrayList<>();

        for (int i = 0; i < noElements; i++)
            arrayList.add(array[i]);
    }

    public RandIterator(ArrayList<T> arrayList) {
        this.arrayList = new ArrayList<>();

        for (int i = 0; i < arrayList.size(); i++)
            this.arrayList.add(arrayList.get(i));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RandIterator<?> that = (RandIterator<?>) o;
        return arrayList.equals(that.arrayList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arrayList);
    }

    public T pop() {
        if (!arrayList.isEmpty())
            return arrayList.remove((int) (Math.random() * arrayList.size()));
        else
            return null;
    }

    public boolean isEmpty() {
        return arrayList.isEmpty();
    }
}
