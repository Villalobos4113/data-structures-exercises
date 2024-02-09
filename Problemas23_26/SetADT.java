package Problemas23_26;

public interface SetADT <T> extends Iterable<T> {
    boolean add(T data);
    T delete(T data);
    boolean contains(T data);
    boolean isEmpty();
    int size();
    SetADT<T> union(SetADT<T> set);
    SetADT<T> intersection(SetADT<T> set);
    SetADT<T> difference(SetADT<T> set);
}
