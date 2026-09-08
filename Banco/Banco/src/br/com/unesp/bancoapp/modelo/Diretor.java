package br.com.unesp.bancoapp.modelo;

public class Diretor extends Funcionario {
    private double participacaoLucros;
    private String areaResponsavel;

    public Diretor(String nome, double salarioBase, String areaResponsavel){
        super(nome, salarioBase);
        this.areaResponsavel = areaResponsavel;
        this.participacaoLucros = salarioBase * 0.35;
    }

    public double calcularSalario(){
        return salarioBase + participacaoLucros;
    }

    public void exibirDados(){
        System.out.println("Diretor: "+nome+" | Salário Base: R$ "+salarioBase);
        System.out.println("Área: "+areaResponsavel+" | Participação nos Lucros (35%): R$ "+participacaoLucros);
        System.out.println("Salário Final: R$ "+calcularSalario());
    }
}
