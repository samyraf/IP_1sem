import java.util.Locale;
import java.util.Scanner;

public class exe03 {
    /*
    TEXTO: Dados dois números inteiros descreva um algoritmo para informar o maior valor entre eles.
    */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            int num1, num2;
            
            System.out.println("Digite 2 números inteiros:");
            num1 = sc.nextInt();
            num2 = sc.nextInt();

            if (num1 > num2) {
                System.out.println(num1 + " é o número maior");
            } else {
                System.out.println(num2 + " é o número maior");
            }
            
        sc.close();
        }
}
