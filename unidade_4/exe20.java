import java.util.Locale;
import java.util.Scanner;

public class exe20 {
    /*
    TEXTO: Dadas 3 notas obtidas por um aluno em 3 provas e a média dos exercícios, descreva um algoritmo 
    que calcule a média de aproveitamento e o conceito do aluno. O algoritmo deve escrever a média de 
    aproveitamento, o conceito correspondente e a mensagem "aprovado" caso o conceito seja A, B ou C, e 
    "reprovado" caso o conceito seja D ou E.
    */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double notaP1, notaP2, notaP3, notaExc, media;

        System.out.println("Informe a nota da PROVA 1, PROVA 2, PROVA 3 e EXERCÍCIOS, respectivamente:");
        notaP1 = sc.nextDouble();
        notaP2 = sc.nextDouble();
        notaP3 = sc.nextDouble();
        notaExc = sc.nextDouble();

        media = (notaP1 + (notaP2 * 2) + (notaP3 * 3) + notaExc)/7;

        if (media >= 9.0) {
            System.out.println("Sua média é de: " + media + "  Você obteve o conceito: A");
            System.out.println("VOCÊ FOI APROVADO!");
        } else if (media >= 7.5 && media < 9.0) {
            System.out.println("Sua média é de: " + media + "  Você obteve o conceito: B");
            System.out.println("VOCÊ FOI APROVADO!");
        } else if (media >= 6.0 && media < 7.5) {
            System.out.println("Sua média é de: " + media + "  Você obteve o conceito: C");
            System.out.println("VOCÊ FOI APROVADO!");
        } else if ( media >= 4.0 && media < 6.0) {
            System.out.println("Sua média é de: " + media + "  Você obteve o conceito: D");
            System.out.println("VOCÊ FOI REPROVADO!");
        } else if (media < 4.0) {
            System.out.println("Sua média é de: " + media  + "  Você obteve o conceito: E");
            System.out.println("VOCÊ FOI REPROVADO!");
        }

        sc.close();
        }
}