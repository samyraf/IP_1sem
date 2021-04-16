import java.util.Locale;
import java.util.Scanner;

public class exe06 {
    /*
    TEXTO: Faça um algoritmo que leia um caractere. Caso seja digitada a letra 'M' escreva “Masculino”. 
    Se for digitada a letra 'F' escreva “Feminino”. Se for informado 'I' escreva “Não Informado”. 
    Qualquer outra letra digitada escreva “Entrada Incorreta”. Atenção: antes de testar a letra, 
    converta-a para maiúscula.
    */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            String entrada;
            char letra;

            System.out.println("Digite UM caractere:");
            entrada = sc.nextLine().trim().toUpperCase();

            letra = entrada.charAt(0);

            if (letra == 'M') {
                System.out.println("MASCULINO"); 
            } else if (letra == 'F') {
                System.out.println("FEMININO");
            } else if (letra == 'I') {
                System.out.println("NÃO INFORMADO");
            } else {
                System.out.println("ENTRADA INCORRETA");
            }
            
        sc.close();
        }
}
