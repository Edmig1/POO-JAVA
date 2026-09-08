/*
 * Atividade 2 - Cadastro com exportação para PDF
 * SEM dependências externas — usa apenas java.awt.print + javax.print (JDK padrão).
 *
 * Como funciona a geração de PDF:
 *   PrinterJob com destino StreamPrintService (formato application/pdf)
 *   disponível no JDK desde Java 8 via javax.print.
 *   Não precisa de iText, PDFBox nem nenhum JAR adicional.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.print.*;
import java.io.*;
import java.util.logging.*;
import javax.print.*;

/**
 * Atividade 2 - Cadastro
 * Interface: replica o design do enunciado usando GroupLayout (padrão NetBeans).
 * Lógica: exporta os dados para PDF ao clicar em SALVAR — zero dependências externas.
 */
public class Atividade2_View extends javax.swing.JFrame {

    private static final Logger logger = Logger.getLogger(Atividade2_View.class.getName());

    private static final String[] UFS = {
        "AC","AL","AP","AM","BA","CE","DF","ES","GO","MA","MT","MS",
        "MG","PA","PB","PR","PE","PI","RJ","RN","RS","RO","RR","SC",
        "SP","SE","TO"
    };

    public Atividade2_View() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        // ---------- Seção CADASTRO ----------
        jPanelCadastro = new JPanel();
        jPanelCadastro.setBorder(
            BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Cadastro",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new Font("Segoe UI", Font.BOLD, 13)));

        jLabelNome      = new JLabel("NOME:");
        jLabelTelefone  = new JLabel("TELEFONE:");
        jLabelEndereco  = new JLabel("ENDEREÇO:");
        jLabelCidade    = new JLabel("CIDADE:");
        jLabelUF        = new JLabel("UF:");
        jLabelEmail     = new JLabel("E-MAIL:");
        jLabelSexo      = new JLabel("SEXO:");

        Font fBold = new Font("Segoe UI", Font.BOLD, 11);
        for (JLabel l : new JLabel[]{jLabelNome, jLabelTelefone, jLabelEndereco,
                                      jLabelCidade, jLabelUF, jLabelEmail, jLabelSexo})
            l.setFont(fBold);

        jTextFieldNome     = new JTextField(20);
        jTextFieldTelefone = new JTextField(15);
        jTextFieldEndereco = new JTextField(20);
        jTextFieldCidade   = new JTextField(12);
        jComboBoxUF        = new JComboBox<>(UFS);

        ButtonGroup bgSexo = new ButtonGroup();
        jRadioFeminino  = new JRadioButton("Feminino");
        jRadioMasculino = new JRadioButton("Masculino");
        bgSexo.add(jRadioFeminino);
        bgSexo.add(jRadioMasculino);

        jTextFieldEmail = new JTextField(20);

        javax.swing.GroupLayout glCad = new javax.swing.GroupLayout(jPanelCadastro);
        jPanelCadastro.setLayout(glCad);
        glCad.setAutoCreateGaps(true);
        glCad.setAutoCreateContainerGaps(true);

        glCad.setHorizontalGroup(glCad.createSequentialGroup()
            .addGroup(glCad.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(glCad.createSequentialGroup()
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20)
                    .addComponent(jLabelTelefone)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(glCad.createSequentialGroup()
                    .addComponent(jLabelEndereco)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20)
                    .addComponent(jLabelCidade)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10)
                    .addComponent(jLabelUF)
                    .addComponent(jComboBoxUF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(glCad.createSequentialGroup()
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20)
                    .addComponent(jLabelSexo)
                    .addComponent(jRadioFeminino)
                    .addComponent(jRadioMasculino)))
        );
        glCad.setVerticalGroup(glCad.createSequentialGroup()
            .addGroup(glCad.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelNome)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabelTelefone)
                .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(glCad.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelEndereco)
                .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabelCidade)
                .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabelUF)
                .addComponent(jComboBoxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(glCad.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelEmail)
                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabelSexo)
                .addComponent(jRadioFeminino)
                .addComponent(jRadioMasculino))
        );

        // ---------- Seção CURSOS ----------
        jPanelCursos = new JPanel();
        jPanelCursos.setBorder(
            BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Cursos",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new Font("Segoe UI", Font.BOLD, 13)));

        jLabelSelecioneCurso = new JLabel("SELECIONE O(S) CURSO(S):");
        jLabelSelecioneCurso.setFont(fBold);
        jLabelMotivo = new JLabel("POR QUE SE INTERESSA POR ESSE(S) CURSO(S):");
        jLabelMotivo.setFont(fBold);

        jCheckBoxAlemao   = new JCheckBox("Alemão");
        jCheckBoxEspanhol = new JCheckBox("Espanhol");
        jCheckBoxFrances  = new JCheckBox("Francês");
        jCheckBoxIngles   = new JCheckBox("Inglês");
        jCheckBoxItaliano = new JCheckBox("Italiano");
        jCheckBoxJapones  = new JCheckBox("Japonês");

        jTextAreaMotivo = new JTextArea(5, 40);
        jTextAreaMotivo.setLineWrap(true);
        jTextAreaMotivo.setWrapStyleWord(true);
        JScrollPane scrollMotivo = new JScrollPane(jTextAreaMotivo);

        JPanel panelChecks = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 0));
        for (JCheckBox cb : new JCheckBox[]{jCheckBoxAlemao, jCheckBoxEspanhol, jCheckBoxFrances,
                                             jCheckBoxIngles, jCheckBoxItaliano, jCheckBoxJapones})
            panelChecks.add(cb);

        javax.swing.GroupLayout glCursos = new javax.swing.GroupLayout(jPanelCursos);
        jPanelCursos.setLayout(glCursos);
        glCursos.setAutoCreateGaps(true);
        glCursos.setAutoCreateContainerGaps(true);

        glCursos.setHorizontalGroup(glCursos.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelSelecioneCurso)
            .addComponent(panelChecks)
            .addComponent(jLabelMotivo)
            .addComponent(scrollMotivo)
        );
        glCursos.setVerticalGroup(glCursos.createSequentialGroup()
            .addComponent(jLabelSelecioneCurso)
            .addComponent(panelChecks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabelMotivo)
            .addComponent(scrollMotivo, 100, 100, 100)
        );

        // ---------- Botão SALVAR ----------
        jButtonSalvar = new JButton("SALVAR");
        jButtonSalvar.setFont(new Font("Segoe UI", Font.BOLD, 12));
        jButtonSalvar.addActionListener(e -> jButtonSalvarActionPerformed());

        // ---------- Layout principal ----------
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");

        javax.swing.GroupLayout glMain = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(glMain);
        glMain.setAutoCreateGaps(true);
        glMain.setAutoCreateContainerGaps(true);

        glMain.setHorizontalGroup(glMain.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCadastro)
            .addComponent(jPanelCursos)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, glMain.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalvar))
        );
        glMain.setVerticalGroup(glMain.createSequentialGroup()
            .addComponent(jPanelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanelCursos)
            .addComponent(jButtonSalvar)
        );

        pack();
        setLocationRelativeTo(null);
    }

    // =========================================================
    // LÓGICA: gera o PDF ao clicar em SALVAR — zero dependências
    // =========================================================
    private void jButtonSalvarActionPerformed() {

        if (jTextFieldNome.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo NOME é obrigatório.",
                    "Atenção", JOptionPane.WARNING_MESSAGE);
            jTextFieldNome.requestFocus();
            return;
        }

        // Cursos selecionados
        StringBuilder cursos = new StringBuilder();
        for (JCheckBox cb : new JCheckBox[]{jCheckBoxAlemao, jCheckBoxEspanhol,
                jCheckBoxFrances, jCheckBoxIngles, jCheckBoxItaliano, jCheckBoxJapones}) {
            if (cb.isSelected()) {
                if (cursos.length() > 0) cursos.append(", ");
                cursos.append(cb.getText());
            }
        }

        // Coleta os dados em string para usar no Printable
        String nome      = jTextFieldNome.getText().trim();
        String telefone  = jTextFieldTelefone.getText().trim();
        String endereco  = jTextFieldEndereco.getText().trim();
        String cidade    = jTextFieldCidade.getText().trim();
        String uf        = (String) jComboBoxUF.getSelectedItem();
        String email     = jTextFieldEmail.getText().trim();
        String sexo      = jRadioFeminino.isSelected()  ? "Feminino"
                         : jRadioMasculino.isSelected() ? "Masculino"
                         : "Não informado";
        String cursosTxt = cursos.length() == 0 ? "Nenhum selecionado" : cursos.toString();
        String motivo    = jTextAreaMotivo.getText().trim().isEmpty()
                         ? "-" : jTextAreaMotivo.getText().trim();

        // Diálogo para escolher onde salvar
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Salvar cadastro como PDF");
        fc.setSelectedFile(new File("cadastro_" + nome.replaceAll("\\s+", "_") + ".pdf"));
        fc.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("PDF (*.pdf)", "pdf"));
        if (fc.showSaveDialog(this) != JFileChooser.APPROVE_OPTION) return;

        File arquivo = fc.getSelectedFile();
        if (!arquivo.getName().toLowerCase().endsWith(".pdf"))
            arquivo = new File(arquivo.getAbsolutePath() + ".pdf");

        // Verifica se a JVM consegue gerar PDF sem driver de impressora física
        DocFlavor flavor = DocFlavor.OUTPUT_STREAM.PDF;
        StreamPrintServiceFactory[] factories =
                StreamPrintServiceFactory.lookupStreamPrintServiceFactories(null, flavor.getMimeType());

        if (factories.length == 0) {
            // Fallback: gera arquivo de texto simples (.txt) com os dados
            salvarComoTexto(arquivo, nome, telefone, endereco, cidade, uf,
                            email, sexo, cursosTxt, motivo);
            return;
        }

        try (FileOutputStream fos = new FileOutputStream(arquivo)) {
            StreamPrintService sps = factories[0].getPrintService(fos);
            PrinterJob job = PrinterJob.getPrinterJob();
            job.setPrintService(sps);

            PageFormat pf = job.defaultPage();
            pf.setOrientation(PageFormat.PORTRAIT);

            // Printable com os dados do formulário
            final String[] linhas = montarLinhas(nome, telefone, endereco, cidade,
                                                  uf, email, sexo, cursosTxt, motivo);
            job.setPrintable((graphics, pageFormat, pageIndex) -> {
                if (pageIndex > 0) return Printable.NO_SUCH_PAGE;
                Graphics2D g2 = (Graphics2D) graphics;
                g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                                    RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

                double x = pageFormat.getImageableX();
                double y = pageFormat.getImageableY();

                // Título
                g2.setFont(new Font("Segoe UI", Font.BOLD, 18));
                g2.setColor(new Color(30, 60, 120));
                g2.drawString("CADASTRO", (int) x, (int) y + 20);

                // Linha separadora
                g2.setColor(new Color(30, 60, 120));
                g2.drawLine((int) x, (int) y + 28,
                            (int) (x + pageFormat.getImageableWidth()), (int) y + 28);

                int posY = (int) y + 52;
                for (String linha : linhas) {
                    if (linha.startsWith("##")) {
                        // Seção
                        g2.setFont(new Font("Segoe UI", Font.BOLD, 13));
                        g2.setColor(new Color(30, 60, 120));
                        g2.drawString(linha.substring(2).trim(), (int) x, posY);
                        posY += 6;
                        g2.setColor(new Color(180, 180, 180));
                        g2.drawLine((int) x, posY,
                                    (int) (x + pageFormat.getImageableWidth()), posY);
                        posY += 14;
                    } else if (linha.startsWith("**")) {
                        // Label em negrito + valor
                        int sep = linha.indexOf(":", 2);
                        String label = linha.substring(2, sep + 1);
                        String valor = linha.substring(sep + 1).trim();

                        g2.setFont(new Font("Segoe UI", Font.BOLD, 11));
                        g2.setColor(Color.DARK_GRAY);
                        g2.drawString(label, (int) x, posY);

                        int lw = g2.getFontMetrics().stringWidth(label);
                        g2.setFont(new Font("Segoe UI", Font.PLAIN, 11));
                        g2.setColor(Color.BLACK);
                        g2.drawString(" " + valor, (int) x + lw, posY);
                        posY += 18;
                    } else if (linha.isEmpty()) {
                        posY += 10;
                    } else {
                        // Texto simples (motivo multilinha)
                        g2.setFont(new Font("Segoe UI", Font.PLAIN, 11));
                        g2.setColor(Color.BLACK);
                        g2.drawString(linha, (int) x + 10, posY);
                        posY += 16;
                    }
                }

                // Rodapé
                java.time.format.DateTimeFormatter fmt =
                    java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                String agora = java.time.LocalDateTime.now().format(fmt);
                g2.setFont(new Font("Segoe UI", Font.ITALIC, 9));
                g2.setColor(Color.GRAY);
                g2.drawString("Gerado em: " + agora,
                    (int) x, (int) (y + pageFormat.getImageableHeight() - 10));

                return Printable.PAGE_EXISTS;
            }, pf);

            job.print();

            JOptionPane.showMessageDialog(this,
                "PDF gerado com sucesso!\n" + arquivo.getAbsolutePath(),
                "Sucesso", JOptionPane.INFORMATION_MESSAGE);

        } catch (PrinterException | IOException e) {
            logger.log(Level.SEVERE, "Erro ao gerar PDF", e);
            JOptionPane.showMessageDialog(this,
                "Erro ao gerar o PDF:\n" + e.getMessage(),
                "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    /** Monta as linhas de conteúdo que serão desenhadas no PDF. */
    private String[] montarLinhas(String nome, String telefone, String endereco,
                                   String cidade, String uf, String email,
                                   String sexo, String cursos, String motivo) {
        java.util.List<String> l = new java.util.ArrayList<>();
        l.add("");
        l.add("## Dados Pessoais");
        l.add("**Nome: " + nome);
        l.add("**Telefone: " + telefone);
        l.add("**Endereço: " + endereco);
        l.add("**Cidade / UF: " + cidade + " / " + uf);
        l.add("**E-mail: " + email);
        l.add("**Sexo: " + sexo);
        l.add("");
        l.add("## Cursos de Interesse");
        l.add("**Curso(s): " + cursos);
        l.add("");
        l.add("**Motivo:");
        // Quebra o motivo em linhas de ~80 chars
        for (String parte : motivo.split("\n")) {
            l.add(parte.isEmpty() ? "" : "  " + parte);
        }
        return l.toArray(new String[0]);
    }

    /**
     * Fallback caso a JVM não suporte StreamPrintService para PDF:
     * salva um arquivo .txt com os mesmos dados formatados.
     */
    private void salvarComoTexto(File arquivo, String nome, String telefone,
                                  String endereco, String cidade, String uf,
                                  String email, String sexo, String cursos, String motivo) {
        File txt = new File(arquivo.getAbsolutePath().replace(".pdf", ".txt"));
        try (PrintWriter pw = new PrintWriter(new OutputStreamWriter(
                new FileOutputStream(txt), java.nio.charset.StandardCharsets.UTF_8))) {
            pw.println("CADASTRO");
            pw.println("=".repeat(50));
            pw.println("Nome     : " + nome);
            pw.println("Telefone : " + telefone);
            pw.println("Endereço : " + endereco);
            pw.println("Cidade   : " + cidade + " / " + uf);
            pw.println("E-mail   : " + email);
            pw.println("Sexo     : " + sexo);
            pw.println();
            pw.println("CURSOS");
            pw.println("-".repeat(50));
            pw.println("Curso(s) : " + cursos);
            pw.println("Motivo   : " + motivo);
            pw.println();
            java.time.format.DateTimeFormatter fmt =
                java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            pw.println("Gerado em: " + java.time.LocalDateTime.now().format(fmt));
            JOptionPane.showMessageDialog(this,
                "Sua JVM não suporta geração direta de PDF.\n"
                + "Cadastro salvo como TXT:\n" + txt.getAbsolutePath(),
                "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (IOException ex) {
            logger.log(Level.SEVERE, "Erro ao salvar TXT", ex);
            JOptionPane.showMessageDialog(this, "Erro: " + ex.getMessage(),
                "Erro", JOptionPane.ERROR_MESSAGE);
        }
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
            logger.log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new Atividade2_View().setVisible(true));
    }

    // Variables declaration
    private JPanel jPanelCadastro, jPanelCursos;
    private JLabel jLabelNome, jLabelTelefone, jLabelEndereco, jLabelCidade,
                   jLabelUF, jLabelEmail, jLabelSexo, jLabelSelecioneCurso, jLabelMotivo;
    private JTextField jTextFieldNome, jTextFieldTelefone, jTextFieldEndereco,
                       jTextFieldCidade, jTextFieldEmail;
    private JComboBox<String> jComboBoxUF;
    private JRadioButton jRadioFeminino, jRadioMasculino;
    private JCheckBox jCheckBoxAlemao, jCheckBoxEspanhol, jCheckBoxFrances,
                      jCheckBoxIngles, jCheckBoxItaliano, jCheckBoxJapones;
    private JTextArea jTextAreaMotivo;
    private JButton jButtonSalvar;
    // End of variables declaration
}
