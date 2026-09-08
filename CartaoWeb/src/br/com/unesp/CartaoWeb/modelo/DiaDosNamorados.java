package br.com.unesp.CartaoWeb.modelo;

public class DiaDosNamorados extends Cartao{
    public DiaDosNamorados(String destinatario){
        super(destinatario);
    }
    @Override
    public void showMessage() {
        System.out.println("Feliz dia dos Namorados, " +this.destinatario);
    }
}
