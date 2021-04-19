import java.util.Locale;
import java.util.Scanner;

public class exe23 {
    /*
    Escreva um algoritmo que leia um número inteiro positivo representando um determinado mês 
    do ano e escreva o mês por extenso. Para valores maiores do que 12 informe que o valor não é válido.
    */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int mes;

        System.out.println("Informe um número inteiro:");
        mes = sc.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Mês de JANEIRO");
                break;
            case 2:
                System.out.println("Mês de FEVEREIRO");
                break;
            case 3:
                System.out.println("Mês de MARÇO");
                break;
            case 4:
                System.out.println("Mês de ABRIL");
                break;
            case 5: 
                System.out.println("Mês de MAIO");
                break;
            case 6: 
                System.out.println("Mês de JUNHO");
                break;
            case 7:
                System.out.println("Mês de JULHO");
                break;
            case 8:
                System.out.println("Mês de AGOSTO");
                break;
            case 9:
                System.out.println("Mês de SETEMBRO");
                break;
            case 10:
                System.out.println("Mês de OUTUBRO");
                break;
            case 11:
                System.out.println("Mês de NOVEMBRO");
                break;
            case 12:
                System.out.println("Mês de DEZEMBRO");
                break;
            default:
                System.out.println("O valor não é válido!");
        }
        
        sc.close();
        }
}