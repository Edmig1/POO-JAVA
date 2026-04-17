package br.com.unesp.BibliotecaFCT.modelo;

public class LivroFisico extends Livro{
    private int qtd;
    private boolean disponivel;

    public LivroFisico(String titulo, String autor, String isbn, int ano, int qtd) {
        super(titulo, autor, isbn, ano);
        this.qtd = qtd;
        this.disponivel = this.qtd>0;
    }


    @Override
    public void pegaLivro(Usuario user) {
        if(verificaDisponibilidade()){
            user.emprestimos++;
            this.qtd--;
            atualizaStatus();
        }
    }
    public void devolveLivro(Usuario user){
        user.emprestimos--;
        this.qtd++;
    }

    public boolean verificaDisponibilidade(){
        if (qtd>0){
            System.out.println("O livro " +this.titulo+ " tem " +this.qtd + " Exemplares para empréstimo \n");
            return true;
        }else{
            System.out.println("O livro não tem exemplares para empréstimo \n");
            return false;
        }
    }

    public void atualizaStatus(){
        this.disponivel = qtd> 0;
    }
}
