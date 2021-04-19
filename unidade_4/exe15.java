import java.util.Locale;
import java.util.Scanner;

public class exe15 {
    /*
    TEXTO: Elabore um algoritmo para exibir o valor de reajuste que um funcionário receberá no seu salário. 
    A empresa irá conceder 5% de reajuste para o funcionário que for admitido há menos de 12 meses. 
    Para funcionário admitido entre 13 e 48 meses, irá conceder 7% de reajuste. O seu algoritmo deve solicitar 
    ao usuário que digite a quantidade de meses que o funcionário foi admitido.
    */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int meses;

        System.out.println("Informe a quantidade de meses que o funcionário foi admitido:");
        meses = sc.nextInt();

        if (meses >= 1 && meses <= 12) { 
            System.out.println("O VALOR DE REAJUSTE É DE 5%!");
        } else if (meses >= 13 && meses <= 48) {
            System.out.println("O VALOR DE REAJUSTE É DE 7%!");
        }
        
        sc.close();
        }
}