package Poblema7;

public class Pajaro implements ObjetoVolador {

    private String lugar;

    public Pajaro(String lu){
        lugar =lu;
    }

    @Override
    public void despega() {
        System.out.println("El Pajaro deespegó");
    }

    @Override
    public void aterriza() {
        System.out.println("El Pajaro aterrizó");
    }

    @Override
    public void desplaza() {
        System.out.println("El Pajaro despalzó");
    }

    public String getLugar() {
        return lugar;
    }
}
