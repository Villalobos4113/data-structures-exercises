package Problemas23_26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Problema26 {
    public static void main(String[] args) {
        SetADT<String> ingles = new ArraySet<>(), frances = new ArraySet<>(), otro = new ArraySet<>();
        readFile(ingles, frances, otro);

        System.out.println(ingles.intersection(frances));
        System.out.println(ingles.difference(frances).difference(otro).size());
        System.out.println(ingles.intersection(frances).intersection(otro));
    }

    public static void readFile(SetADT<String> ingles, SetADT<String> frances, SetADT<String> otro) {
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            file = new File("C:\\Users\\fvbit\\Documents\\ITAM\\Semestres\\Tercer Semestre\\Materias\\Estructuras de Datos\\Tareas1\\Problemas23_26\\Problema26.txt");
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String linea, idioma, nombre;
            int coma;

            while((linea = bufferedReader.readLine()) != null){
                coma = linea.indexOf(',');
                idioma = linea.substring(0, coma);
                nombre = linea.substring(coma + 2);

                switch (idioma) {
                    case "ingles" -> ingles.add(nombre.toUpperCase());
                    case "frances" -> frances.add(nombre.toUpperCase());
                    default -> otro.add(nombre.toUpperCase());
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally{
            try{
                if(fileReader != null)
                    fileReader.close();
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }
}
