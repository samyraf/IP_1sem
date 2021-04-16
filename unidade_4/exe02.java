import java.util.Locale;
import java.util.Scanner;

public class exe02 {
    /*
    TEXTO: Dado um valor inteiro maior do que 0 informe se o valor é par ou ímpar.
    */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            int num;
            
            System.out.println("Digite um número inteiro maior que 0:");
            num = sc.nextInt();

            if (num % 2 == 0) {
                System.out.println("SEU NÚMERO É PAR");
            } else {
                System.out.println("SEU NÚMERO É ÍMPAR");
            }
           
        sc.close();
        } 
}
