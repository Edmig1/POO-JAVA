package br.com.unesp.bancoapp.aplicacao;

import br.com.unesp.bancoapp.servico.*;
import br.com.unesp.bancoapp.modelo.*;

public class App {
    public static void main(String[] args) {
        // ----- Funcionários -----
        GerenciadorFuncionario gf = new GerenciadorFuncionario();

        gf.cadastrar(new Gerente("Ana Souza", 6000.0, "Agência Centro"));
        gf.cadastrar(new TecnicoBancario("Bruno Lima", 3000.0, "Atendimento", 10));
        gf.cadastrar(new Diretor("Carla Mendes", 12000.0, "Diretoria Financeira"));

        gf.exibirTodos();

        // ----- Clientes -----
        GerenciadorCliente gc = new GerenciadorCliente();

        Endereco e1 = new Endereco("Rua A","10","Centro","Bandeirantes","PR","86360-000");
        Endereco e2 = new Endereco("Av B","200","Industrial","Londrina","PR","86000-000");

        gc.cadastrar(new PessoaFisica("Miguel","123.456.789-00","43999999999","miguel@email.com",e1));
        gc.cadastrar(new PessoaJuridica("Empresa X Ltda","12.345.678/0001-99","4333333333","contato@empresa.com",e2));

        gc.exibirTodos();
    }
}
