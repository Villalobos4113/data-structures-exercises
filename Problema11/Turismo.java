package Problema11;

public class Turismo extends DePasajeros{

    boolean asientoCama, serviBar;

    public Turismo() {
    }

    public Turismo(String marca, String numMotor, String placas, Double costoCamion, int totalPasaj, boolean asientoCama, boolean serviBar) {
        super(marca, numMotor, placas, costoCamion, totalPasaj);
        this.asientoCama = asientoCama;
        this.serviBar = serviBar;
    }

    @Override
    public String toString() {
        return "Turismo{" +
                "marca='" + marca + '\'' +
                ", numMotor='" + numMotor + '\'' +
                ", placas='" + placas + '\'' +
                ", costoCamion=" + costoCamion +
                ", totalPasaj=" + totalPasaj +
                ", asientoCama=" + asientoCama +
                ", serviBar=" + serviBar +
                '}';
    }

    public double calculaCostoServicio(double kilometrosPorRecorrer) {
        double resp = ((costoCamion * 0.0001) / totalPasaj) * kilometrosPorRecorrer;

        if (serviBar)
            resp *= 1.05;
        if (asientoCama)
            resp *= 1.05;

        return resp;
    }

    public boolean isAsientoCama() {
        return asientoCama;
    }

    public boolean isServiBar() {
        return serviBar;
    }
}
