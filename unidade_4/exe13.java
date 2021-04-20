import java.util.Locale;
import java.util.Scanner;

public class exe13 {
    /*
    TEXTO: Escreva um algoritmo que obtém do usuário 3 valores inteiros 
    representando as três cartas deste usuário em uma mão de jogo de truco 
    (1 = AS; 2 = 2; 3 = 3; 7 = 7; 11 = Valete; 12 = Dama; 13 = Rei). O algoritmo 
    deve imprimir na tela a palavra "TRUCO" (se APENAS UMA das três cartas for AS, 2 ou 3), 
    "SEIS" (se APENAS DUAS das três cartas for AS, 2 ou 3) ou "NOVE" (se AS TRÊS cartas 
    forem AS, 2 ou 3). Se não houver AS, 2 ou 3 nas três cartas, não é impresso nada.
    */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int c1, c2, c3;

        System.out.println("Digite o valor da carta 1, carta 2 e carta 2, respectivamente:");
        c1 = sc.nextInt();
        c2 = sc.nextInt();
        c3 = sc.nextInt();

        if ((c1!=1 && c1!=2 && c1!=3) && (c2!=1 && c2!=2 && c2!=3) && (c3!=1 && c3!=2 && c3!=3)) {
            System.out.println("");
        } else if ((c1==1 || c1==2 || c1==3) && (c2==1 || c2==2 || c2==3) && (c3==1 || c3==2 || c3==3)) {
            System.out.println("NOVE");
        } else if (((c1==1 || c1==2 || c1==3) && (c2==1 || c2==2 || c2==3) && (c3!=1 || c3!=2 || c3!=3)) || ((c1==1 || c1==2 || c1==3) && (c2!=1 || c2!=2 || c2!=3) && (c3==1 || c3==2 || c3==3)) || ((c1!=1 || c1!=2 || c1!=3) && (c2==1 || c2==2 || c2==3) && (c3==1 || c3==2 || c3==3))) {
            System.out.println("SEIS");
        } else {
            System.out.println("TRUCO");
        }

        sc.close();
        }
}