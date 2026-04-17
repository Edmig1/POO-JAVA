package br.com.unesp.BibliotecaFCT.aplicacao;

import br.com.unesp.BibliotecaFCT.modelo.LivroDigital;
import br.com.unesp.BibliotecaFCT.modelo.LivroFisico;
import br.com.unesp.BibliotecaFCT.modelo.Usuario;

public class App {



    public static void main(String[] args){
        LivroFisico lf1 = new LivroFisico("Domínio da Programação","Carlos Silva","COD123",2022,3);
        LivroFisico lf2 = new LivroFisico("Estruturas de Dados Avançadas","Mariana Souza","COD456",2021,4);
        LivroDigital lf3 = new LivroDigital("Algoritmos na Prática","João Pereira","COD789",2023,"pdf",100);

        Usuario user1 = new Usuario(3,4321,"Ana",5);
        Usuario user2 = new Usuario(4,5678,"Bruno",2);
        Usuario user3 = new Usuario(5,8765,"Carla",1);
        lf1.pegaLivro(user1);
        user1.exibeUser();

        lf2.pegaLivro(user2);
        user2.exibeUser();

        lf3.pegaLivro(user3);
        user3.exibeUser();
    }
}
