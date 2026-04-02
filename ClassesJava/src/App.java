import javax.swing.text.StyledEditorKit;
import java.util.ArrayList;

public class App{

    public static void main(String [] args){
        Alunos aluno1 = new Alunos(1,"Pedrinho",7.5,5,8.2,6);
        Alunos aluno2 = new Alunos(1,"Joãozinho",8,8.8,9,10);
        Alunos aluno3 = new Alunos(1,"Paulinho",3,2,4,7);
        ArrayList<Alunos> alunos = Alunos.getAlunosList();
        for(int i =0; i<Alunos.contagem; i++){
            if(alunos.get(i).estaAprovado()){
                System.out.println("Aluno "+alunos.get(i).getNome()+" está aprovado com a média de: "+alunos.get(i).calcularMedia());
            }
            else{
                System.out.println("Aluno "+alunos.get(i).getNome()+" está reprovado com a média de: "+alunos.get(i).calcularMedia());

            }
        }
    }
}