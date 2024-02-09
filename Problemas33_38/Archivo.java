package Problemas33_38;

public abstract class Archivo implements java.io.Serializable {

    private double tamaño;
    private String nombre, dueño, fecha;

    public Archivo(double tamaño, String nombre, String dueño, String fecha) {
        this.tamaño = tamaño;
        this.nombre = nombre;
        this.dueño = dueño;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Archivo{" +
                "tamaño=" + tamaño +
                ", nombre='" + nombre + '\'' +
                ", dueño='" + dueño + '\'' +
                ", fecha='" + fecha + '\'' +
                '}';
    }

    public double getTamaño() {
        return tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDueño() {
        return dueño;
    }

    public String getFecha() {
        return fecha;
    }
}
