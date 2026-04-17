package br.com.unesp.FCTrante.modelo;

import java.util.ArrayList;

public class Mesa {
    private int numeroMesa;
    private int qtdClientes;
    private double contaMesa;
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    private boolean disponivel;

    public Mesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
        this.disponivel = true;
    }
    public void alocaClientes(int qtdClientes){
        this.qtdClientes = qtdClientes;
        this.disponivel = false;
    }
    public void adicionaPedido(Pedido pedido){
        pedidos.add(pedido);
        contaMesa+= pedido.getPrecoPedido();
    }
    public void finalizaMesa(){
        if(this.verificaPendentes()){
            disponivel = true;
            pedidos.clear();
            this.contaMesa = 0;
            this.qtdClientes = 0;
            System.out.println("Mesa finalizada");

        }
        else{
            System.out.println("Essa mesa possue pedidos pendentes, logo não pode ser finalizada");
        }
    }
    public void entregaPedido(Pedido pedido){
        pedido.entregue = true;
    }
    public boolean verificaPendentes(){
        for(Pedido pd : pedidos){
            if(!pd.getEntregue()){
                return false;
            }
        }
        return true;
    }

    public double getContaMesa() {
        return contaMesa;
    }
    public void exibeStatus(){
        System.out.println("Número da Mesa: "+ this.numeroMesa);
        System.out.println("Clientes da Mesa: "+ this.qtdClientes);
        System.out.println("Pedidos da mesa: \n");
        for(Pedido pd : this.pedidos){
            for(Item it : pd.itens){
                it.exibeItem();
            }
        }
        System.out.println("Conta da Mesa: "+ this.contaMesa +"\n");
        if(this.disponivel){
            System.out.println("Mesa Disponível \n\n");
        }
        else{
            System.out.println("Mesa Não Disponível\n\n");
        }
    }
}
