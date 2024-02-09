package Problemas33_38;

public class Problema35 {
    public static <T> void emilinaOcurrencias(QueueADT<T> queue, T data) {
        if (queue != null) {
            ArrayQueue<T> auxQueue = new ArrayQueue<>();

            while (!queue.isEmpty()) {
                if (!data.equals(queue.peek()))
                    auxQueue.enqueue(queue.dequeue());
                else queue.dequeue();
            }

            while (!auxQueue.isEmpty())
                queue.enqueue(auxQueue.dequeue());
        }
    }

    public static void main(String[] args) {
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();

        for (int i = 0; i < 10; i++) {
            arrayQueue.enqueue(i);
        }

        System.out.println(arrayQueue);

        emilinaOcurrencias(arrayQueue, 3);

        System.out.println(arrayQueue);
    }
}
