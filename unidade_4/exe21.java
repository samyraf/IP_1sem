import java.util.Locale;
import java.util.Scanner;

public class exe21 {
    /*
    TEXTO: O índice de massa corporal (IMC) é uma medida internacional usada para calcular se uma pessoa 
    está no peso ideal. O IMC é determinado pela divisão da massa do indivíduo pelo quadrado de sua altura, 
    onde a massa está em quilogramas e a altura está em metros. Faça um algoritmo para classificar o IMC 
    e dizer o grau de obesidade do indivíduo.
    */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double massa, altura, imc;

        System.out.println("Informe sua massa (kg):");
        massa = sc.nextDouble();

        System.out.println("Informe sua altura (m):");
        altura = sc.nextDouble();

        imc = massa / Math.pow(altura, 2);

        if (imc < 18.5) {
            System.out.println("MAGREZA");
        } else if (imc >= 18.5 && imc <= 24.5) {
            System.out.println("SAUDÁVEL");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("SOBREPESO");
        } else if (imc >= 30.0 && imc <= 34.5) {
            System.out.println("OBESIDADE GRAU I");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("OBESIDADE GRAU II (severa)");
        } else if (imc >= 40.0) {
            System.out.println("OBESIDADE GRAU III (mórbida)");
        }
        
        sc.close();
        }
}