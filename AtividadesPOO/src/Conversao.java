import java.util.Scanner;

public class Conversao{
    static Scanner entrada = new Scanner(System.in);
    public static double obterValor(double dinheiro){
        System.out.print("Digite a quantidade de dinheiro na moeda atual: ");
        dinheiro = entrada.nextDouble();
        return dinheiro;
    }
    public static double obterTaxa(double taxa){
        System.out.print("Digite a taxa de câmbio: ");
        taxa = entrada.nextDouble();
        return taxa;
    }
    public static double converterGrana(double dinheiro, double taxa,double resultado){
        resultado = dinheiro*taxa;
        return resultado;
    }
    public static void imprimirvalor(double resultado){
        System.out.print("O valor na nova moeda é: " + resultado);
    }

    public static void main(String[] args){
        double dinheiro = 0,taxa = 0, resultado = 0;
        dinheiro = obterValor(dinheiro);
        taxa = obterTaxa(taxa);
        resultado = converterGrana(dinheiro,taxa,resultado);
        System.out.println(dinheiro);
        System.out.println(taxa);
        imprimirvalor(resultado);
        entrada.close();
    }
}