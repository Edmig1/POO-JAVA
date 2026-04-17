package br.com.unesp.bancoapp.modelo;

public class Funcionario {
    protected String nome;
    protected String CPF;
    protected Double salario;

    public Funcionario(String nome, String CPF, Double salario) {
        this.nome = nome;
        this.CPF = CPF;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public Double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getBonificacao(){
        return this.salario *0.1;
    }
}
