/*
 * Atividade 1 - LojaFCT
 * Formulário para coletar produtos e quantidades e calcular o total a pagar.
 */

import javax.swing.JOptionPane;

/**
 * Atividade 1 - Loja FCT
 * Lógica do botão "Finalizar Compra" implementada.
 */
public class Atividade1_View extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger =
            java.util.logging.Logger.getLogger(Atividade1_View.class.getName());

    private static final double[] PRECOS = {10.0, 10.0, 8.0, 8.0, 8.0, 6.0, 7.0};

    public Atividade1_View() {
        initComponents();
        jTextField2.setText("0");
        jTextField3.setText("0");
        jTextField4.setText("0");
        jTextField5.setText("0");
        jTextField6.setText("0");
        jTextField7.setText("0");
        jTextField8.setText("0");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loja FCT");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jCheckBox6.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jCheckBox6.setText("Refrigerante");

        jCheckBox7.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jCheckBox7.setText("Caldo de Cana");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel1.setText("Produtos");

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jCheckBox1.setText("Pastel");

        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jCheckBox2.setText("Hot Dog");

        jCheckBox3.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jCheckBox3.setText("Risoles");

        jCheckBox4.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jCheckBox4.setText("Coxinha");

        jCheckBox5.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jCheckBox5.setText("Kibe");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel10.setText("Valor");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel11.setText("R$ 10");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel12.setText("R$ 10");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel13.setText("R$ 8");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel14.setText("R$ 8");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel15.setText("R$ 8");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel16.setText("R$ 6");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel17.setText("R$ 7");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel18.setText("Total a pagar:");

        jButton1.setText("Finalizar Compra");
        // =====================================================
        // LÓGICA DO BOTÃO - calcula o total ao clicar
        // =====================================================
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel19.setText("Quantidade");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel20.setText("0,00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox5)
                            .addComponent(jCheckBox6)
                            .addComponent(jCheckBox7))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                        .addComponent(jTextField3)
                        .addComponent(jTextField4)
                        .addComponent(jTextField5)
                        .addComponent(jTextField6)
                        .addComponent(jTextField7)
                        .addComponent(jTextField8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)))
                .addGap(255, 255, 255))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(270, 270, 270)
                    .addComponent(jLabel19)
                    .addContainerGap(340, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel11)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(jLabel12)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox3)
                    .addComponent(jLabel13)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox4)
                    .addComponent(jLabel14)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox5)
                    .addComponent(jLabel15)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox6)
                    .addComponent(jLabel16)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox7)
                    .addComponent(jLabel17)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel20))
                .addGap(16, 16, 16))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(66, 66, 66)
                    .addComponent(jLabel19)
                    .addContainerGap(280, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>

    // calcula o total ao clicar em "Finalizar Compra"
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // checkboxes e textfields na mesma ordem (índice 0 = Pastel, etc.)
        javax.swing.JCheckBox[] checks = {
            jCheckBox1, jCheckBox2, jCheckBox3, jCheckBox4,
            jCheckBox5, jCheckBox6, jCheckBox7
        };
        javax.swing.JTextField[] campos = {
            jTextField2, jTextField3, jTextField4, jTextField5,
            jTextField6, jTextField7, jTextField8
        };

        double total = 0.0;

        for (int i = 0; i < checks.length; i++) {
            if (checks[i].isSelected()) {
                String textoQtd = campos[i].getText().trim();
                try {
                    int qtd = Integer.parseInt(textoQtd);
                    if (qtd < 0) {
                        JOptionPane.showMessageDialog(this,
                            "Quantidade não pode ser negativa: " + checks[i].getText(),
                            "Erro", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    total += qtd * PRECOS[i];
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this,
                        "Quantidade inválida para: " + checks[i].getText()
                        + "\nDigite apenas números inteiros.",
                        "Erro de entrada", JOptionPane.ERROR_MESSAGE);
                    campos[i].requestFocus();
                    return;
                }
            }
        }

        // Exibe o total formatado no label (ex.: "32,00")
        jLabel20.setText(String.format("%.2f", total).replace('.', ','));
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
        java.awt.EventQueue.invokeLater(() -> new Atividade1_View().setVisible(true));
    }

    // Variables declaration
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1, jCheckBox2, jCheckBox3, jCheckBox4,
                                  jCheckBox5, jCheckBox6, jCheckBox7;
    private javax.swing.JLabel jLabel1, jLabel10, jLabel11, jLabel12, jLabel13,
                               jLabel14, jLabel15, jLabel16, jLabel17,
                               jLabel18, jLabel19, jLabel20;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1, jTextField2, jTextField3,
                                   jTextField4, jTextField5, jTextField6,
                                   jTextField7, jTextField8;
    // End of variables declaration
}
