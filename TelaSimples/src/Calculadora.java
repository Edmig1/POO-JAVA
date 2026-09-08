import javax.swing.*;
import java.util.Objects;

public class Calculadora extends JFrame {


    public static void main(String[] args){


        // Entrada do primeiro número
        String n1 = JOptionPane.showInputDialog(
                null, "Primeiro número:", "Entrada", JOptionPane.QUESTION_MESSAGE
        );

        // Entrada do segundo número
        String n2 = JOptionPane.showInputDialog(
                null, "Segundo número:", "Entrada", JOptionPane.QUESTION_MESSAGE
        );

        // Entrada do segundo número
        String  op = JOptionPane.showInputDialog(
                null, "Escolha entre [+,-,*,/]: ", "Entrada", JOptionPane.QUESTION_MESSAGE
        );

        if (Objects.equals(op, "+")) {
            JOptionPane.showMessageDialog(null,"Soma: "+(Float.parseFloat(n1) + Float.parseFloat(n2)));
        }
        else if (Objects.equals(op, "*")) {
            JOptionPane.showMessageDialog(null,"Multiplicação: "+(Float.parseFloat(n1) * Float.parseFloat(n2)));
        }
        else if (Objects.equals(op, "-")) {
            JOptionPane.showMessageDialog(null,"Subtrção: "+(Float.parseFloat(n1) - Float.parseFloat(n2)));
        }
        else if (Objects.equals(op, "/")) {
            JOptionPane.showMessageDialog(null,"Divisão: "+(Float.parseFloat(n1) / Float.parseFloat(n2)));
        }
        else{
            JOptionPane.showMessageDialog(null," Operação Inválida ","! ERRO !",JOptionPane.ERROR_MESSAGE);

        }


    }
}
