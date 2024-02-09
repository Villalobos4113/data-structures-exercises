package Problema8;

public class Rectangulo extends Cuadrilatero{

    public Rectangulo(double lado1, double lado2) {
        super(lado1, lado2);
    }

    public double calculaArea() {
        return super.getLado1() * super.getLado2();
    }
}
