package br.com.unesp.FCTrante.aplicacao;

import br.com.unesp.FCTrante.modelo.*;
import br.com.unesp.FCTrante.servico.*;

public class App{

    public static void main(String[] args){
        ControlePedidos controlador = new ControlePedidos();

        Item aborgue = new Item("Aborgue",20.0);
        Item dogao = new Item("Dogão",17.5);
        Item coca = new Item("Coquinha",4.0);
        Item skol = new Item("Skol",2.99);


        Mesa mesa1 = new Mesa(1);
        Mesa mesa2 = new Mesa(2);
        mesa1.alocaClientes(3);
        mesa2.alocaClientes(4);

        Pedido pedido1 = new Pedido();
        Pedido pedido2 = new Pedido();

        controlador.adicionaItemNoPedido(aborgue,pedido1);
        controlador.adicionaItemNoPedido(skol,pedido1);

        controlador.adicionaPedidoNaMesa(pedido1,mesa1);


        controlador.adicionaItemNoPedido(dogao,pedido2);
        controlador.adicionaItemNoPedido(coca,pedido2);

        controlador.adicionaPedidoNaMesa(pedido2,mesa2);

        controlador.entregaPedidoParaMesa(pedido1,mesa1);



        mesa1.exibeStatus();
        mesa2.exibeStatus();

        mesa1.finalizaMesa();
        mesa2.finalizaMesa();

        mesa1.exibeStatus();
        mesa2.exibeStatus();

    }
}