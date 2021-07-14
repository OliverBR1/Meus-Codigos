import java.util.ArrayList;
import java.util.List;

public class Primo {
    public static void main(String[] args) {
        List primo = new ArrayList();
        List naoPrimo = new ArrayList();
        for(int i = 1; i <= 20; i++ )
            if (primo(i) == true) {

                primo.add(i);
            } else {
                naoPrimo.add(i);
            }

        System.out.println("Primos: " + primo);
        System.out.println("Não primos: " + naoPrimo);

    }

    public static boolean primo(int num)
    {
        boolean p;
        int contador = 0;
        int i = 1;
        while(i <= num)
        {
            if (num  % i == 0)  contador++;
            i++;
        }

        if (contador <= 2 && num != 1 && num != 0) p = true;
        else p = false;
        return p;
    }
}
