package br.com.unesp.SistemaVoo.modelo;

public class CartaoEmbarque {
    protected int assento;
    protected String classe;
    protected Usuario passageiro;

    public CartaoEmbarque(Usuario passageiro) {
        this.passageiro = passageiro;
    }

    public void geraCartao(int assento, String classe){
        this.assento = assento;
        this.classe = classe;
    }

    public void exibeCartao(){
        System.out.println("Nome: "+this.passageiro.getNome());
        System.out.println("Documento: "+this.passageiro.getCpf());
        System.out.println("Assento: "+(this.assento+1));
        System.out.println("Classe: "+this.classe);
    }

    public Usuario getPassageiro() { return passageiro; }
    public int getAssento() { return assento; }
    public void setAssento(int a) { this.assento = a; }
    public String getClasse() { return classe; }
    public void setClasse(String c) { this.classe = c; }
}
