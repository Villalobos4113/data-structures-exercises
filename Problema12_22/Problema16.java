package Problema12_22;

import java.util.ArrayList;

public class Problema16 {
    public static void invertir(StackADT stack) {
        ArrayList arrayList = new ArrayList();

        while (!(stack.isEmpty()))
            arrayList.add(stack.pop());

        for (int i = 0; i < arrayList.size(); i++)
            stack.push(arrayList.get(i));
    }

    public static void main(String[] args) {
        ArrayStack<Integer> stack1 = new ArrayStack<Integer>();

        for (int i = 0; i < 10; i++)
            stack1.push(i);

        System.out.println(stack1.toString());

        invertir(stack1);

        System.out.println(stack1.toString());
    }
}
