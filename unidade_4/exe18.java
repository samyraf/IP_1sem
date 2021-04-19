import java.util.Locale;
import java.util.Scanner;

public class exe18 {
    /*
    TEXTO: Uma loja que trabalha com crediário funciona da seguinte maneira: se o pagamento ocorre até 
    o dia do vencimento, o cliente ganha 10% de desconto e é avisado que o pagamento está em dia. Se o 
    pagamento é realizado até cinco dias após o vencimento o cliente perde o desconto, e se o pagamento 
    atrasa mais de cinco dias, é cobrada uma multa de 2% por cada dia de atraso. Faça um algoritmo que 
    leia o dia do vencimento, o dia do pagamento e o valor da prestação e calcule o valor a ser pago pelo 
    cliente, exibindo as devidas mensagens. Suponha que todo vencimento ocorre até o dia dez de cada mês e 
    os clientes nunca deixam para pagar no mês seguinte.
    */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int diaVenc, diaPag, atraso, multa;
        double valorPrest;

        System.out.println("Digite o dia do vencimento:");
        diaVenc = sc.nextInt();

        System.out.println("Digite o dia do pagamento:");
        diaPag = sc.nextInt();

        System.out.println("Digite o valor da prestação:");
        valorPrest = sc.nextDouble();

        boolean ateDiaDoVenc = (diaPag >= 1 && diaPag <= 10);
        boolean atrasoCincoDias = (diaPag >= 10 && diaPag <= 15);
        boolean atrasoMaisDeCincoDias = (diaPag > 15);

        if (ateDiaDoVenc) {
            valorPrest -= valorPrest/10;
            System.out.println("SEU PAGAMENTO ESTÁ EM DIA!");
            System.out.println("O valor do seu pagamento foi de: R$ " + valorPrest);
        } else if (atrasoCincoDias) {
            System.out.println("DEVIDO AO ATRASO, VOCÊ PERDEU SEU DESCONTO DE 10%!");
            System.out.println("O valor do seu pagamento foi de: R$ " + valorPrest);
        } else if (atrasoMaisDeCincoDias) {
            atraso = diaPag - 15;
            multa = atraso * 2;
            valorPrest += (valorPrest/100 * multa);
            System.out.println("DEVIDO AO ATRASO SUPERIOR A 5 DIAS, FOI COBRADA UMA MULTA DE 2% POR CADA DIA DE ATARSO!");
            System.out.println("O valor do seu pagamento foi de: R$ " + valorPrest);
        }

        sc.close();
        }
}