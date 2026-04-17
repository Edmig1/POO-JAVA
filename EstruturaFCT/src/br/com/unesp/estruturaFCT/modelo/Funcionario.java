package br.com.unesp.estruturaFCT.modelo;

public class Funcionario {
    protected String codigo;
    protected String nome;
    protected Double salario;

    public Funcionario(String nome, String codigo, Double salario){
        this.codigo = codigo;
        this.nome = nome;
        this.salario = salario;
    }

    public void exibeFuncionario(){
            System.out.println("Nome: "+ this.nome);
            System.out.println("Código: "+ this.codigo);
            System.out.println("Salário: "+ this.salario);
            System.out.print("\n");
    }
}
