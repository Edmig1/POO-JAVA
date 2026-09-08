/*
 * Atividade 3 - Calculadora Swing
 * Estrutura: Content-Pane em BorderLayout
 *   - NORTH: JTextField (display)
 *   - CENTER: JPanel em GridLayout(4,4) com os botões
 *
 * Layout idêntico ao modelo do enunciado:
 *   Linha 1: 7  8  9  +
 *   Linha 2: 4  5  6  -
 *   Linha 3: 1  2  3  *
 *   Linha 4: C  0  =  /
 */

import javax.swing.*;
import java.awt.*;
import java.util.logging.Logger;

/**
 * Atividade 3 - Calculadora
 * Interface: BorderLayout + GridLayout(4,4) conforme o enunciado.
 * Lógica completa: +, -, *, / e tecla C para limpar.
 */
public class Atividade3_View extends javax.swing.JFrame {

    private static final Logger logger = Logger.getLogger(Atividade3_View.class.getName());

    // ---- Estado da calculadora ----
    private double primeiroOperando = 0;
    private String operadorPendente = "";
    private boolean aguardandoSegundoNumero = false;
    private boolean resultadoExibido = false;

    // ---- Componentes (nomes no estilo NetBeans) ----
    private JTextField jTextFieldDisplay;
    private JPanel     jPanelBotoes;

    public Atividade3_View() {
        initComponents();
    }

    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setResizable(false);

        // ============================================================
        // NORTH — display (JTextField)
        // ============================================================
        jTextFieldDisplay = new JTextField("0");
        jTextFieldDisplay.setHorizontalAlignment(JTextField.RIGHT);
        jTextFieldDisplay.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        jTextFieldDisplay.setEditable(false);
        jTextFieldDisplay.setPreferredSize(new Dimension(280, 45));
        jTextFieldDisplay.setBackground(Color.WHITE);

        // ============================================================
        // CENTER — JPanel em GridLayout(4,4)
        // ============================================================
        jPanelBotoes = new JPanel(new GridLayout(4, 4, 5, 5));
        jPanelBotoes.setBackground(new Color(220, 220, 220));
        jPanelBotoes.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        // Rótulos dos botões — ordem igual ao enunciado
        String[] rotulos = {
            "7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "*",
            "C", "0", "=", "/"
        };

        for (String rotulo : rotulos) {
            JButton btn = criarBotao(rotulo);
            jPanelBotoes.add(btn);
        }

        // ============================================================
        // Monta o frame com BorderLayout
        // ============================================================
        getContentPane().setLayout(new BorderLayout(5, 5));
        getContentPane().add(jTextFieldDisplay, BorderLayout.NORTH);
        getContentPane().add(jPanelBotoes,      BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }

    /**
     * Cria um JButton estilizado e com o ActionListener correto.
     */
    private JButton criarBotao(String rotulo) {
        JButton btn = new JButton(rotulo);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 15));
        btn.setFocusPainted(false);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.setPreferredSize(new Dimension(60, 45));

        // Cor de destaque para operadores e C/=
        if ("+-*/".contains(rotulo)) {
            btn.setBackground(new Color(200, 120, 60));
            btn.setForeground(Color.WHITE);
        } else if ("=".equals(rotulo)) {
            btn.setBackground(new Color(60, 140, 200));
            btn.setForeground(Color.WHITE);
        } else if ("C".equals(rotulo)) {
            btn.setBackground(new Color(200, 60, 60));
            btn.setForeground(Color.WHITE);
        } else {
            btn.setBackground(new Color(245, 245, 245));
            btn.setForeground(Color.DARK_GRAY);
        }

        btn.addActionListener(e -> processarClique(rotulo));
        return btn;
    }

    // =========================================================
    // LÓGICA DA CALCULADORA
    // =========================================================

    /** Decide o que fazer conforme o botão clicado. */
    private void processarClique(String rotulo) {
        switch (rotulo) {
            case "C"  -> limpar();
            case "="  -> calcular();
            case "+", "-", "*", "/" -> definirOperador(rotulo);
            default   -> digitarNumero(rotulo);   // dígitos 0–9
        }
    }

    /** Acrescenta um dígito ao display. */
    private void digitarNumero(String digito) {
        if (aguardandoSegundoNumero || resultadoExibido) {
            jTextFieldDisplay.setText(digito);
            aguardandoSegundoNumero = false;
            resultadoExibido = false;
        } else {
            String atual = jTextFieldDisplay.getText();
            jTextFieldDisplay.setText("0".equals(atual) ? digito : atual + digito);
        }
    }

    /** Armazena o operador e o primeiro operando. */
    private void definirOperador(String op) {
        // Se já havia um operador pendente, calcula antes de trocar
        if (!operadorPendente.isEmpty() && !aguardandoSegundoNumero) {
            calcular();
        }
        primeiroOperando     = Double.parseDouble(jTextFieldDisplay.getText());
        operadorPendente     = op;
        aguardandoSegundoNumero = true;
        resultadoExibido     = false;
    }

    /** Executa o cálculo e exibe o resultado. */
    private void calcular() {
        if (operadorPendente.isEmpty()) return;

        double segundoOperando = Double.parseDouble(jTextFieldDisplay.getText());
        double resultado;

        switch (operadorPendente) {
            case "+" -> resultado = primeiroOperando + segundoOperando;
            case "-" -> resultado = primeiroOperando - segundoOperando;
            case "*" -> resultado = primeiroOperando * segundoOperando;
            case "/" -> {
                if (segundoOperando == 0) {
                    JOptionPane.showMessageDialog(this, "Divisão por zero!",
                            "Erro", JOptionPane.ERROR_MESSAGE);
                    limpar();
                    return;
                }
                resultado = primeiroOperando / segundoOperando;
            }
            default -> resultado = segundoOperando;
        }

        // Exibe sem casas decimais desnecessárias (ex.: 10.0 → "10")
        if (resultado == Math.floor(resultado) && !Double.isInfinite(resultado)) {
            jTextFieldDisplay.setText(String.valueOf((long) resultado));
        } else {
            jTextFieldDisplay.setText(String.format("%.8g", resultado));
        }

        operadorPendente     = "";
        aguardandoSegundoNumero = false;
        resultadoExibido     = true;
    }

    /** Reseta tudo para o estado inicial. */
    private void limpar() {
        jTextFieldDisplay.setText("0");
        primeiroOperando        = 0;
        operadorPendente        = "";
        aguardandoSegundoNumero = false;
        resultadoExibido        = false;
    }

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new Atividade3_View().setVisible(true));
    }
}
