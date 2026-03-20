import java.util.Scanner;

public class Alunos{

    public static void enterExamMarks(int[] alunos){
        Scanner entrada = new Scanner(System.in);
        int notaAluno = 0;
        for(int i=0; i< alunos.length; i++){
            do{
                System.out.print("Digite a nota do aluno "+i+ ": ");
                notaAluno = entrada.nextInt();
                alunos[i] = notaAluno;
            }while (notaAluno <0 || notaAluno >10);
        }
        entrada.close();
    }
    public static void increaseMarks(int[] alunos){
        Scanner entrada = new Scanner(System.in);
        for(int i=0; i< alunos.length; i++){
            if(alunos[i]+3 >=10){
                alunos[i] = 10;
            }else{
                alunos[i]+=3;
            }
        }
    }
    public static void displayMarks(int[] alunos){
        for(int i=0; i< alunos.length; i++){
            System.out.println("Nota do aluno "+i+": "+alunos[i]);
        }
    }
    public static boolean media(int[] alunos){
        double media = 0;
        for(int i=0; i< alunos.length; i++){
            media+=alunos[i];
        }
        media /=alunos.length;
        if (media>=5){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        int[] javaStudents = new int[4];
        enterExamMarks(javaStudents);
        System.out.println("-------------- Notas Dos Alunos --------------" );
        displayMarks(javaStudents);
        increaseMarks(javaStudents);
        System.out.println("-------------- Notas Dos Alunos +3 --------------" );
        displayMarks(javaStudents);
        System.out.println("-------------- Resultado das médias --------------" );
        if(media(javaStudents)){
            System.out.println("Média da turma >=5" );
        }else{
            System.out.println("Média da turma <=5" );
        }
    }
}