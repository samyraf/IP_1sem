import java.util.Locale;
import java.util.Scanner;

public class exe16 {
    /*
    TEXTO: Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres (considere que a idade entre 
    homens e mulheres sempre serão diferentes). Calcule e escreva a soma das idades do homem mais velho 
    com a mulher mais nova, e o produto das idades do homem mais novo com a mulher mais velha.
    */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int homem1, homem2, mulher1, mulher2, soma, produto;

        System.out.println("Digite a idade do primeiro e do segundo homem:");
        homem1 = sc.nextInt();
        homem2 = sc.nextInt();

        System.out.println("Digite a idade da primeira e da segunda mulher:");
        mulher1 = sc.nextInt();
        mulher2 = sc.nextInt();

        if (homem1 > homem2 && mulher1 > mulher2) {
            soma = homem1 + mulher2;
            produto = homem2 * mulher1;

            System.out.println("SOMA = " + soma);
            System.out.println("PRODUTO = " + produto);

        } else if (homem1 < homem2 && mulher1 < mulher2) {
            soma = homem2 + mulher1;
            produto = homem1 * mulher2;
            
            System.out.println("SOMA = " + soma);
            System.out.println("PRODUTO = " + produto);
        }

        sc.close();
        }
}
