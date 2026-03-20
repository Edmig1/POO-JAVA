import java.util.Scanner;

public class Matriz{
    static Scanner entrada = new Scanner(System.in);

    public static int Cmatriz(){
        int coluna = entrada.nextInt();
        return coluna;
    }
    public static int LMatriz(){
    int linha = entrada.nextInt();
    return linha;
    }
    public static boolean verificaMult(int c1,int l2){
        if(c1 ==l2){
            return true;
        }else{
            return false;
        }
    }
    public static int[][] declaramatriz(int l,int c){
        int[][] matriz = new int [l][c];

        for(int i=0;i<l;i++){
            for(int j=0;j<c;j++){
                int valor = entrada.nextInt();
                matriz[i][j] = valor;
            }
        }

        return matriz;
    }

    public static int[][] multmatriz(int[][] m1, int[][] m2,int l1, int c1,int c2){
        int[][] m3 = new int[l1][c2];
        for(int i=0; i<l1;i++){
            for(int j=0; j<c2; j++){
                for (int k=0; k<c1; k++){
                    m3[i][j] += m1[i][k]*m2[k][j];
                }
            }
        }


        return m3;
    }
    public static void imprimeMatriz(int[][] m3,int l1,int c2){
        for(int i=0;i<l1;i++){
            System.out.print("\n");
            for(int j=0;j<c2;j++){
                System.out.print(m3[i][j] + " ");
            }
        }
    }
    public static void realizaProg(boolean mult, int l1, int c1, int l2, int c2){
        if (!mult){
            System.out.print("Não é possível multiplicar as matrizes");
        }
        else{
            int[][] matriz1 = declaramatriz(l1,c1);
            int[][] matriz2 = declaramatriz(l2,c2);
            int[][] matriz3 = multmatriz(matriz1,matriz2,l1,c1,c2);
            imprimeMatriz(matriz3,l1,c2);
        }
    }

    public static void main(String[] args){
        int c1= 0,l1 = 0,c2 = 0,l2 = 0;
        boolean mult = false;
        l1 = LMatriz();
        c1 = Cmatriz();
        l2 = LMatriz();
        c2 = Cmatriz();
        mult = verificaMult(c1,l2);
        realizaProg(mult,l1,c1,l2,c2);
        entrada.close();
    }

}