package br.com.unesp.bancoapp.servico;
import br.com.unesp.bancoapp.modelo.Conta;

public class AtualizadorConta {
    private double totalAtualizado;

    public void atualizaConta(Conta conta,double taxa){
        conta.atualizaSaldo(taxa);
    }
    public double getTotalAtualizado(){
        return this.totalAtualizado;
    }
}
