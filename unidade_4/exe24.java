import java.util.Locale;
import java.util.Scanner;

public class exe24 {
    /*
    TEXTO: Dados 3 valores, escreva um algoritmo que os informe em uma determinada ordem a partir 
    de um menu de opções:

    se opção = 1, escreva os 3 valores em ordem crescente
    se opção = 2, escreva os 3 valores em ordem decrescente
    se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio
    */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int valor1, valor2, valor3, opcao;

        System.out.print("Informe o valor 1: ");
        valor1 = sc.nextInt();

        System.out.print("Informe o valor 2: ");
        valor2 = sc.nextInt();

        System.out.print("Informe o valor 3: ");
        valor3 = sc.nextInt();

        System.out.println("Informe a opção desejada: \n 1 - (decrescente), 2 - (crescente), 3 - (maior no meio: ");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                if (valor1 > valor2 && valor1 > valor3) {
                    System.out.println(valor1);

                    if (valor2 > valor3) {
                        System.out.println(valor2);
                        System.out.println(valor3);
                    } else {
                        System.out.println(valor3);
                        System.out.println(valor2);
                    }

                } else {
                    if (valor2 > valor1 && valor2 > valor3) {
                        System.out.println(valor2);

                        if (valor1 > valor3)  {
                            System.out.println(valor1);
                            System.out.println(valor3);
                        } else {
                            System.out.println(valor3);
                            System.out.println(valor1);
                        }

                    } else {
                        System.out.println(valor3);

                        if (valor1 > valor2) {
                            System.out.println(valor1);
                            System.out.println(valor2);
                        } else {
                            System.out.println(valor2);
                            System.out.println(valor1);
                        }
                    }
                }
                break; 
            case 2:
                
                if (valor1 < valor2 && valor1 < valor3) {
                    System.out.println(valor1);
                } else {
                    if (valor2 < valor1 && valor2 < valor3) {
                        System.out.println(valor2);
                    } else {
                        System.out.println(valor3);
                    }
                }

                
                if ((valor1 > valor2 && valor1 < valor3) || (valor1 > valor3 && valor1 < valor2)) { //5 4 6 | 5 6 4
                    System.out.println(valor1);
                } else {
                    if ((valor2 > valor1 && valor2 < valor3) || (valor2 > valor3 && valor2 < valor1)) {
                        System.out.println(valor2);
                    } else {
                        System.out.println(valor3);
                    }
                }

                
                if (valor1 > valor2 && valor1 > valor3) {
                    System.out.println(valor1);
                } else {
                    if (valor2 > valor1 && valor2 > valor3) {
                        System.out.println(valor2);
                    } else {
                        System.out.println(valor3);
                    }
                }
                break; 
            case 3:
                
                if (valor1 > valor2 && valor1 > valor3) {
                    System.out.println(valor2);
                    System.out.println(valor1);
                    System.out.println(valor3);
                } else {
                    if (valor2 > valor1 && valor2 > valor3) {
                        System.out.println(valor1);
                        System.out.println(valor2);
                        System.out.println(valor3);
                    } else {
                        System.out.println(valor1);
                        System.out.println(valor3);
                        System.out.println(valor2);
                    }
                }
                break;

            default:
                System.out.println("Opção inválida");
        sc.close();
        }
    }
}