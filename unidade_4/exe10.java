import java.util.Locale;
import java.util.Scanner;

public class exe10 {
    /*
    TEXTO: Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. Faça um algoritmo para 
    ler as idades dos filhos e exibir quem é o caçula da família; suponha que não haja empates.
    */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int lu, marq, ze;

        System.out.println("Informe a idade de Luluzinha:");
        lu = sc.nextInt();

        System.out.println("Informe a idade de Marquinhos:");
        marq = sc.nextInt();
        
        System.out.println("Informe a idade de Zezinho:");
        ze = sc.nextInt();

        if (lu < marq && lu < ze) {
            System.out.println("Luluzinha é a caçula da família!");
        } else if (marq < lu && marq < ze) {
            System.out.println("Marquinhos é o caçula da família!");
        } else {
            System.out.println("Zezinho é o caçula da família!");
        }

        sc.close();
        }
}