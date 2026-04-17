package br.com.unesp.bancoapp.modelo;

public class ContaCorrente extends Conta{
    private double limite;

    public ContaCorrente(int numero, Cliente titular, Double limite) {
        super(numero, titular);
    }

    @Override
    public void atualizaSaldo(double taxa){
        super.atualizaSaldo(taxa*2);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}