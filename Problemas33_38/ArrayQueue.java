package Problemas33_38;

public class ArrayQueue <T> implements QueueADT<T>{

    private T[] queue;
    private int front, rear;
    private final int MAX = 25;

    public ArrayQueue() {
        queue = (T[]) new Object[MAX];
        front = -1;
        rear = -1;
    }

    public ArrayQueue(int size) {
        queue = (T[]) new Object[size];
        front = -1;
        rear = -1;
    }

    @Override
    public String toString() {
        if (!isEmpty()) {
            StringBuilder sb = new StringBuilder();

            for (int i = front; i != rear; i = (i + 1) % queue.length)
                sb.append(queue[i] + " <- ");

            sb.append(queue[rear] + "]");

            return "[" + sb.toString();
        } else
            return "[]";
    }

    @Override
    public void enqueue(T data) {
        if (isEmpty())
            front = 0;

        else if ((rear + 1) % queue.length == front)
            expand();

        rear = (rear + 1) % queue.length;
        queue[rear] = data;
    }

    private void expand() {
        T[] newQueue = (T[]) new Object[queue.length * 2];

        for (int i = 0; i < queue.length; i++)
            newQueue[i] = queue[(front + i) % queue.length];

        front = 0;
        rear = queue.length - 1;
        queue = newQueue;
    }

    @Override
    public T dequeue() {
        if (isEmpty())
            return null;

        T dequeued = queue[front];
        queue[front] = null;

        if (front == rear) {
            front = -1;
            rear = -1;
        } else
            front = (front + 1) % queue.length;

        return dequeued;
    }

    @Override
    public T peek() {
        if (!isEmpty())
            return queue[front];
        else return null;
    }

    @Override
    public boolean isEmpty() {
        return front == -1;
    }

    public int size() {
        if (!isEmpty()) {
            if (front <= rear)
                return (rear - front) + 1;
            else
                return (queue.length - front) + (rear + 1);
        }

        return 0;
    }

    @Override
    public T rearPeek() {
        if (!isEmpty())
            return queue[rear];
        else
            return null;
    }
}
