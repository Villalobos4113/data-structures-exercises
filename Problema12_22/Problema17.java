package Problema12_22;

public class Problema17 {
    public static void eliminaRepetidos(ArrayStack stack) {
        ArrayStack<Object> auxStack = new ArrayStack<Object>();
        Object aux = null;

        while(!(stack.isEmpty())) {
            if (!(stack.peek().equals(aux)))
                auxStack.push(stack.pop());
            else
                stack.pop();

            aux = auxStack.peek();
        }

        while (!(auxStack.isEmpty()))
            stack.push(auxStack.pop());
    }

    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<Integer>();

        for (int i = 0; i < 10; i++) {
            stack.push(i);
            stack.push(i);
            stack.push(i);
        }

        System.out.println(stack.toString());

        eliminaRepetidos(stack);

        System.out.println(stack.toString());
    }
}
