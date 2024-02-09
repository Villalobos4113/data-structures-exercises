package Problema8;

public class Triangulo implements FiguraGeometrica{

    private double base, altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calculaArea() {
        return (this.base * this.altura) / 2;
    }

    public double calculaPerim() {
        return (Math.sqrt(Math.pow(this.base / 2, 2) + Math.pow(altura, 2)));
    }
}
