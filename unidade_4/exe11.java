import java.util.Locale;
import java.util.Scanner;

public class exe11 {
    /*
    TEXTO: Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, escrever uma mensagem que 
    indique se eles são TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS. Considere que eles são GÊMEOS se dois deles 
    possuem a mesma idade e o outro diferente dos demais, e apenas irmãos se todas as idades forem diferentes.
    */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int pri, seg, ter;

        System.out.println("Digite o ano de nascimento do irmão 1:");
        pri = sc.nextInt();

        System.out.println("Digite o ano de nascimento do irmão 2:");
        seg = sc.nextInt();

        System.out.println("Digite o ano de nascimento do irmão 3:");
        ter = sc.nextInt();

        if (pri != seg && seg != ter && ter != pri) {
            System.out.println("SÃO APENAS IRMÃOS!");
        } else if (pri == seg && pri == ter) {
            System.out.println("SÃO TRIGÊMEOS!");
        } else {
            System.out.println("SÃO GÊMEOS");
        }

        sc.close();
        }
}