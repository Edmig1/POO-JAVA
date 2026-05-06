package br.com.unesp.SistemaVoo.servico;
import br.com.unesp.SistemaVoo.modelo.CartaoEmbarque;
import br.com.unesp.SistemaVoo.modelo.Usuario;
import br.com.unesp.SistemaVoo.modelo.Voo;

import br.com.unesp.SistemaVoo.modelo.*;
import java.util.*;

public class GerenciadorReservas {
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Reserva> reservas = new ArrayList<>();

    public void cadastrarUsuario(Usuario u) {
        usuarios.add(u);
    }

    public void listarUsuarios() {
        System.out.println("--- Usuários ---");
        for (Usuario u : usuarios) {
            System.out.println(u.getNome() + " - " + u.getCpf());
        }
    }

    public void reservarAssento(Voo voo, CartaoEmbarque cartao, String classe) {
        int assento = voo.buscarLivre(classe);

        if (assento == -1) {
            String outra = classe.equals("primeira") ? "economica" : "primeira";
            assento = voo.buscarLivre(outra);

            if (assento == -1) {
                System.out.println("Próximo voo em 3 horas.");
                return;
            }
            classe = outra;
        }

        voo.reservar(assento);
        cartao.geraCartao(assento, classe);

        reservas.add(new Reserva(cartao, voo.getCodigoVoo()));

        System.out.println("Reserva feita: " + cartao.getPassageiro().getNome() + " Assento " + (assento+1));
    }

    public void alterarReserva(Usuario u, Voo voo, int novoAssento) {
        for (Reserva r : reservas) {
            CartaoEmbarque c = r.getCartao();
            if (c.getPassageiro().equals(u) && r.getCodigoVoo().equals(voo.getCodigoVoo())) {
                if (!voo.isOcupado(novoAssento - 1)) {
                    voo.liberar(c.getAssento());
                    voo.reservar(novoAssento - 1);
                    c.setAssento(novoAssento - 1);
                    System.out.println("Reserva alterada.");
                    return;
                }
            }
        }
    }

    public void cancelarReserva(Usuario u, Voo voo) {
        Iterator<Reserva> it = reservas.iterator();
        while (it.hasNext()) {
            Reserva r = it.next();
            CartaoEmbarque c = r.getCartao();

            if (c.getPassageiro().equals(u) && r.getCodigoVoo().equals(voo.getCodigoVoo())) {
                voo.liberar(c.getAssento());
                it.remove();
                System.out.println("Reserva cancelada.");
            }
        }
    }

    public void relatorioReservas() {
        System.out.println("--- Reservas ---");
        for (Reserva r : reservas) {
            CartaoEmbarque c = r.getCartao();
            System.out.println(c.getPassageiro().getNome() + " - Assento " + (c.getAssento()+1) + " - " + c.getClasse());
        }
    }

    public void relatorioVoo(Voo voo) {
        voo.relatorio();

        System.out.println("Passageiros do voo " + voo.getCodigoVoo());
        for (Reserva r : reservas) {
            if (r.getCodigoVoo().equals(voo.getCodigoVoo())) {
                System.out.println(r.getCartao().getPassageiro().getNome());
            }
        }
    }
}
