package Problema11;

public class Escolar extends DePasajeros{

    private boolean lugarProyecto;

    public Escolar() {
    }

    public Escolar(String marca, String numMotor, String placas, Double costoCamion, int totalPasaj, boolean lugarProyecto) {
        super(marca, numMotor, placas, costoCamion, totalPasaj);
        this.lugarProyecto = lugarProyecto;
    }

    @Override
    public String toString() {
        return "Escolar{" +
                "marca='" + marca + '\'' +
                ", numMotor='" + numMotor + '\'' +
                ", placas='" + placas + '\'' +
                ", costoCamion=" + costoCamion +
                ", totalPasaj=" + totalPasaj +
                ", lugarProyecto=" + lugarProyecto +
                '}';
    }

    public double calculaCostoServicio() {
        return ((costoCamion * 0.0001) / totalPasaj) * 250;
    }

    public boolean isLugarProyecto() {
        return lugarProyecto;
    }
}
