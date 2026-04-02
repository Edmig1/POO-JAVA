import java.util.ArrayList;

public class AlunoAcademia{

    private String nome;
    private int idade;
    private double peso;
    private double altura;
    static private ArrayList<AlunoAcademia> alunos = new ArrayList<>();
    static int contagem = 0;

    AlunoAcademia(String nome, int idade, double peso, double altura){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        alunos.add(this);
        contagem++;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
    static ArrayList<AlunoAcademia> getAlunoAcademiaList(){
        return alunos;
    }
    double calcularIMC(){
        return (this.peso/(this.altura*this.altura));
    }
    boolean temDesconto(){
        return this.idade < 18;
    }
}