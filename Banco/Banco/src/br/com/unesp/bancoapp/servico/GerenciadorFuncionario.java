package br.com.unesp.bancoapp.servico;
import br.com.unesp.bancoapp.modelo.Funcionario;

import java.util.ArrayList;
public class GerenciadorFuncionario {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    public void cadastrar(Funcionario f){ funcionarios.add(f); }
    public void exibirTodos(){
        for(Funcionario f: funcionarios){
            f.exibirDados();
            System.out.println("----------------");
        }
    }
}
