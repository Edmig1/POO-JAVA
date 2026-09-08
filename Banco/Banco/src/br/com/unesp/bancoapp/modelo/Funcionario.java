package br.com.unesp.bancoapp.modelo;

public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();
    public abstract void exibirDados();
}
