package view;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuView extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel contentPane;
    private JTextArea areaLivros;

    public MenuView() {

        setTitle("Sistema Biblioteca");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 700, 500);
        setLocationRelativeTo(null);

        contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());

        setContentPane(contentPane);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menuCadastro = new JMenu("Cadastro");
        JMenu menuSobre = new JMenu("Sobre");
        JMenu menuSair = new JMenu("Sair");

        menuBar.add(menuCadastro);
        menuBar.add(menuSobre);
        menuBar.add(menuSair);

        JMenuItem itemNovoLivro =
                new JMenuItem("Novo Livro");

        JMenuItem itemSobre =
                new JMenuItem("Informações");

        JMenuItem itemFechar =
                new JMenuItem("Fechar Sistema");

        menuCadastro.add(itemNovoLivro);
        menuSobre.add(itemSobre);
        menuSair.add(itemFechar);

        JLabel lblTitulo =
                new JLabel("MENU PRINCIPAL");

        lblTitulo.setFont(
                new Font("Arial",
                Font.BOLD,
                20));

        lblTitulo.setHorizontalAlignment(
                JLabel.CENTER);

        contentPane.add(
                lblTitulo,
                BorderLayout.NORTH);

        areaLivros = new JTextArea();

        areaLivros.setEditable(false);

        areaLivros.setText(
                "Sistema Biblioteca\n\n" +
                "Use o menu superior para navegar.");

        JScrollPane scroll =
                new JScrollPane(areaLivros);

        contentPane.add(
                scroll,
                BorderLayout.CENTER);

        itemNovoLivro.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(
                            ActionEvent e) {

                        CadastroLivro cadastro =
                                new CadastroLivro();

                        cadastro.setVisible(true);
                    }
                });

        itemSobre.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(
                            ActionEvent e) {

                        SobreView sobre =
                                new SobreView();

                        sobre.setVisible(true);
                    }
                });

        itemFechar.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(
                            ActionEvent e) {

                        dispose();
                    }
                });
    }
}