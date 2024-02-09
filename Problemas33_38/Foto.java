package Problemas33_38;

public class Foto extends Archivo{

    private double resolución;

    public Foto(double tamaño, String nombre, String dueño, String fecha, double resolución) {
        super(tamaño, nombre, dueño, fecha);
        this.resolución = resolución;
    }

    @Override
    public String toString() {
        return "Foto{" +
                "resolución=" + resolución + "', " +
                super.toString() +
                '}';
    }

    public double getResolución() {
        return resolución;
    }
}
