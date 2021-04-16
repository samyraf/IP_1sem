import java.util.Locale;
import java.util.Scanner;

public class exe12{
    /*
    TEXTO: Dados 3 valores lado1, lado2, lado3, que representam os comprimentos dos lados de um triângulo, 
    descreva um algoritmo que verifique se os mesmos podem ser os comprimentos dos lados de um triângulo. 
    Em caso afirmativo, verifique e informe se é "triângulo equilátero", "triângulo isósceles" ou 
    "triângulo escaleno". Em caso negativo, informe que os mesmos não formam um triângulo. 
    */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int lado1, lado2, lado3;

        System.out.println("Informe o valor do LADO 1:");
        lado1 = sc.nextInt();

        System.out.println("Informe o valor do LADO 2:");
        lado2 = sc.nextInt();

        System.out.println("Informe o valor do LADO 3:");
        lado3 = sc.nextInt();
        
        if (lado1 >= lado2 + lado3 || lado2 >= lado3 + lado1 || lado3 >= lado1 + lado2){
            System.out.println("TRIÂNGULO INEXISTENTE!");
        } else if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("É UM TRIÂNGULO EQUILÁTERO!");
        } else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
            System.out.println("É UM TRIÂNGULO ESCALENO!");
        } else {
            System.out.println("É UM TRIÂNGULO ISÓCELES!");
        } 
       
        sc.close();
        }
}