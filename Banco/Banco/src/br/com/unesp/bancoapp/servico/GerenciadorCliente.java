package br.com.unesp.bancoapp.servico;
import br.com.unesp.bancoapp.modelo.Cliente;

import java.util.ArrayList;
public class GerenciadorCliente {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    public void cadastrar(Cliente c){ clientes.add(c); }
    public void exibirTodos(){
        for(Cliente c: clientes){
            c.exibirDados();
            System.out.println("----------------");
        }
    }
}