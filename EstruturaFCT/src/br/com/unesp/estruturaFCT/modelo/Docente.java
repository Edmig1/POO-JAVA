package br.com.unesp.estruturaFCT.modelo;

public class Docente extends Funcionario{
    private String funcao;
    public Docente(String nome, String codigo, Double salario,String funcao) {
        super(nome, codigo, salario);
        this.funcao = funcao;
    }
}
