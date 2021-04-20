import java.util.Locale;
import java.util.Scanner;

public class exe14 {
    /*
    TEXTO: Leia uma data e determine se ela é válida. Ou seja, verifique se o mês está entre 1 e 12, 
    e se o dia existe naquele mês. Note que fevereiro tem 29 dias em anos bissextos, e 28 dias 
    em anos não bissextos.
    */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int dia, mes, ano;

        System.out.println("Digite o dia:");
        dia = sc.nextInt();

        System.out.println("Digite o mês:");
        mes = sc.nextInt();

        System.out.println("Digite o ano:");
        ano = sc.nextInt();

        boolean ehDataValida = false;
        boolean ehAnoBissexto = (ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0);
        boolean ehMesValido = (mes >= 1 && mes <= 12);
        boolean ehMesDe31Dias = (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12);
        boolean contemAte31Dias = (dia >= 1 && dia <= 31);
        boolean ehMesDe30Dias = (mes == 4 || mes == 6 || mes == 9 || mes == 11);
        boolean contemAte30Dias = (dia >= 1 && dia <= 30);
        boolean ehFevereiro = (mes == 2);
        boolean contemAte28Dias = (dia >= 1 && dia <= 28);
        boolean contemAte29Dias = (dia >= 1 && dia <= 29);

        if (ehAnoBissexto) {
            if (ehMesValido) {
                if (ehMesDe31Dias) {
                    ehDataValida = contemAte31Dias;                        
                } else if (ehMesDe30Dias) {
                    ehDataValida =  contemAte30Dias;
                } else if (ehFevereiro) {
                    ehDataValida = contemAte29Dias;
                }
            } 
        } else if (ehMesValido) {
            if (ehMesDe31Dias) {
                ehDataValida = contemAte31Dias;
            } else if (ehMesDe30Dias) {
                ehDataValida = contemAte30Dias;
            } else if (ehFevereiro) {
                ehDataValida = contemAte28Dias;
            }
        }

        if(ehDataValida) {
            System.out.println("É UMA DATA VÁLIDA!");
        } else {
            System.out.println("NÃO É UMA DATA VÁLIDA!");
        }
        
        
        sc.close();
        }
}
