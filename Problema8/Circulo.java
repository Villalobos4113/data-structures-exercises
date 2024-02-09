package Problema8;

public class Circulo implements FiguraGeometrica{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calculaArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    public double calculaPerim() {
        return (2 * Math.PI) * this.radio;
    }
}
