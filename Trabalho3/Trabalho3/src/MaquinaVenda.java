import java.util.ArrayList;
import java.util.Scanner;

public class MaquinaVenda{

     static Scanner entrada = new Scanner(System.in);
    public static void exibeOptions(){
        System.out.print(
                """
                        [1] Comprar chiclete
                        [2] Comprar chocolate
                        [3] Comprar pipoca
                        [4] Comprar suco
                        [5] Exibir total vendido até agora
                        [6] Exibir histórico de compras
                        [7] Sair\s
                        \s
                        """);
    }

    public static void compra(String produto,ArrayList<String> prod){
        prod.add(produto);
    }

    public static void totalVendas(ArrayList<String> prod){
        System.out.println("O total de vendas foi: "+ prod.toArray().length);
    }

     public static void controlador(int escolha,ArrayList<String> prod, int []qtd){
         switch (escolha){
             case 1:
                 System.out.println("Aqui está seu chiclete");
                 compra("Chiclete",prod);
                 qtd[0]+=1;
                 break;
             case 2:
                 System.out.println("Aqui está seu chocolate");
                 compra("Chocolate",prod);
                 qtd[1]+=1;
                 break;
             case 3:
                 System.out.println("Aqui está sua pipoca");
                 compra("Pipoca",prod);
                 qtd[2]+=1;
                 break;
             case 4:
                 System.out.println("Aqui está seu suco");
                 compra("Suco",prod);
                 qtd[3]+=1;
                 break;
             case 5:
                    imprimeArray(qtd);
                 break;
             case 6:
                 imprimeHistoricco(prod);
                 break;
             default:
                 System.out.println("[Erro], apenas opções de 1 a 6!");
                 break;
         }
     }
     public static void imprimeArray(int[] qtd){
        for(int i =0; i< qtd.length; i++){
            if(i==0){
                System.out.println(qtd[i] +" Chicletes vendidos");
            }else if(i==1){
                System.out.println(qtd[i] +" Chocolates vendidos");
            }
            else if(i==2){
                System.out.println(qtd[i] +" Pipocas vendidas");
            }
            else if(i==3){
                System.out.println(qtd[i] +" Sucos vendidos");
            }
        }
     }
    public static void imprimeHistoricco(ArrayList<String> prod){
        for(String p : prod){
            System.out.println(p);
        }
    }
    public static void main(String [] args){
        ArrayList<String> produtos = new ArrayList<>();
        int[] qtd = {0,0,0,0};
        exibeOptions();
        System.out.print("Escolha a opção: ");
        int escolha;
        do{
            System.out.print("Escolha a opção: ");
            escolha = entrada.nextInt();
            controlador(escolha, produtos,qtd);
        }while(escolha!=7);

    }
}