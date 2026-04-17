package br.com.unesp.FCTrante.servico;
import br.com.unesp.FCTrante.modelo.*;

public class ControlePedidos {

    public void adicionaItemNoPedido( Item item, Pedido pedido){
        pedido.adicionaItem(item);
    }
    public void adicionaPedidoNaMesa(Pedido pedido, Mesa mesa){
        mesa.adicionaPedido(pedido);
    }
    public void entregaPedidoParaMesa(Pedido pedido, Mesa mesa){
        mesa.entregaPedido(pedido);
    }
}
