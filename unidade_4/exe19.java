import java.util.Locale;
import java.util.Scanner;

public class exe19 {
    /*
    TEXTO: Dadas as coordenadas (X e Y) de um Ponto, você deve informar em qual quadrante ele está localizado.
    */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x, y;

        System.out.println("Informe as cordenada (X e Y) de um Ponto:");
        x = sc.nextInt();
        y = sc.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("O PONTO ESTÁ LOCALIZADO NO QUADRANTE: 0");
        } else if (x >= 0 && y >= 0) {
            System.out.println("O PONTO ESTÁ LOCALIZADO NO QUADRANTE: 1");
        } else if (x >= 0 && y < 0) {
            System.out.println("O PONTO ESTÁ LOCALIZADO NO QUADRANTE: 2");
        } else if (x < 0 && y < 0) {
            System.out.println("O PONTO ESTÁ LOCALIZADO NO QUADRANTE: 3");
        } else if (x < 0 && y >=0) {
            System.out.println("O PONTO ESTÁ LOCALIZADO NO QUADRANTE: 4");
        }
        
        sc.close();
        }
}
