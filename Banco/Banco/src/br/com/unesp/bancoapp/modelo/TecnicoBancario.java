package br.com.unesp.bancoapp.modelo;

public class TecnicoBancario extends Funcionario {
    private static final double VALOR_HORA_EXTRA = 30.0;

    private String setorAtendimento;
    private int horasExtras;

    public TecnicoBancario(String nome, double salarioBase, String setorAtendimento, int horasExtras){
        super(nome, salarioBase);
        this.setorAtendimento = setorAtendimento;
        this.horasExtras = horasExtras;
    }

    public double calcularSalario(){
        return salarioBase + (horasExtras * VALOR_HORA_EXTRA);
    }

    public void exibirDados(){
        System.out.println("Técnico Bancário: "+nome+" | Salário Base: R$ "+salarioBase);
        System.out.println("Setor: "+setorAtendimento+" | Horas Extras: "+horasExtras+" (R$ "+(horasExtras*VALOR_HORA_EXTRA)+")");
        System.out.println("Salário Final: R$ "+calcularSalario());
    }
}
