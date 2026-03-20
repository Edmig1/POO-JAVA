import java.util.Scanner;


public class Emprestimo {

    static Scanner entrada = new Scanner(System.in);
    public static final double moto = 5;
    public static final double carro = 8;


    public static double[] calculavalor(double valor, char cliente,int parcelas) {
        double valorparcela = 0;
        switch (cliente) {
            case 'P':
                valor = valor + (valor *0.015 *parcelas);
                valorparcela = valor/parcelas;
                break;
            case 'N':
                valor = valor + (valor * 0.025* parcelas);
                valorparcela = valor/parcelas;
                break;

        }
        return new double[]{valor, valorparcela};
    }

    public static boolean verificaparcela(char cliente, int parcelas) {
        if(cliente == 'N' && parcelas>24){
            System.out.println("Limite de parcelas excedido");
            return false;
        }else if(cliente == 'P' && parcelas>36){
            System.out.println("Limite de parcelas excedido");
            return false;
        }else{
            System.out.println("Emprestimo aprovado");
            return true;
        }
    }


    public static void main(String[] args) {
        System.out.println("Valor do emprestimo: ");
        double valor = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Tipo de clientes: ");
        char cliente = entrada.next().charAt(0);

        System.out.println("Número de parcelas: ");
        int parcelas = entrada.nextInt();
        if(verificaparcela(cliente,parcelas)){
            double[] resultado = calculavalor(valor, cliente, parcelas);
            System.out.println("Valor final: R$ " +resultado[0]);
            System.out.println("Valor de cada parcela: R$ "+ resultado[1]);
        }
    }
}