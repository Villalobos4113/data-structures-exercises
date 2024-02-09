package Problema12_22;

import java.util.ArrayList;

public class Problema22 {
    public static boolean equals(ArrayStack stack1, ArrayStack stack2) {
        boolean resp;

        if (stack1 instanceof ArrayStack<?> && stack2 instanceof ArrayStack<?>) {
            ArrayList<Object> arrayList1 = new ArrayList<Object>(), arrayList2 = new ArrayList<Object>();

            while (!(stack1.isEmpty()))
                arrayList1.add(stack1.pop());

            for (int i = arrayList1.size() - 1; i >= 0; i--)
                stack1.push(arrayList1.get(i));

            while (!(stack2.isEmpty()))
                arrayList2.add(stack2.pop());

            for (int i = arrayList2.size() - 1; i >= 0; i--)
                stack2.push(arrayList2.get(i));

            resp = arrayList1.equals(arrayList2);
        } else
            resp = false;

        return resp;
    }

    public static void main(String[] args) {
        ArrayStack<Integer> arrayStack1 = new ArrayStack<Integer>(), arrayStack2 = new ArrayStack<Integer>(), arrayStack3 = new ArrayStack<Integer>(), arrayStack4 = new ArrayStack<Integer>();

        for (int i = 0; i < 10; i++) {
            arrayStack1.push(i);
            arrayStack2.push(i);
        }

        for (int i = 0; i < 9; i++)
            arrayStack3.push(i);

        for (int i = 9; i >= 0; i--)
            arrayStack4.push(i);

        System.out.println();

        System.out.println("Array Stack 1: " + arrayStack1.toString());
        System.out.println("Array Stack 2: " + arrayStack2.toString());
        System.out.println("Array Stack 3: " + arrayStack3.toString());
        System.out.println("Array Stack 4: " + arrayStack4.toString());

        System.out.println();

        System.out.println("=============Instance=============");
        System.out.println("Array Stack 1 + Array Stack 1: " + arrayStack1.equals(arrayStack1));
        System.out.println("Array Stack 1 + Array Stack 2: " + arrayStack1.equals(arrayStack2));
        System.out.println("Array Stack 1 + Array Stack 3: " + arrayStack1.equals(arrayStack3));
        System.out.println("Array Stack 1 + Array Stack 4: " + arrayStack1.equals(null));

        System.out.println();

        System.out.println("==============Static==============");
        System.out.println("Array Stack 1 + Array Stack 1: " + equals(arrayStack1, arrayStack1));
        System.out.println("Array Stack 1 + Array Stack 2: " + equals(arrayStack1, arrayStack2));
        System.out.println("Array Stack 1 + Array Stack 3: " + equals(arrayStack1, arrayStack3));
        System.out.println("Array Stack 1 + Array Stack 4: " + equals(arrayStack1, arrayStack4));
        System.out.println(equals(null, null));
    }
}
