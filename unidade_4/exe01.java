import java.util.Locale;
import java.util.Scanner;

public class exe01 {
    /* 
    TEXTO: A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 
    40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. 
    Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o valor por hora e escreva 
    o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas 
    (considere que o mês possua 4 semanas exatas).
    */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            int horasTrab;
            double valorHora, salFixo, valorExtra;

            System.out.println("Quantidade de horas trabalhadas no mês?");
            horasTrab = sc.nextInt();

            System.out.println("Valor pago por hora?");
            valorHora = sc.nextDouble();
            
            salFixo = horasTrab * valorHora;

            if (horasTrab > 160) {
                valorExtra = (horasTrab - 160) * (valorHora/2);
                salFixo += valorExtra;
            } 

            System.out.println("O salário total é: R$ " + salFixo);
            
        sc.close();
        }
}
