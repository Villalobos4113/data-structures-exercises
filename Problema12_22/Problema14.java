package Problema12_22;

import java.util.ArrayList;

public class Problema14 {
    public static int noObjetos(StackADT stack) {
        ArrayList<Object> arrayList = new ArrayList<Object>();

        while (!(stack.isEmpty()))
            arrayList.add(stack.pop());

        int resp = arrayList.size();

        for (int i = arrayList.size() - 1; i >= 0; i--)
            stack.push(arrayList.get(i));

        return resp;
    }

    public static <T> int numElementos(StackADT<T> pila){
        int cont=0;
        ArrayStack<T> arr = new ArrayStack<T>();

        while (!pila.isEmpty()) {
            cont++;
            arr.push(pila.pop());
        }

        while (!arr.isEmpty()) {
            pila.push(arr.pop());
        }

        return cont;
    }

    public static void main(String[] args) {
        ArrayStack<String> stack = new ArrayStack<String>();

        for (int i = 0; i < 10; i++)
            stack.push("Hola" + (i+1));

        System.out.println(stack.toString());
        System.out.println(Problema14.numElementos(stack));
        System.out.println(stack.toString());
    }
}
