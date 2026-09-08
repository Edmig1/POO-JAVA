package br.com.unesp.revisaoProva.control;

import br.com.unesp.revisaoProva.model.Aluno;
import br.com.unesp.revisaoProva.view.Tela;

import java.util.ArrayList;

public class AlunoController {
    private ArrayList<Aluno> alunos;

private Tela view;

    public AlunoController(){
        alunos = new ArrayList<>();
    }

    public void cadastrarAluno(String ra, String nome, String curso){
       Aluno aluno = new Aluno(ra,nome,curso);
       alunos.add(aluno);
       exibirAlunos();
    }
    public void exibirAlunos(){
        for(Aluno a: alunos){
            System.out.println(a.ra + " | " + a.nome + " | " + a.curso);
        }
    }
}
