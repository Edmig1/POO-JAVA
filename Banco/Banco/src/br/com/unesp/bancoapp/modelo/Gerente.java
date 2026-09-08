package br.com.unesp.bancoapp.modelo;

public class Gerente extends Funcionario {
    private double bonus;
    private String agenciaResponsavel;

    public Gerente(String nome, double salarioBase, String agenciaResponsavel){
        super(nome, salarioBase);
        this.agenciaResponsavel = agenciaResponsavel;
        this.bonus = salarioBase * 0.20;
    }

    public double calcularSalario(){
        return salarioBase + bonus;
    }

    public void exibirDados(){
        System.out.println("Gerente: "+nome+" | Salário Base: R$ "+salarioBase);
        System.out.println("Agência: "+agenciaResponsavel+" | Bônus (20%): R$ "+bonus);
        System.out.println("Salário Final: R$ "+calcularSalario());
    }
}
