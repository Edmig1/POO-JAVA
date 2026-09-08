package br.com.unesp.bancoapp.modelo;

public abstract class Cliente {
    protected String telefone;
    protected String email;
    protected Endereco endereco;

    public Cliente(String telefone, String email, Endereco endereco){
        this.telefone=telefone;
        this.email=email;
        this.endereco=endereco;
    }

    public abstract void exibirDados();
}