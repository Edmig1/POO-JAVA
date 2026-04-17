package br.com.unesp.BibliotecaFCT.modelo;

public class LivroDigital extends Livro{
    private String formato;
    private int peso;
    public LivroDigital(String titulo, String autor, String isbn, int ano,String formato, int peso) {
        super(titulo, autor, isbn, ano);
        this.formato = formato;
        this.peso = peso;
    }

    @Override
    public void pegaLivro(Usuario user) {
        user.dowloads++;
    }
}
