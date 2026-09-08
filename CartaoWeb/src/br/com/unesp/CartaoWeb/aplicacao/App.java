package br.com.unesp.CartaoWeb.aplicacao;

import br.com.unesp.CartaoWeb.modelo.Aniversario;
import br.com.unesp.CartaoWeb.modelo.Cartao;
import br.com.unesp.CartaoWeb.modelo.DiaDosNamorados;
import br.com.unesp.CartaoWeb.modelo.Natal;

public class App {


    public static void main(String[] args){

        Cartao namoro = new DiaDosNamorados("Jorge");
        Cartao natal = new Natal("Jorge");
        Cartao aniversario = new Aniversario("Jorge");

        Cartao[] cartoes = new Cartao[3];
        cartoes[0] = namoro;
        cartoes[1] = natal;
        cartoes[2] = aniversario;

        for(Cartao c : cartoes){
            c.showMessage();
        }


    }
}