import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CadastroAluno extends JFrame {

    private JTextField txtNome, txtCurso, txtRA;
    private JComboBox<String> cbPeriodo;
    private JCheckBox chkMonitoria, chkIC;
    private JButton btnSalvar, btnLimpar, btnSair;

    public CadastroAluno() {

        setTitle("Cadastro de Aluno");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(8, 2, 5, 5));

        add(new JLabel("Nome:"));
        txtNome = new JTextField();
        add(txtNome);

        add(new JLabel("Curso:"));
        txtCurso = new JTextField();
        add(txtCurso);

        add(new JLabel("RA:"));
        txtRA = new JTextField();
        add(txtRA);

        add(new JLabel("Período:"));
        cbPeriodo = new JComboBox<>(new String[]{"Manhã", "Tarde", "Noite"});
        add(cbPeriodo);

        chkMonitoria = new JCheckBox("Monitoria");
        chkIC = new JCheckBox("Iniciação Científica");

        add(chkMonitoria);
        add(chkIC);

        btnSalvar = new JButton("Salvar");
        btnLimpar = new JButton("Limpar");
        btnSair = new JButton("Sair");

        add(btnSalvar);
        add(btnLimpar);
        add(btnSair);

        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Dados salvos com sucesso!");
            }
        });

        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                txtNome.setText("");
                txtCurso.setText("");
                txtRA.setText("");

                chkMonitoria.setSelected(false);
                chkIC.setSelected(false);

                cbPeriodo.setSelectedIndex(0);
            }
        });

        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        chkMonitoria.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if (chkMonitoria.isSelected()) {
                    JOptionPane.showMessageDialog(null,
                            "Monitoria selecionada");
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Monitoria removida");
                }
            }
        });
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CadastroAluno().setVisible(true);
            }
        });
    }
}