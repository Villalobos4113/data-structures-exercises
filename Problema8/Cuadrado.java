package Problema8;

public class Cuadrado extends Cuadrilatero{

    public Cuadrado(double lado1) {
        super(lado1, lado1);
    }

    public double calculaArea() {
        return super.getLado1() * super.getLado2();
    }
}
