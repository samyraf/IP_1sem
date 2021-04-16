import java.util.Locale;
import java.util.Scanner;

public class exe08 {
    /*
    TEXTO: Dado uma letra, escreva um algoritmo que informe se ela é ou não uma vogal.
    */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String entrada;
        char letra;

        System.out.println("Digite uma letra:");
        entrada = sc.nextLine().trim().toUpperCase();

        letra = entrada.charAt(0);

        if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("É UMA VOGAL!");
        } else {
            System.out.println("NÃO É UMA VOGAL!");
        }

        sc.close();
        }
}