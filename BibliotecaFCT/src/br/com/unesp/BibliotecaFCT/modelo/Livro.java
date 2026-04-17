package br.com.unesp.BibliotecaFCT.modelo;

public class Livro {
    protected String titulo;
    protected String autor;
    protected String isbn;
    protected int ano;

    public Livro(String titulo, String autor, String isbn, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.ano = ano;
    }

    public void pegaLivro(Usuario user){

    }

}
