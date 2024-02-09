package Problema12_22;

public interface StackADT <T> {

    public void push(T dato);
    public T pop();
    public boolean isEmpty();
    public T peek();
    public void multiPop(int n);
    public boolean equals(Object obj);

}
