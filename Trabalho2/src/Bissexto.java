import java.util.Scanner;


public class Bissexto {
    static Scanner entrada = new Scanner(System.in);

    public static int adicionalista(int i, int ano, int anos[]) {

        anos[i] = ano;
        return anos[i];
    }
    public static void printalista(int qtdAnos, int[]anos) {
        for (int i = 0; i<qtdAnos; i++){
            System.out.println("Ano: "+anos[i]+" " + verificaBissexto(anos[i]));
            System.out.println("---------------------------------------------");
        }

    }
    public static String verificaBissexto(int ano){
        String resultado;

        if(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)){
            resultado = "Bissexto";
            return(resultado);
        }else{
            resultado = "Não Bissexto";
            return(resultado);
        }
    }

    /**
     * Main - Chama as outras funções
     */
    public static void main(String[] args) {
        int qtdAnos = entrada.nextInt();
        int[] anos = new int[qtdAnos];
        for (int i = 0; i<qtdAnos; i++){
            int ano = entrada.nextInt();
            anos[i] = adicionalista(i,ano,anos);
        }
        printalista(qtdAnos,anos);
    }
}