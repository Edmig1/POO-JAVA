package br.com.unesp.bancoapp.servico;

import br.com.unesp.bancoapp.modelo.Funcionario;

public class ControleBonificacoes {
    private double totalBonificacao;


    public double getTotalBonificacao(){
        return this.totalBonificacao;
    }

    public void registraBonificacao(Funcionario funcionario){
        this.totalBonificacao +=funcionario.getBonificacao();
    }
}
