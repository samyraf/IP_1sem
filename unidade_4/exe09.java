import java.util.Locale;
import java.util.Scanner;

public class exe09 {
    /*
    TEXTO: Dados dois valores inteiros, escreva um algoritmo que informe se eles são múltiplos ou não.
    */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("Informe o primeiro valor:");
        a = sc.nextInt();

        System.out.println("Informe o segundo valor:");
        b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("SÃO MÚLTIPLOS!");
        } else {
            System.out.println("NÃO SÃO MÚLTIPLOS!");
        }
        
        sc.close();
        }
}