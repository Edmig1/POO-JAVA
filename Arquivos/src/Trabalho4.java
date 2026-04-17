import java.io.*;

/**
 * Classe Trabalho4 realiza operações com arquivos:
 * escrita, leitura, adição de conteúdo, contagem de linhas e busca de palavras.
 * Autor: Miguel - Edmig1
 * Data: 02/04/2026
 * Versão: 1.0
 */

public class Trabalho4 {

    /** escreverArquivo
     * Escreve um texto em um arquivo (sobrescreve o conteúdo existente).
     * @param nomeArquivo nome do arquivo a ser criado/alterado
     * @param texto conteúdo a ser escrito no arquivo
     * @throws IOException caso ocorra erro na escrita
     */
    public static void escreverArquivo(String nomeArquivo, String texto) throws IOException {
        FileWriter fw = new FileWriter(nomeArquivo);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(texto);
        bw.close();
    }

    /** lerArquivo
     * Lê um arquivo e imprime seu conteúdo no console.
     * @param nomeArquivo nome do arquivo a ser lido
     * @throws IOException caso ocorra erro na leitura
     */
    public static void lerArquivo(String nomeArquivo) throws IOException {
        FileReader fr = new FileReader(nomeArquivo);
        BufferedReader br = new BufferedReader(fr);

        String linha;

        // Percorre todas as linhas do arquivo
        while ((linha = br.readLine()) != null) {
            System.out.println(linha);
        }

        br.close();
    }

    /** escreverNovaLinha
     * Adiciona uma nova linha ao final do arquivo sem sobrescrever o conteúdo existente.
     * @param nomeArquivo nome do arquivo a ser alterado
     * @param texto conteúdo a ser adicionado
     * @throws IOException caso ocorra erro na escrita
     */
    public static void escreverNovaLinha(String nomeArquivo, String texto) throws IOException {
        FileWriter fw = new FileWriter(nomeArquivo, true); // modo append
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(System.lineSeparator() + texto);
        bw.close();
    }

    /** contarLinha
     * Conta o número de linhas de um arquivo e imprime o resultado.
     * @param nomeArquivo nome do arquivo a ser analisado
     * @throws IOException caso ocorra erro na leitura
     */
    public static void contarLinha(String nomeArquivo) throws IOException {
        FileReader fr = new FileReader(nomeArquivo);
        BufferedReader br = new BufferedReader(fr);

        String linha;
        int contador = 0;

        // Conta todas as linhas do arquivo
        while ((linha = br.readLine()) != null) {
            contador++;
        }

        br.close();

        System.out.println("\nO arquivo possui " + contador + " linhas!");
    }

    /** buscarPalavra
     * Busca uma palavra dentro do arquivo.
     * @param nomeArquivo nome do arquivo a ser analisado
     * @param palavra palavra a ser buscada
     * @return retorna true se a palavra for encontrada, caso contrário false
     * @throws IOException caso ocorra erro na leitura
     */
    public static boolean buscarPalavra(String nomeArquivo, String palavra) throws IOException {
        FileReader fr = new FileReader(nomeArquivo);
        BufferedReader br = new BufferedReader(fr);

        String linha;

        // Percorre todas as linhas do arquivo
        while ((linha = br.readLine()) != null) {
            // Verifica se a linha contém a palavra
            if (linha.contains(palavra)) {
                br.close();
                return true; // Palavra encontrada
            }
        }

        br.close();
        return false; // Palavra não encontrada
    }

    /** main
     * Método principal responsável por executar as operações com arquivo.
     */
    public static void main(String[] args) {
        try {
            String arquivo = "exemplo.txt";

            // Escreve no arquivo
            escreverArquivo(arquivo, "Olá, este é um arquivo de teste.\nLinha 2 do arquivo.");

            // Lê o arquivo
            System.out.println("Conteúdo do arquivo:");
            lerArquivo(arquivo);

            // Adiciona nova linha
            escreverNovaLinha(arquivo, "Linha 3 do arquivo.");

            // Conta linhas
            contarLinha(arquivo);

            // Busca palavra no arquivo
            String palavra = "teste";
            boolean resultado = buscarPalavra(arquivo, palavra);

            if (resultado) {
                System.out.println("\nA palavra foi encontrada no arquivo!");
            } else {
                System.out.println("\nA palavra NÃO foi encontrada no arquivo!");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado!");
        } catch (SecurityException e) {
            System.out.println("Sem permissão para acessar o arquivo!");
        } catch (IOException e) {
            System.out.println("Erro ao manipular o arquivo: " + e.getMessage());
        }
    }
}