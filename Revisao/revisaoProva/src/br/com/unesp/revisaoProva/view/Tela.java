package br.com.unesp.revisaoProva.view;
import br.com.unesp.revisaoProva.control.AlunoController;
import javax.swing.*;
import java.awt.*;


public class Tela extends JFrame {
    private JTextField ra;
    private JTextField nome;
    private JComboBox curso;
    private JButton salvar;
    private JButton limpar;
    public String[] opcoes;
    private AlunoController controller;





    public Tela(){
        controller = new AlunoController();
        opcoes = new String[]{"Ciência da computação", "Fisioterapia", "Química"};
        initComponents();
    }
    private void initComponents() {
        setTitle("Cadastro Alunos");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        this.JPanel();
        setVisible(true);
    }

    public String getNome() {
        return nome.getText();
    }

    public String getRa() {
        return ra.getText();
    }

    public String getCurso() {
        return curso.getSelectedItem().toString();
    }

    private void JPanel() {

        JPanel painel = new JPanel();
        painel.setBackground(Color.black);
        painel.setPreferredSize(new Dimension(0, 50)); // altura = 80 px
        add(painel, BorderLayout.NORTH);

        JLabel titulo = new JLabel("Cadastro de Alunos");
        titulo.setForeground(Color.white);
        painel.add(titulo, BorderLayout.CENTER);

        JPanel form = new JPanel(new GridLayout(10, 10, 10, 10));
        form.setPreferredSize(new Dimension(200, 200)); // altura = 80 px

        JLabel labelRA = new JLabel("Insira seu RA");
        ra = new JTextField();
        ra.setPreferredSize(new Dimension(100,20));

        JLabel labelNome = new JLabel("Insira seu Nome");
        nome = new JTextField();
        nome.setPreferredSize(new Dimension(100,20));

        JLabel labelCursos = new JLabel("Escolha seu curso");
        curso = new JComboBox<>(opcoes);
        curso.setPreferredSize(new Dimension(100,20));

        salvar = new JButton("Salvar");
        salvar.addActionListener(e -> controller.cadastrarAluno(getRa(),getNome(),getCurso()));





        form.add(labelRA);
        form.add(ra);

        form.add(labelNome);
        form.add(nome);

        form.add(labelCursos);
        form.add(curso);

        form.add(salvar);

        add(form, BorderLayout.CENTER);


    }
}
