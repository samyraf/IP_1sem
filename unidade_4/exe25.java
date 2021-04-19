import java.util.Locale;
import java.util.Scanner;

public class exe25 {
    /*
    TEXTO: Faça um algoritmo que escreva o menu abaixo, leia uma opção do usuário e execute a 
    operação correspondente. O algoritmo deve exibir uma mensagem de erro se a opção for inválida. 
    O menu tem as seguintes opções: Escolha uma opção: 1 - Soma de dois números. 2 - Diferença entre 
    dois números. 3 - Produto entre dois números. 4 - Divisão entre dois números (o denominador não pode ser zero).
    */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int valor1, valor2, opcao, soma, diferenca, produto;
        double divisao;

        System.out.println("Informe dois valores inteiros:");
        valor1 = sc.nextInt();
        valor2 = sc.nextInt();

        System.out.println("Escolha uma opção: \n" +  "1 - Soma de dois números. \n" + 
        "2 - Diferença entre dois números. \n" + "3 - Produto entre dois números. \n" + 
        "4 - Divisão entre dois números (o denominador não pode ser zero).");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                soma = valor1 + valor2;
                System.out.println("O VALOR DA SOMA É: " + soma);
                break;
            case 2:
                diferenca = valor1 - valor2;
                System.out.println("O VALOR DA DIFERENÇA É: " + diferenca);
                break;
            case 3:
                produto = valor1 * valor2;
                System.out.println("O VALOR DO PRODUTO É: " + produto);
                break;
            case 4:
                divisao = valor1 / valor2;
                System.out.printf("O VALOR DA DIVISÃO É: %.2f ", divisao);
                break;
            default:
                System.out.println("ERRO! OPÇÃO INVÁLIDA.");
        }
        sc.close();
        }
}