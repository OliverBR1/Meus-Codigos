import java.util.Stack;

public class Palindromo {
    public static void main(String[] args) {
        String f = "arara";
        String i = inverte(f);
        if(f.equals(i))
            System.out.println(f + " É palíndromo.");
        else
            System.out.println(f + " Não é palíndromo.=> " + i);
    }

    public static String inverte(String s){
        String inv = "";
        Stack <String> pilha = new Stack<String>();

        for (int i=0; i<s.length(); i++)
            pilha.push(s.charAt(i)+ "");

        while(!pilha.isEmpty())
            inv += pilha.pop();

        return inv ;
    }
}
