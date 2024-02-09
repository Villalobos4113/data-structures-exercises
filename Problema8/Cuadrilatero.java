package Problema8;

public abstract class Cuadrilatero implements FiguraGeometrica{

    private double lado1, lado2;

    protected Cuadrilatero() {
    }

    protected Cuadrilatero(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double calculaPerim() {
        return (2 * this.lado1) + (2 * this.lado2);
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }
}
