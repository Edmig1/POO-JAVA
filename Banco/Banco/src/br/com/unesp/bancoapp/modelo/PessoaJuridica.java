package br.com.unesp.bancoapp.modelo;

public class PessoaJuridica extends Cliente {
    private String razaoSocial, cnpj;
    public PessoaJuridica(String razaoSocial,String cnpj,String telefone,String email,Endereco endereco){
        super(telefone,email,endereco);
        this.razaoSocial=razaoSocial; this.cnpj=cnpj;
    }
    public void exibirDados(){
        System.out.println("PJ: "+razaoSocial+" | CNPJ: "+cnpj+" | Tel: "+telefone+" | Email: "+email);
        System.out.println("Endereço: "+endereco);
    }
}