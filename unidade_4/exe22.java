import java.util.Locale;
import java.util.Scanner;

public class exe22 {
    /*
    TEXTO: Um aluno está em dúvida sobre o título que vai receber após concluir seu curso de graduação. 
    Considerando que o sistema apresenta 3 cursos disponíveis (1 – Ciência da Computação, 
    2 – Licenciatura da Computação e 3 – Sistemas de Informação) descreva um algoritmo para ler a opção 
    do aluno e escrever uma mensagem informando o título que o aluno vai receber caso opte por aquele curso. 
    As titulações são respectivamente: "Bacharel em Ciência da Computação", "Licenciado em Computação" e 
    "Bacharel em Sistemas de Informação".
    */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int curso;

        System.out.println("Digite o número do seu curso: \n" + "1 - Ciência da Computação \n" + 
        "2 - Licenciatura da Computação \n"+ "3 - Sistemas de Informação ");
        curso = sc.nextInt();

        switch (curso) {
            case 1: 
                System.out.println("Bacharel em Ciência da Computação");
                break;
            case 2: 
                System.out.println("Licenciado em Computação");
                break;
            case 3:
                System.out.println("Bacharel em Sistemas de Informação");
                break;
            default: System.out.println("Curso inválido");
        }

        sc.close();
        }
}