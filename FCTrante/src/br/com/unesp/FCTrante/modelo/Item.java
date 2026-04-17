package br.com.unesp.FCTrante.modelo;

public class Item {
    protected String nome;
    protected double preco;

    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public void exibeItem(){
        System.out.println("Nome do Item: "+ this.nome);
        System.out.println("Valor do Item: "+ this.preco);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

}
