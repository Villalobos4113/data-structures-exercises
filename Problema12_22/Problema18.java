package Problema12_22;

public class Problema18 {
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

            if (Character.compare(cadena.charAt(i), '[') == 0)
                stack.push(cadena.charAt(i));
            if (Character.compare(cadena.charAt(i), ']') == 0){
                if (!(stack.isEmpty()))
                    stack.pop();
                else resp = false;
            }

            if (Character.compare(cadena.charAt(i), '{') == 0)
                stack.push(cadena.charAt(i));
            if (Character.compare(cadena.charAt(i), '}') == 0){
                if (!(stack.isEmpty()))
                    stack.pop();
                else resp = false;
            }

            i++;
        }

        return resp && stack.isEmpty();
    }

    public static boolean RevisorParentesisRecursive(String cadena) {
        boolean resp = true;
        int i = 0;

        while (resp && i < cadena.length()) {
            if (Character.compare(cadena.charAt(i), '{') == 0)
                RevisorParentesisRecursive(cadena, i, resp, '{', '}');
            if (Character.compare(cadena.charAt(i), '[') == 0)
                RevisorParentesisRecursive(cadena, i, resp, '[', ']');
            if (Character.compare(cadena.charAt(i), '(') == 0)
                RevisorParentesisRecursive(cadena, i, resp, '(', ')');

            i++;
        }

        return resp;
    }

    private static boolean RevisorParentesisRecursive(String cadena, int i, boolean resp, char abre, char cierra) {
        boolean found = false;
        int j = i;

        while (resp && j < cadena.length() && !found) {
            if (Character.compare(cadena.charAt(j), cierra) == 0)
                found = true;
            if (Character.compare(cadena.charAt(j), abre) == 0) {
                resp = false;
                found = true;
            }
            if (isParentesis(cadena.charAt(j)))
                RevisorParentesisRecursive(cadena, j, resp, cadena.charAt(j), closeParentesis(cadena.charAt(j)));

            j++;
        }
        return resp && found;
    }

    private static boolean isParentesis(char c) {
        if (Character.compare(c, '{') == 0)
            return true;
        if (Character.compare(c, '[') == 0)
            return true;
        if (Character.compare(c, '(') == 0)
            return true;
        return false;
    }

    private static char closeParentesis(char c) {
        if (Character.compare(c, '{') == 0)
            return '}';
        if (Character.compare(c, '[') == 0)
            return ']';
        if (Character.compare(c, '(') == 0)
            return ')';
        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(RevisorParentesis("3*{[(648*5)-(978-65)]+[1489/98]}"));
        System.out.println(RevisorParentesis("{669} - ((267829*894)/[356*84]"));
        System.out.println(RevisorParentesis("45/6"));
        System.out.println(RevisorParentesis(""));

        System.out.println();

        System.out.println(RevisorParentesisRecursive("3*{[(648*5)-(978-65)]+[1489/98]}"));
        System.out.println(RevisorParentesisRecursive("{669} - ((267829*894)/[356*84]"));
    }
}
