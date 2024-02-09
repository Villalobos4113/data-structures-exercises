package Problema12_22;

public class Problema12 {
    public static boolean RevisorParentesis(String cadena) {
        ArrayStack<Character> stack = new ArrayStack<Character>();
        boolean resp = true;
        int i = 0;

        while (resp && i < cadena.length()) {
            if (Character.compare(cadena.charAt(i), '(') == 0)
                stack.push(cadena.charAt(i));
            if (Character.compare(cadena.charAt(i), ')') == 0){
                if (!(stack.isEmpty()))
                    stack.pop();
                else resp = false;
            }

            i++;
        }

        return resp && stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(RevisorParentesis("3*((34+87)-3(45)+(46/52)+(59+5))"));
        System.out.println(RevisorParentesis("(95-8)*(89/4))"));
        System.out.println(RevisorParentesis("3*(((648*5)-(978-65))+(1489/98))"));
    }
}
