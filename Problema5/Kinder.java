package Problema5;

public class Kinder extends Estudiante{

    private String nivel;

    public Kinder(String nombre, String curp, String fechaDeNacimiento, String nombreMadre, String nombrePadre, String nombreTutor, String nivel) {
        super(nombre, curp, fechaDeNacimiento, nombreMadre, nombrePadre, nombreTutor);
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Kinder {" +
                "nivel = '" + nivel + '\'' +
                ", " + super.toString() +
                '}';
    }
}
