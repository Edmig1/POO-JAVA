package br.com.unesp.revisaoProva.aplicacao;

import br.com.unesp.revisaoProva.view.Tela;
import javax.swing.SwingUtilities;


public class App {

    public static void main(String[] args){
        SwingUtilities.invokeLater(Tela::new);
    }
}
