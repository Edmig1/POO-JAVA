package br.com.unesp.FCTrante.modelo;

import java.util.ArrayList;

public class Pedido {
    protected ArrayList<Item> itens = new ArrayList<>();
    private double precoPedido;
    protected boolean entregue = false;

    public void adicionaItem(Item item){
        this.itens.add(item);
        this.precoPedido+=item.preco;
    }

    public void setEntregue(boolean entregue) {
        this.entregue = entregue;
    }
    public boolean getEntregue() {
        return entregue;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public double getPrecoPedido() {
        return precoPedido;
    }
}
