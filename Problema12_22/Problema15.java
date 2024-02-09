package Problema12_22;

import java.util.ArrayList;

public class Problema15 {
    public static boolean ContieneSecuencial(ArrayStack stack1, ArrayStack stack2) {
        ArrayList<Object> arrayList1 = new ArrayList<Object>(), arrayList2 = new ArrayList<Object>();

        while (!(stack1.isEmpty()))
            arrayList1.add(stack1.pop());

        for (int i = arrayList1.size() - 1; i >= 0; i--)
            stack1.push(arrayList1.get(i));

        while (!(stack2.isEmpty()))
            arrayList2.add(stack2.pop());

        for (int i = arrayList2.size() - 1; i >= 0; i--)
            stack2.push(arrayList2.get(i));

        return arrayList1.equals(arrayList2);
    }

    public static boolean Contiene(ArrayStack stack1, ArrayStack stack2) {
        ArrayList<Object> arrayList1 = new ArrayList<Object>(), arrayList2 = new ArrayList<Object>();
        boolean resp = true;

        while (!(stack1.isEmpty()))
            arrayList1.add(stack1.pop());

        for (int i = arrayList1.size() - 1; i >= 0; i--)
            stack1.push(arrayList1.get(i));

        while (!(stack2.isEmpty()))
            arrayList2.add(stack2.pop());

        for (int i = arrayList2.size() - 1; i >= 0; i--)
            stack2.push(arrayList2.get(i));

        if (arrayList1.size() <= arrayList2.size()) {
            int i = 0, j = 0;
            boolean found = false;

            while (resp && i < arrayList1.size()) {
                j = 0;
                found = false;

                while (j < arrayList2.size() && !found) {
                    if (arrayList1.get(i).equals(arrayList2.get(j))) {
                        found = true;
                        arrayList2.remove(j);
                    }

                    j++;
                }

                if (!found)
                    resp = false;

                i++;
            }
        } else
            resp = false;

        return resp;
    }

    public static void main(String[] args) {
        ArrayStack<Integer> arrayStack1 = new ArrayStack<Integer>(), arrayStack2 = new ArrayStack<Integer>(), arrayStack3 = new ArrayStack<Integer>(), arrayStack4 = new ArrayStack<Integer>();

        for (int i = 0; i < 10; i++)
            arrayStack1.push(i);

        for (int i = 10; i < 20; i++)
            arrayStack2.push(i);

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

        System.out.println("=========ContieneSecuencial=========");
        System.out.println("Array Stack 1 + Array Stack 1: " + ContieneSecuencial(arrayStack1, arrayStack1));
        System.out.println("Array Stack 1 + Array Stack 2: " + ContieneSecuencial(arrayStack1, arrayStack2));
        System.out.println("Array Stack 1 + Array Stack 3: " + ContieneSecuencial(arrayStack1, arrayStack3));
        System.out.println("Array Stack 1 + Array Stack 4: " + ContieneSecuencial(arrayStack1, arrayStack4));

        System.out.println();

        System.out.println("==============Contiene==============");
        System.out.println("Array Stack 1 + Array Stack 1: " + Contiene(arrayStack1, arrayStack1));
        System.out.println("Array Stack 1 + Array Stack 2: " + Contiene(arrayStack1, arrayStack2));
        System.out.println("Array Stack 1 + Array Stack 3: " + Contiene(arrayStack1, arrayStack3));
        System.out.println("Array Stack 1 + Array Stack 4: " + Contiene(arrayStack1, arrayStack4));
    }
}
