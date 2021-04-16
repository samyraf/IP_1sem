import java.util.Locale;
import java.util.Scanner;

public class exe05 {
    /*
    TEXTO: Dada uma pergunta, “a cor é azul?”, faça um programa que leia uma variável lógica com a resposta 
    e responda “Sim”, caso a resposta seja true, ou “Não”, caso seja false.
    */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            boolean resp;
        
            System.out.println("A cor é azul?");
            resp = sc.nextBoolean();

            if (resp){ 
                System.out.println("SIM");
            } else {
                System.out.println("NÃO");
            }
            
        sc.close();
        }
}