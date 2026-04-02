public class Cliente {

    private String nome;
    private String CPF;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.CPF = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

}