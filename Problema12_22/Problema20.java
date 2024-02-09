package Problema12_22;

public class Problema20 {

    public static int intToBin(int n) {
        ArrayStack<Integer> stack = new ArrayStack<Integer>();
        int resp = 0;

        if (n > 1) {
            int i = (int) (Math.log10(n)/Math.log10(2)), exp = (int) Math.pow(2, i);

            while (i >= 0) {
                if (n - exp >= 0) {
                    stack.push((int) Math.pow(10, i));
                    n -= exp;
                }

                i--;

                exp = (int) Math.pow(2, i);
            }

            while (!(stack.isEmpty()))
                resp += stack.pop();
        } else
            resp = n;

        return resp;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++)
            System.out.println(i + ":\t" + intToBin(i));
    }
}
