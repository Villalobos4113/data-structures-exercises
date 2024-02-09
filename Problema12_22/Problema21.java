package Problema12_22;

public class Problema21 {
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<Integer>();

        for (int i = 0; i < 10; i++)
            stack.push(i);

        System.out.println("Stack antes del multiPop:\t" + stack);
        stack.multiPop(5);
        System.out.println("Stack despues del multiPop(5):\t" + stack);

        System.out.println("\nStack antes del multiPop:\t" + stack);
        stack.multiPop(10);
        System.out.println("Stack despues del multiPop(10):\t" + stack);
    }
}
