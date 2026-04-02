import java.io.*;

public class GerenciadorArquivos {

    // Escreve texto em um arquivo
    public static void escreverArquivo(String nomeArquivo, String texto) throws IOException {
        FileWriter fw = new FileWriter(nomeArquivo);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(texto);
        bw.close();
    }

    // Lê um arquivo e imprime seu conteúdo
    public static void lerArquivo(String nomeArquivo) throws IOException {
        FileReader fr = new FileReader(nomeArquivo);
        BufferedReader br = new BufferedReader(fr);
        String linha;
        while ((linha = br.readLine()) != null) {
            System.out.println(linha);
        }
        br.close();
    }

    public static void main(String[] args) {
        try {
            String arquivo = "exemplo.txt";

            // Escreve no arquivo
            escreverArquivo(arquivo, "Olá, este é um arquivo de teste.\nLinha 2 do arquivo.");

            // Lê o arquivo
            System.out.println("Conteúdo do arquivo:");
            lerArquivo(arquivo);

        } catch (IOException e) {
            System.out.println("Erro ao manipular o arquivo: " + e.getMessage());
        }
    }
}