package br.com.unesp.CartaoWeb.modelo;

public class Natal extends Cartao{
    public Natal(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("Feliz Natal, "+this.destinatario);
    }
}