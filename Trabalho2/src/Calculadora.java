import java.util.Scanner;

/**
 * Classe Calc é a classe principal do programa, dentro dela temos 2 funções, sendo elas somar e dividir.
 * Autor: Miguel - Edmig1
 * Data: 06/03/2026
 * Versão: 1.0
 */



public class Calculadora {
    static Scanner entrada = new Scanner(System.in);
    /** somar
     * Soma 2 números
     * @param a inteiro genérico
     * @param b inteiro genérico
     * @return retorna como valor a soma deles como a+b.
     */
    public static double Somar(double a, double b) {
        return a + b;
    }
    /** dividir
     * Divide 2 números
     * @param a inteiro genérico
     * @param b inteiro genérico
     * @return retorna como valor a divisão deles como a+b.
     * Caso o usuário tente dividir por 0, ele avisa o erro e retorna 0
     */
    public static double Dividir(double a, double b) {
        if(b==0){
            throw new ArithmeticException("Divisão por zero não é permitida.");
        };
        return a / b;
    }
    /** subtrair
     * Subtrai 2 números
     * @param a inteiro genérico
     * @param b inteiro genérico
     * @return retorna como valor a subtração deles como a+b.
     */
    public static double Subtrair(double a, double b) {
        return a - b;
    }
    /** multiplicar
     * Multiplica 2 números
     * @param a inteiro genérico
     * @param b inteiro genérico
     * @return retorna como valor a multiplicação deles como a+b.
     */
    public static double Multiplicar(double a, double b) {
        return a * b;
    }

    public static void escolha(double v1,double v2){
        System.out.print("1 - SOMA \n2 - SUBTRAÇÃO \n3- MULTIPLICAÇÃO\n4- DIVISÃO\n");
        int op = entrada.nextInt();
        switch (op){
            case 1:
                System.out.print("SOMA:"+ Somar(v1,v2));
                break;
            case 2:
                System.out.print("SUBTRAÇÃO:"+ Subtrair(v1,v2));
                break;
            case 3:
                System.out.print("MULTIPLICAÇÃO:"+ Multiplicar(v1,v2));
                break;
            case 4:
                System.out.print("DIVISÃO:"+ Dividir(v1,v2));
                break;
        }
    }

    /**
     * Main - Chama as outras funções
     */
    public static void main(String[] args) {
        double v1 = entrada.nextDouble();
        double v2 = entrada.nextDouble();
        escolha(v1,v2);
    }
}