import java.util.ArrayList;

public class App{

    static public void main(String[] args){

        AlunoAcademia aluno1 = new AlunoAcademia("Jõao",18,75,1.78);
        AlunoAcademia aluno2 = new AlunoAcademia("Pedro",8,30,1.40);
        AlunoAcademia aluno3 = new AlunoAcademia("Roberta",40,46,1.52);
        ArrayList<AlunoAcademia> alunos = AlunoAcademia.getAlunoAcademiaList();



        for(int i =0; i<AlunoAcademia.contagem; i++){
            if(alunos.get(i).temDesconto()){
                System.out.println("Aluno "+alunos.get(i).getNome()+" tem o IMC de: "+alunos.get(i).calcularIMC()+" e tem direito à desconto");
            }
            else{
                System.out.println("Aluno "+alunos.get(i).getNome()+" tem o IMC de: "+alunos.get(i).calcularIMC()+" e não tem direito à desconto");

            }
        }
    }

}