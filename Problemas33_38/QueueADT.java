package Problemas33_38;

public interface QueueADT <T> {
    public void enqueue(T data);
    public T dequeue();
    public T peek();
    public boolean isEmpty();
    public int size();
    public T rearPeek();
}
