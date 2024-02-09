package Problema1;

import java.util.Objects;

public class Rectangulo {

    private double lado1, lado2;

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangulo that = (Rectangulo) o;
        return Double.compare(that.getLado1(), getLado1()) == 0 && Double.compare(that.getLado2(), getLado2()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLado1(), getLado2());
    }

    @Override
    public String toString() {
        return "Problema1.Rectangulo {" +
                "lado1 = " + lado1 +
                ", lado2 = " + lado2 +
                '}';
    }

    public double calculaArea() {
        return this.lado1 * this.lado2;
    }

    public double calculaPerimetro() {
        return this.lado1 * 2 + this.lado2 * 2;
    }
}
