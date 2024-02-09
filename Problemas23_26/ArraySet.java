package Problemas23_26;

import java.util.Iterator;
import Binarray.Binarray;

public class ArraySet <T> implements SetADT<T>{

    private int size;
    private T[] set;
    private final int MAX = 20;

    public ArraySet() {
        this.set = (T[]) new Object[MAX];
        this.size = 0;
    }

    public ArraySet(int size) {
        this.set = (T[]) new Object[size];
        this.size = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (size != 0) {
            sb.append("[");

            for (int i = 0; i < size - 1; i++)
                sb.append(set[i] + ", ");

            sb.append(set[size - 1] + "]");
        } else
            sb.append("[]");

        return sb.toString();
    }

    @Override
    public boolean add(T data) {
        boolean resp = false;

        if (!contains(data)) {
            if (size == set.length)
                expand();

            set[size] = data;
            size++;
            resp = true;
        }

        return resp;
    }

    private void expand() {
        T[] newSet = (T[]) new Object[set.length * 2];

        for (int i = 0; i < set.length; i++)
            newSet[i] = set[i];

        set = newSet;
    }

    @Override
    public T delete(T data) {
        T resp = null;

        if (size != 0) {
            int i = search(data);

            if (i >= 0) {
                resp = set[i];
                Binarray.moveLeft(set, size, i);
                size--;
            }
        }
        return resp;
    }

    private int search(T data) {
        int resp = -1, i = 0;

        while (resp == -1 && i < size) {
            if (set[i].equals(data))
                resp = i;
            i++;
        }

        return resp;
    }

    @Override
    public boolean contains(T data) {
        boolean resp = false;
        int i = 0;

        while (!resp && i < size) {
            if (set[i].equals(data))
                resp = true;

            i++;
        }

        return resp;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public SetADT<T> union(SetADT<T> set) {
        if (set == null)
            return null;

        SetADT<T> resSet = new ArraySet<>(size + set.size());

        if (this == set) {
            ArraySet temp = (ArraySet) resSet;

            for (int i = 0; i < size; i++)
                temp.set[i] = this.set[i];

            temp.size = this.size;
        } else {
            ArraySet temp = (ArraySet) resSet;

            if (size > set.size()) {
                for (int i = 0; i < size; i++)
                    temp.set[i] = this.set[i];

                temp.size = this.size;

                for (T data : set)
                    resSet.add(data);
            } else {
                for (T data : set) {
                    temp.set[temp.size] = data;
                    temp.size++;
                }

                for (int i = 0; i < size; i++)
                    temp.add(this.set[i]);
            }
        }

        return resSet;
    }

    @Override
    public SetADT<T> intersection(SetADT<T> set) {
        if (set == null)
            return null;

        SetADT<T> resSet = new ArraySet<>(size);

        if (this == set) {
            ArraySet temp = (ArraySet) resSet;

            for (int i = 0; i < size; i++)
                temp.set[i] = this.set[i];

            temp.size = this.size;
        } else {
            if (size < set.size()) {
                ArraySet temp = (ArraySet) resSet;

                for (T data : this.set) {
                    if (set.contains(data)) {
                        temp.set[temp.size] = data;
                        temp.size++;
                    }
                }
            } else {
                ArraySet temp = (ArraySet) resSet;

                for (T data : set) {
                    if (this.contains(data)) {
                        temp.set[temp.size] = data;
                        temp.size++;
                    }
                }
            }
        }

        return resSet;
    }

    @Override
    public SetADT<T> difference(SetADT<T> set) {
        if (set == null)
            return null;

        SetADT<T> resSet = new ArraySet<>(this.size);

        if (this != set) {
            ArraySet temp = (ArraySet) resSet;

            for (int i = 0; i < size; i++) {
                if (!set.contains(this.set[i])) {
                    temp.set[temp.size] = this.set[i];
                    temp.size++;
                }
            }
        }

        return resSet;
    }

    @Override
    public  Iterator<T> iterator() { return new ArrayIterator<>(set, size); }
}
