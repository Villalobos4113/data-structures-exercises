package Problema11;

import java.util.Objects;

public abstract class Camion implements java.io.Serializable{

    protected String marca, numMotor, placas;
    protected double costoCamion;

    protected Camion() {

    }

    public Camion(String marca, String numMotor, String placas, Double costoCamion) {
        this.marca = marca;
        this.numMotor = numMotor;
        this.placas = placas;
        this.costoCamion = costoCamion;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "marca='" + marca + '\'' +
                ", numMotor='" + numMotor + '\'' +
                ", placas='" + placas + '\'' +
                ", costoCamion=" + costoCamion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass() && !o.getClass().getSimpleName().equals("String")) return false;
        if (o instanceof Camion) {
            Camion camion = (Camion) o;
            return Objects.equals(placas, camion.placas);
        } else {
            String str = (String) o;
            return placas.equals(str);
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getNumMotor() {
        return numMotor;
    }

    public String getPlacas() {
        return placas;
    }

    public double getCostoCamion() {
        return costoCamion;
    }
}
