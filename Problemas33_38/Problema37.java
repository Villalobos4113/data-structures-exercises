package Problemas33_38;

import Ranrandom.Ranrandom;

public class Problema37 {
    public static void sort(QueueADT<Persona> queue) {
        if (queue != null && !queue.isEmpty()) {
            ArrayQueue<Persona> auxQueue = new ArrayQueue<>(), auxQueue1 = new ArrayQueue<>();
            int i = 0;

            auxQueue.enqueue(queue.dequeue());

            while (!queue.isEmpty()) {
                if (queue.peek().getEdad() > auxQueue.peek().getEdad()) {
                    while (!auxQueue.isEmpty())
                        auxQueue1.enqueue(auxQueue.dequeue());

                    auxQueue.enqueue(queue.dequeue());

                    while (!auxQueue1.isEmpty())
                        auxQueue.enqueue(auxQueue1.dequeue());
                }

                else if (queue.peek().getEdad() > auxQueue.rearPeek().getEdad()){
                    while (queue.peek().getEdad() < auxQueue.peek().getEdad())
                        auxQueue1.enqueue(auxQueue.dequeue());

                    auxQueue1.enqueue(queue.dequeue());

                    while (!auxQueue.isEmpty())
                        auxQueue1.enqueue(auxQueue.dequeue());

                    while (!auxQueue1.isEmpty())
                        auxQueue.enqueue(auxQueue1.dequeue());
                }

                else
                    auxQueue.enqueue(queue.dequeue());
            }

            while (!auxQueue.isEmpty())
                queue.enqueue(auxQueue.dequeue());
        }
    }

    public static void main(String[] args) {
        ArrayQueue<Persona> queue = new ArrayQueue<>();

        for (int i = 0; i < Ranrandom.randInt(51); i++)
            queue.enqueue(new Persona());

        System.out.println(queue);
        System.out.println(queue.size());

        sort(queue);

        System.out.println(queue);
        System.out.println(queue.size());
    }
}
