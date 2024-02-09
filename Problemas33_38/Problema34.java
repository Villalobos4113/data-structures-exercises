package Problemas33_38;

public class Problema34 {
    public static <T> void eliminaRepetidos(QueueADT<T> queue) {
        if (queue != null && !queue.isEmpty()) {
            ArrayQueue<T> auxQueue = new ArrayQueue<>();

            T data = queue.dequeue();

            while (!queue.isEmpty()) {
                if (!data.equals(queue.peek()))
                    auxQueue.enqueue(data);

                data = queue.dequeue();
            }

            auxQueue.enqueue(data);

            while (!auxQueue.isEmpty())
                queue.enqueue(auxQueue.dequeue());
        }
    }

    public static void main(String[] args) {
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();

        arrayQueue.enqueue(1);
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);
        arrayQueue.enqueue(3);
        arrayQueue.enqueue(4);
        arrayQueue.enqueue(4);
        arrayQueue.enqueue(5);
        arrayQueue.enqueue(5);
        arrayQueue.enqueue(6);
        arrayQueue.enqueue(6);
        arrayQueue.enqueue(7);
        arrayQueue.enqueue(7);
        arrayQueue.enqueue(8);
        arrayQueue.enqueue(8);
        arrayQueue.enqueue(9);
        arrayQueue.enqueue(9);
        arrayQueue.enqueue(10);
        arrayQueue.enqueue(10);

        System.out.println(arrayQueue);

        eliminaRepetidos(arrayQueue);

        System.out.println(arrayQueue);
    }
}
