package Problema12_22;

public class Problema13 {
    public static String InvierteCad(String cadenaInicial) {
        ArrayStack<Character> stack = new ArrayStack<Character>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < cadenaInicial.length(); i++)
            stack.push(cadenaInicial.charAt(i));

        for (int i = 0; i < cadenaInicial.length(); i++)
            sb.append(stack.pop());

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(InvierteCad("Hola Mundo"));
        System.out.println(InvierteCad("Mi nombre es Fernando Villalobos"));
    }
}
