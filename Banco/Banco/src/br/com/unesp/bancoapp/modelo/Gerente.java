package br.com.unesp.bancoapp.modelo;

public class Gerente extends Funcionario{
    private double bonus;

    public Gerente(String nome, String CPF, Double salario, Double bonus) {
        super(nome, CPF, salario);
        this.bonus = bonus;
    }
    @Override
    public double getBonificacao(){
        return super.getBonificacao() +this.bonus;
    }
}
