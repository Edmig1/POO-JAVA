import java.util.Scanner;

public class Imposto{
    static Scanner entrada = new Scanner(System.in);
    public static double[] listasalarios(){
        int func = entrada.nextInt();
        double[]listafunc = new double[func];
        return listafunc;
    }
    public static double[] declarasalarios(double[] listafunc){
        for(int i=0; i<listafunc.length; i++){
            double valor = entrada.nextDouble();
            listafunc[i] = valor;
        }
        return listafunc;
    }
    public static void imprimelista(double[] listafunc){
        for(int i=0; i<listafunc.length; i++){
            System.out.print(listafunc[i]+" ");
        }
    }
    public static void calculaimposto(double[] listafunc) {
        for (int i = 0; i < listafunc.length; i++) {
            double salario = listafunc[i];
            double imposto = 0;

            if (salario <= 2000) {
                imposto = 0;
            } else if (salario <= 3500) {
                imposto = salario * 0.08;
            } else if (salario <= 5000) {
                imposto = salario * 0.15;
            } else {
                imposto = salario * 0.22;
            }

            double liquido = salario - imposto;

            System.out.println("Pessoa " + (i+1));
            System.out.println("Salário: " + salario);
            System.out.println("Imposto: " + imposto);
            System.out.println("Salário líquido: " + liquido);
            System.out.println("-------------------");
        }
    }

    public static void main(String[] args){
        double[] listafunc = listasalarios();
        listafunc = declarasalarios(listafunc);
        calculaimposto(listafunc);
        imprimelista(listafunc);
        entrada.close();
    }
}