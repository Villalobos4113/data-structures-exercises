package Problemas33_38;

public class Documento extends Archivo {

    private String tipoProcesador;

    public Documento(double tamaño, String nombre, String dueño, String fecha, String tipoProcesador) {
        super(tamaño, nombre, dueño, fecha);
        this.tipoProcesador = tipoProcesador;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "tipoProcesador='" + tipoProcesador + "', " +
                super.toString() +
                '}';
    }

    public String getTipoProcesador() {
        return tipoProcesador;
    }
}
