package br.com.unesp.SistemaVoo.modelo;

public class Voo {
    private boolean[] assentos;
    private int capacidade;
    private String codigoVoo;

    public Voo(String codigoVoo) {
        this.assentos = new boolean[10];
        this.capacidade = 10;
        this.codigoVoo = codigoVoo;
    }

    public String getCodigoVoo() { return codigoVoo; }

    public boolean reservar(int i) {
        if (!assentos[i]) {
            assentos[i] = true;
            return true;
        }
        return false;
    }

    public void liberar(int i) {
        assentos[i] = false;
    }

    public boolean isOcupado(int i) {
        return assentos[i];
    }

    public int buscarLivre(String classe) {
        if (classe.equalsIgnoreCase("primeira")) {
            for (int i = 0; i < 5; i++) if (!assentos[i]) return i;
        } else {
            for (int i = 5; i < 10; i++) if (!assentos[i]) return i;
        }
        return -1;
    }

    public void relatorio() {
        int pO = 0, eO = 0;
        for (int i = 0; i < 5; i++) if (assentos[i]) pO++;
        for (int i = 5; i < 10; i++) if (assentos[i]) eO++;

        System.out.println("Primeira Classe: " + pO + " ocupados, " + (5 - pO) + " livres");
        System.out.println("Econômica: " + eO + " ocupados, " + (5 - eO) + " livres");
    }
}
