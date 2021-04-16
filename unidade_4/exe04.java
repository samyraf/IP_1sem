import java.util.Locale;
import java.util.Scanner;

public class exe04 {
    /*
    TEXTO: Dado um número de ponto flutuante maior do que 0, informe se foram digitadas 
    ou não casas decimais no número.
    */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            double num1;
        
            System.out.println("Digite um número de ponto flutuante maior do que 0:");
            num1 = sc.nextDouble();

            if (num1 != (int) num1) {
                System.out.println("O número possui casas decimais");
            } else {
                System.out.println("O número não possui casas decimais");
            }
            
        sc.close();
        }
}