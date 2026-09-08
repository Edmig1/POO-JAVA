package br.com.unesp.CartaoWeb.modelo;

public class Aniversario extends Cartao{
    public Aniversario(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("Feliz Aniversário, "+this.destinatario);
    }
}