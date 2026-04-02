

class Conta{
    private int numero;
    private Cliente  titular;
    private double saldo;


    public Conta(int num, Cliente titular){
        this.numero = num;
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