package br.com.unesp.SistemaVoo.aplicacao;
import br.com.unesp.SistemaVoo.modelo.*;
import br.com.unesp.SistemaVoo.modelo.*;
import br.com.unesp.SistemaVoo.servico.*;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        GerenciadorReservas gerenciador = new GerenciadorReservas();

        Usuario u1 = new Usuario("Pedro", "123456789");
        Usuario u2 = new Usuario("Maria", "987654321");
        gerenciador.cadastrarUsuario(u1);
        gerenciador.cadastrarUsuario(u2);

        Voo voo = new Voo("AZ-1234");

        CartaoEmbarque c1 = new CartaoEmbarque(u1);
        CartaoEmbarque c2 = new CartaoEmbarque(u2);

        gerenciador.reservarAssento(voo, c1, "primeira");
        gerenciador.reservarAssento(voo, c2, "economica");

        gerenciador.listarUsuarios();
        gerenciador.relatorioReservas();
        gerenciador.relatorioVoo(voo);

        gerenciador.alterarReserva(u1, voo, 7);

        gerenciador.cancelarReserva(u2, voo);

        gerenciador.relatorioVoo(voo);
    }
}
