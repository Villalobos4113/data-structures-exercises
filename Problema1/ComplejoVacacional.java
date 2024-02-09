package Problema1;

import java.util.ArrayList;
import java.util.Objects;

public class ComplejoVacacional {

    private String nombre;
    private ArrayList<Rectangulo> albercas = new ArrayList<Rectangulo>();
    private int numAlb;

    public ComplejoVacacional(String nombre, int numAlb) {
        this.nombre = nombre;
        this.numAlb = numAlb;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumAlb() {
        return numAlb;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumAlb(int numAlb) {
        this.numAlb = numAlb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplejoVacacional that = (ComplejoVacacional) o;
        return getNumAlb() == that.getNumAlb() && Objects.equals(getNombre(), that.getNombre()) && Objects.equals(albercas, that.albercas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), albercas, getNumAlb());
    }

    @Override
    public String toString() {
        return "Problema1.ComplejoVacacional {" +
                "nombre = '" + nombre + '\'' +
                ", numAlb = " + numAlb +
                '}';
    }

    public boolean isFull() {
        return this.albercas.size() >= this.numAlb;
    }

    public void addAlb(double lado1, double lado2) {
        if (this.albercas.size() < this.numAlb)
            this.albercas.add(new Rectangulo(lado1, lado2));
    }

    public double totalAreaAlb() {
        double area = 0;

        for (int i = 0; i < this.albercas.size(); i++) {
            area += this.albercas.get(i).calculaArea();
        }

        return area;
    }

    public double totalPerimetro() {
        double perimetro = 0;

        for (int i = 0; i < this.albercas.size(); i++) {
            perimetro += this.albercas.get(i).calculaPerimetro();
        }

        return perimetro;
    }
}
