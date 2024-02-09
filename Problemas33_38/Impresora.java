package Problemas33_38;

public class Impresora {

    private String marca;
    private ArrayQueue<Archivo> queue = new ArrayQueue<>();

    public Impresora(String marca, ArrayQueue<Archivo> queue) {
        this.marca = marca;
        this.queue = queue;
        
    }

    public String getMarca() {
        return marca;
    }

    public void add(double tamaño, String nombre, String dueño, String fecha, String tipoProcesador) {
        queue.enqueue(new Documento(tamaño, nombre, dueño, fecha, tipoProcesador));
    }

    public void add(double tamaño, String nombre, String dueño, String fecha, double resolución) {
        queue.enqueue(new Foto(tamaño, nombre, dueño, fecha, resolución));
    }

    public Archivo print() {
        return queue.dequeue();
    }

    public void eliminaFotos() {
        ArrayQueue<Archivo> auxQueue = new ArrayQueue<>();

        while (!queue.isEmpty()) {
            if (!(queue.peek() instanceof Foto))
                auxQueue.enqueue(queue.dequeue());
            else
                queue.dequeue();
        }

        queue = auxQueue;
    }

    public void eliminaArchivos(double tamaño) {
        ArrayQueue<Archivo> auxQueue = new ArrayQueue<>();

        while (!queue.isEmpty()) {
            if (queue.peek() instanceof Documento && queue.peek().getTamaño() > tamaño)
                queue.dequeue();
            else
                auxQueue.enqueue(queue.dequeue());
        }

        queue = auxQueue;
    }
}
