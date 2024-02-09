package Problema8;

import java.util.ArrayList;

public class Executable {
    public static void main(String[] args) {
        FiguraGeometrica[] figuras = new FiguraGeometrica[10];
        ArrayList<FiguraGeometrica> figuraGeometricaArrayList = new ArrayList<FiguraGeometrica>();
        Cuadrilatero[] cuadrilateros = new Cuadrilatero[10];
        ArrayList<Cuadrilatero> cuadrilateroArrayList = new ArrayList<Cuadrilatero>();

        Cuadrado cuadrado = new Cuadrado(10);
        cuadrilateros[0] = cuadrado;
        cuadrilateroArrayList.add(cuadrado);
    }
}
