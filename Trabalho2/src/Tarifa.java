import java.util.Scanner;


public class Tarifa {

    static Scanner entrada = new Scanner(System.in);
    public static final double moto = 5;
    public static final double carro = 8;


    public static double calculaTarifa(double horas, char tipo) {
        double tarifa = 0;
        switch (tipo) {
            case 'C':
                tarifa = horas * carro;
                break;
            case 'M':
                tarifa = horas * moto;
                break;
            default:
                System.out.println("Veículo não identificado");

        }
        return tarifa;
    }

    public static double calculataxa(double horas, double tarifa, char fim) {
        if (fim == 's') {
            tarifa += tarifa * 0.05;
        }
        if (horas > 5) {
            tarifa -= tarifa * 0.1;
        }
        return tarifa;
    }


    public static void main(String[] args) {
        System.out.println("Quantas horas: ");
        double horas = entrada.nextInt();

        System.out.println("Qual veículo: ");
        char tipo = entrada.next().charAt(0);

        System.out.println("É fim de semana: ");
        char fim = entrada.next().charAt(0);

        double tarifa = calculaTarifa(horas, tipo);
        tarifa = calculataxa(horas, tarifa, fim);

        System.out.println("Valor final: R$ " + tarifa);
    }
}