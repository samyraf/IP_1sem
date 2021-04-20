import java.util.Locale;
import java.util.Scanner;

public class exe17 {
    /*
    TEXTO: Para realizar o cálculo do Imposto de Renda a ser pago, é solicitado a renda anual e 
    o número de dependentes do contribuinte. A renda líquida é calculada sobre a renda anual 
    com um desconto de 2% para cada dependente do contribuinte. O contribuinte com uma renda 
    líquida de até R$ 2.000,00 não paga imposto. Para aqueles que possuem renda líquida entre 
    R$ 2.000,00 e R$ 5.000,00 o imposto é de 5% sobre o valor da renda líquida; para rendas 
    líquidas de R$ 5.000,00 até R$ 10.000,00 é de 10%. Rendas superiores a R$ 10.000,00 
    pagam 15% de imposto.
    */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numDependentes;
        double rendaAnual, rendaLiq; 

        System.out.print("Informe sua renda anual: ");
        rendaAnual = sc.nextDouble();

        System.out.print("Informe o número de dependentes: ");
        numDependentes = sc.nextInt();

        rendaLiq = (rendaAnual - (numDependentes * 2)/100 * rendaAnual);

        boolean naoPagaImposto = (rendaLiq <= 2.000);
        boolean impostoCintoPorc = (rendaLiq > 2.000 && rendaLiq <= 5.000);
        boolean impostoDezPorc = (rendaLiq >= 5.000 && rendaLiq <= 10.000);
        boolean impostoQuinzePorc = (rendaLiq > 10.000);

        if (naoPagaImposto) {
            System.out.println("VOCÊ NÃO PAGA IMPOSTO!");
        } else if (impostoCintoPorc) {
            rendaLiq = (5/100) * rendaLiq;
            System.out.println("SEU IMPOSTO É DE: R$ " + rendaLiq);
        } else if (impostoDezPorc) {
            rendaLiq = (10/100) * rendaLiq;
            System.out.println("SEU IMPOSTO É DE: R$  " + rendaLiq);
        } else if (impostoQuinzePorc) {
            rendaLiq = (15/100) * rendaLiq;
            System.out.println("SEU IMPOSTO É DE: R$  " + rendaLiq);
        }

        sc.close();
        }
}