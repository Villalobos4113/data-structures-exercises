package Problema11;

public abstract class DePasajeros extends Camion{

    protected int totalPasaj;

    public DePasajeros() {
    }

    public DePasajeros(String marca, String numMotor, String placas, Double costoCamion, int totalPasaj) {
        super(marca, numMotor, placas, costoCamion);
        this.totalPasaj = totalPasaj;
    }

    @Override
    public String toString() {
        return "DePasajeros{" +
                "marca='" + marca + '\'' +
                ", numMotor='" + numMotor + '\'' +
                ", placas='" + placas + '\'' +
                ", costoCamion=" + costoCamion +
                ", totalPasaj=" + totalPasaj +
                '}';
    }

    public double calculaCostoServicio(double kilometrosPorRecorrer) {
        return ((costoCamion * 0.0001) / totalPasaj) * kilometrosPorRecorrer;
    }

    public int getTotalPasaj() {
        return totalPasaj;
    }
}
