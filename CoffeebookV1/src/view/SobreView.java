package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

public class SobreView extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel contentPane;

    public SobreView() {

        setTitle("Sobre o Sistema");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setLocationRelativeTo(null);
        setResizable(false);

        contentPane = new JPanel();

        contentPane.setBorder(
                new EmptyBorder(5,5,5,5));

        setContentPane(contentPane);

        contentPane.setLayout(null);

        JLabel lblTitulo =
                new JLabel("SISTEMA DE BIBLIOTECA");

        lblTitulo.setFont(
                new Font("Arial", Font.BOLD, 18));

        lblTitulo.setBounds(80, 30, 300, 30);

        contentPane.add(lblTitulo);

        JLabel lblDisciplina =
                new JLabel("Disciplina: POO");

        lblDisciplina.setBounds(120, 90, 200, 25);

        contentPane.add(lblDisciplina);

        JLabel lblProfessor =
                new JLabel("Professor: Pedro");

        lblProfessor.setBounds(120, 120, 250, 25);

        contentPane.add(lblProfessor);

        JLabel lblEquipe =
                new JLabel("Equipe: Cristhian, Icaro, Jordan, Lohanny");

        lblEquipe.setBounds(120, 150, 250, 25);

        contentPane.add(lblEquipe);

        JLabel lblVersao =
                new JLabel("Versão 1.0");

        lblVersao.setBounds(170, 210, 100, 25);

        contentPane.add(lblVersao);
    }
}