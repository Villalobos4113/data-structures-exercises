package Poblema7;

import static Ranrandom.Ranrandom.randInt;

public class Executable {
    public static void main(String[] args) {
        ObjetoVolador[] arr = new ObjetoVolador[10];




        for (int i = 0; i < 10; i++) {
            if (randInt(0, 2) == 1)
                arr[i] = new Avion(randInt(10,100));
            else
                arr[i] = new Pajaro("bosque");
        }

        for (int i = 0; i < 10; i++) {
            if(arr[i] instanceof  Avion) {
                System.out.println("Num pasajeros: " + ((Avion) arr[i]).getNum());
            } if(arr[i] instanceof  Pajaro) {
                System.out.println("Lugar: " + ((Pajaro) arr[i]).getLugar());
            }
        }
    }
}
