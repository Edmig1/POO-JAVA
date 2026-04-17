package br.com.unesp.estruturaFCT.modelo;

import java.util.ArrayList;

public class Departamento {
    private String codigo;
    private String nome;
    private String telefone;
    private ArrayList<Funcionario> funcionarios;

    public Departamento(String codigo, String nome, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.funcionarios = new ArrayList<>();
    }
    public void exibeDepartamento(){
        System.out.println("Nome do departamento:" + this.nome);
        System.out.println("Código do departamento: " + this.codigo);
        System.out.println("Telefone do departamento: " + this.telefone);
        System.out.println("Funcionários do departamento: ");
        for(Funcionario f: funcionarios){
            System.out.println("Nome: "+ f.nome);
            System.out.println("Código: "+ f.codigo);
            System.out.println("Salário: "+ f.salario);
            System.out.print("\n");
        }
    }

    public void adicionaFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }
    public void removaFuncionario(Funcionario funcionario){
        this.funcionarios.remove(funcionario);
    }
}
