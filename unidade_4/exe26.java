import java.util.Locale;
import java.util.Scanner;

public class exe26 {
    /*
    TEXTO: Dado um caractere indicando uma opção, escreva um algoritmo para:

    se opção = ‘T’: calcular a área de um triângulo de base b e altura h
    se opção = ‘Q’: calcular a área de um quadrado de lado l
    se opção = ‘R’: calcular a área de um retângulo de base b e altura h
    se opção = ‘C’: calcular a área de um círculo de raio r
    */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String entrada;
        char letra;
        double base, altura, lado, raio, area;

        System.out.println("Informe a opção desejada: \n" + "\nT - calcular a área de um triângulo \n" 
        + "Q - calcular a área de um quadrado \n" + "R - calcular a área de um retângulo \n"
        + "C - calcular a área de um círculo");
        entrada = sc.nextLine().trim().toUpperCase();

        letra = entrada.charAt(0);

        switch (letra) {
            case 'T':
                System.out.println("Digite o valor da base (b) e o valor da altura (h), respectivamente:");
                base = sc.nextDouble();
                altura = sc.nextDouble();
                area = (base * altura)/2;

                System.out.println("O valor da área do triângulo é de: " + area);
                break;
            case 'Q':
                System.out.println("Digite o valor do lado do quadrado:");
                lado = sc.nextDouble();
                area = Math.pow(lado, 2);

                System.out.println("O valor da área do triângulo é de: " + area);
                break;
            case 'R':
                System.out.println("Digite o valor da base (b) e o valor da altura (h), respectivamente:");
                base = sc.nextDouble();
                altura = sc.nextDouble();
                area = base * altura;

                System.out.println("O valor da área do retângulo é de: " + area);
                break;
            case 'C':
                System.out.println("Digite o valor do raio (r):");
                raio = sc.nextDouble();
                area = 3.14 * Math.pow(raio, 2);

                System.out.println("O valor da área do círculo é de: " + area);
                break;
            default:
                System.out.println("Opção inválida!");
        }
        
        sc.close();
        }
}