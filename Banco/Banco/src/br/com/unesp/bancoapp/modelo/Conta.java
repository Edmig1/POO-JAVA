package br.com.unesp.bancoapp.modelo;

public abstract class Conta{
    protected int numero;
    protected Cliente  titular;
    protected double saldo;


    public Conta(int numero, Cliente titular){
        this.numero = numero;
        this.titular = titular;
    }

    public boolean saca(double valor){
        if (this.saldo < valor){
            return false;
        }
        else{
            this.saldo -=valor;
            return true;
        }
    }
    public void atualizaSaldo(double taxa){
        this.saldo += this.saldo *taxa;
    }

    public void deposita(double quantidade){
        this.saldo += quantidade;
    }

    public boolean transfere(Conta destino, double valor){
        if(this.saca(valor)){
            destino.deposita(valor);
            return true;
        }else{
            return false;
        }
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
}