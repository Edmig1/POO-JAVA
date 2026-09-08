package br.com.unesp.bancoapp.modelo;

public class PessoaFisica extends Cliente {
    private String nome, cpf;
    public PessoaFisica(String nome,String cpf,String telefone,String email,Endereco endereco){
        super(telefone,email,endereco);
        this.nome=nome; this.cpf=cpf;
    }
    public void exibirDados(){
        System.out.println("PF: "+nome+" | CPF: "+cpf+" | Tel: "+telefone+" | Email: "+email);
        System.out.println("Endereço: "+endereco);
    }
}