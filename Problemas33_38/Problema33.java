package Problemas33_38;

import Problema12_22.ArrayStack;

public class Problema33 {
    public static <T> void reverseQueue(QueueADT<T> queue) {
        if (queue != null && !queue.isEmpty()) {
            ArrayStack<T> arrayStack = new ArrayStack<>();

            while (!queue.isEmpty())
                arrayStack.push(queue.dequeue());

            while (!arrayStack.isEmpty())
                queue.enqueue(arrayStack.pop());
        }
    }

    public static <T> void reverseQueueRecursive(QueueADT<T> queue) {
        if (queue != null) {
            T data = null;
            reverseQueueRecursive(queue, data);
        }
    }

    private static <T> void reverseQueueRecursive(QueueADT<T> queue, T data) {
        if (!queue.isEmpty()) {
            data = queue.dequeue();
            reverseQueueRecursive(queue, data);
            queue.enqueue(data);
        }
    }


    public static void main(String[] args) {
        ArrayQueue<Integer> arrayQueue1 = new ArrayQueue<>(), arrayQueue2 = new ArrayQueue<>();

        for (int i = 0; i < 10; i++) {
            arrayQueue1.enqueue(i);
            arrayQueue2.enqueue(i);
        }

        System.out.println("\n=================== ITERABLE ===================");

        System.out.println(arrayQueue1);

        reverseQueue(arrayQueue1);

        System.out.println(arrayQueue1);

        System.out.println("\n=================== RECURSIVE ==================");

        System.out.println(arrayQueue2);

        reverseQueueRecursive(arrayQueue2);

        System.out.println(arrayQueue2);
    }
}
