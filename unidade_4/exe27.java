import java.util.Locale;
import java.util.Scanner;

public class exe27 {
    /*
    TEXTO: s tarifas de um estacionamento são as seguintes:

    1° e 2° hora - R$ 5,00 cada
    3° e 4° hora - R$ 7,50 cada
    5° hora e seguintes - R$ 10,00 cada
    */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe à hora de Chegada:");
        int horasChegada = sc.nextInt();
        int minutosChegada = sc.nextInt();

        System.out.println("Informe à hora de Saída:");
        int horasSaida = sc.nextInt();
        int minutosSaida = sc.nextInt();

        if (horasSaida < horasChegada) {
            horasSaida = horasSaida + 24;
        }
        int diferencaDeHoras = horasSaida - horasChegada;
        int diferencaDeMinutos = minutosSaida-minutosChegada;
        
            if (diferencaDeMinutos>30){
            diferencaDeHoras++;
            }
        switch (diferencaDeHoras) {
            case 0 :
            int valor0 = 5;
            System.out.println("Entrada: "+horasChegada+":"+minutosChegada+" Saída: "+horasSaida+":"+minutosSaida+" Valor à ser pago: R$ "+ (valor0));
            break;
            case 1 :
                int valor1 = diferencaDeHoras*5;
                System.out.println("Entrada: "+horasChegada+":"+minutosChegada+" Saída: "+horasSaida+":"+minutosSaida+" Valor à ser pago: R$ "+ (valor1));
            break;
            case 2 :
                int valor2 = diferencaDeHoras*5;
                System.out.println("Entrada: "+horasChegada+":"+minutosChegada+" Saída: "+horasSaida+":"+minutosSaida+" Valor à ser pago: R$ "+ (valor2));
            break;
            case 3 :
                double valor3 = diferencaDeHoras*7.50;
                System.out.println("Entrada: "+horasChegada+":"+minutosChegada+" Saída: "+horasSaida+":"+minutosSaida+" Valor à ser pago: R$ "+ (valor3));
            break;
            case 4 :
                double valor4 = diferencaDeHoras*7.50;
                System.out.println("Entrada: "+horasChegada+":"+minutosChegada+" Saída: "+horasSaida+":"+minutosSaida+" Valor à ser pago: R$ "+ (valor4));
                break;
            default :
            if (diferencaDeHoras>5||diferencaDeHoras==5){
            int valor5 = diferencaDeHoras*10;
                System.out.println("Entrada: "+horasChegada+":"+minutosChegada+" Saída: "+horasSaida+":"+minutosSaida+" Valor à ser pago: R$ "+ (valor5));
            }
        }
        sc.close();
        }
}