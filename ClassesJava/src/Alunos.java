import java.util.ArrayList;

public class Alunos {
    private int RA;
    private String nome;
    private double nota1;
    private double nota2;
    private double prova1;
    private double prova2;
    static private ArrayList<Alunos> alunos = new ArrayList<>();

    static int contagem = 0;


    public Alunos(int RA, String nome, double nota1, double nota2, double prova1, double prova2) {
        this.RA = RA;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.prova1 = prova1;
        this.prova2 = prova2;
        contagem++;
        alunos.add(this);
    }

    static ArrayList<Alunos> getAlunosList(){
        return alunos;
    }

    void setnome(String nome) {
        this.nome = nome;
    }
    String getNome(){
        return this.nome;
    }

    void setRA(int RA) {
        this.RA = RA;
    }

    double calcularMedia() {
        return (this.nota1 + this.nota2 + this.prova1 + this.prova2) / 4;
    }

    boolean estaAprovado() {
        return (calcularMedia()) >=5;
    }
}
