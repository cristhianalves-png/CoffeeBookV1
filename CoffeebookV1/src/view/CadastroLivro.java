package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Livro;

public class CadastroLivro extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel contentPane;

    private JTextField txtTitulo;
    private JTextField txtAutor;
    private JTextField txtCategoria;

    // CONSTRUTOR
    public CadastroLivro() {

        setTitle("Cadastro de Livro");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 500, 350);
        setLocationRelativeTo(null);
        setResizable(false);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblTituloTela =
                new JLabel("CADASTRO DE LIVROS");

        lblTituloTela.setFont(
                new Font("Arial",
                Font.BOLD,
                18));

        lblTituloTela.setBounds(
                120, 20, 250, 30);

        contentPane.add(lblTituloTela);

        JLabel lblTitulo =
                new JLabel("Título:");

        lblTitulo.setBounds(
                50, 80, 80, 25);

        contentPane.add(lblTitulo);

        txtTitulo = new JTextField();

        txtTitulo.setBounds(
                150, 80, 250, 25);

        contentPane.add(txtTitulo);

        JLabel lblAutor =
                new JLabel("Autor:");

        lblAutor.setBounds(
                50, 130, 80, 25);

        contentPane.add(lblAutor);

        txtAutor = new JTextField();

        txtAutor.setBounds(
                150, 130, 250, 25);

        contentPane.add(txtAutor);

        JLabel lblCategoria =
                new JLabel("Categoria:");

        lblCategoria.setBounds(
                50, 180, 80, 25);

        contentPane.add(lblCategoria);

        txtCategoria = new JTextField();

        txtCategoria.setBounds(
                150, 180, 250, 25);

        contentPane.add(txtCategoria);

        JButton btnSalvar =
                new JButton("Salvar");

        btnSalvar.setBounds(
                190, 250, 100, 30);

        contentPane.add(btnSalvar);

        btnSalvar.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(
                            ActionEvent e) {

                        cadastrarLivro();
                    }
                });
    }

    private void cadastrarLivro() {

        String titulo = txtTitulo.getText();

        String autor = txtAutor.getText();

        String categoria = txtCategoria.getText();

        if (titulo.isEmpty()
                || autor.isEmpty()
                || categoria.isEmpty()) {

            JOptionPane.showMessageDialog(
                    null,
                    "Preencha todos os campos!");

            return;
        }

        Livro livro = new Livro();

        livro.setTitulo(titulo);
        livro.setAutor(autor);
        livro.setCategoria(categoria);
 
        JOptionPane.showMessageDialog(
                null,
                "Livro cadastrado com sucesso!");

        limparCampos();
    } 

    private void limparCampos() {

        txtTitulo.setText("");
        txtAutor.setText("");
        txtCategoria.setText("");

        txtTitulo.requestFocus();
    }
}