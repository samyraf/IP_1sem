import java.util.Locale;
import java.util.Scanner;

public class exe07 {
    /*
    TEXTO: O custo do selo de uma carta com até 50 gramas é de R$ 0,45. As cartas com peso superior pagam um 
    adicional de R$ 0,45 por cada 20 gramas, ou fração, em que excedem aquele peso. Escreva um algoritmo que 
    dado o peso da carta, em gramas, determine o custo do selo.
    */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int peso, pesoExcedente;
        double custo, custoExcedente;

        System.out.println("Informe o peso da carta em (g):");   
        peso = sc.nextInt();
        
        if (peso <= 50) {
            custo = 0.45;
        } else {
            peso -= 50;
            pesoExcedente = peso / 20;

            if (peso % 20 != 0) {
                pesoExcedente += 1;
            }

            custoExcedente = pesoExcedente * 0.45;
            custo = 0.45 + custoExcedente;
        }
        
        System.out.println("Preço total a pagar: R$ " + custo);
        sc.close();
        }
}

