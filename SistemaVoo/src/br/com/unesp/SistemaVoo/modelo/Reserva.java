package br.com.unesp.SistemaVoo.modelo;

public class Reserva {
    private CartaoEmbarque cartao;
    private String codigoVoo;

    public Reserva(CartaoEmbarque cartao, String codigoVoo) {
        this.cartao = cartao;
        this.codigoVoo = codigoVoo;
    }

    public CartaoEmbarque getCartao() { return cartao; }
    public String getCodigoVoo() { return codigoVoo; }
}