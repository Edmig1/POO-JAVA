package br.com.unesp.CartaoWeb.modelo;

public abstract class Cartao {
    protected String destinatario;

    public Cartao(String destinatario) {
        this.destinatario = destinatario;
    }

    public abstract void showMessage();
}
