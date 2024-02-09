package Poblema7;

public class Avion implements ObjetoVolador {

    private int num;

    public Avion(int numero){
        num = numero;
    }

    @Override
    public void despega() {
        System.out.println("El Avión deespegó");
    }

    @Override
    public void aterriza() {
        System.out.println("El Avión aterrizó");
    }

    @Override
    public void desplaza() {
        System.out.println("El Avión despalzó");
    }

    public int getNum() {
        return num;
    }
}
