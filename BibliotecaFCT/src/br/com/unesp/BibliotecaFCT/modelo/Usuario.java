package br.com.unesp.BibliotecaFCT.modelo;

public class Usuario {
    private String nome;
    private int ra;
    protected int emprestimos;
    protected int dowloads;

    public Usuario(int emprestimos, int ra, String nome, int dowloads) {
        this.emprestimos = emprestimos;
        this.ra = ra;
        this.nome = nome;
        this.dowloads = dowloads;
    }

    public void exibeUser(){
        System.out.println("Nome do usuário: "+ this.nome);
        System.out.println("RA do usuário: "+ this.ra);
        System.out.println("Empréstimos do usuário: "+ this.emprestimos);
        System.out.println("Dowloads do usuário: "+ this.dowloads +"\n");
    }
}
