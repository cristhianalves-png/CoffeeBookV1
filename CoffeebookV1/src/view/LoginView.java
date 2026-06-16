package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.LoginController;

public class LoginView extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel contentPane;
    private JTextField txtUsuario;
    private JPasswordField txtSenha;

    public LoginView() {

        setTitle("Sistema Biblioteca");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setLocationRelativeTo(null);
        setResizable(false);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblTitulo = new JLabel("LOGIN");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 22));
        lblTitulo.setBounds(170, 20, 120, 30);
        contentPane.add(lblTitulo);

        JLabel lblUsuario = new JLabel("Usuário:");
        lblUsuario.setBounds(80, 80, 80, 20);
        contentPane.add(lblUsuario);

        txtUsuario = new JTextField();
        txtUsuario.setBounds(150, 80, 180, 25);
        contentPane.add(txtUsuario);

        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setBounds(80, 130, 80, 20);
        contentPane.add(lblSenha);

        txtSenha = new JPasswordField();
        txtSenha.setBounds(150, 130, 180, 25);
        contentPane.add(txtSenha);

        JButton btnEntrar = new JButton("Entrar");
        btnEntrar.setBounds(170, 190, 100, 30);
        contentPane.add(btnEntrar);

        btnEntrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                realizarLogin();
            }
        });
    }

    private void realizarLogin() {

        String usuario = txtUsuario.getText();

        String senha =
                String.valueOf(
                        txtSenha.getPassword());

        if (usuario.isEmpty() || senha.isEmpty()) {

            JOptionPane.showMessageDialog(
                    null,
                    "Preencha usuario e senha!");

            return;
        }

        LoginController controller =
                new LoginController();

        if (controller.autenticar(usuario, senha)) {

            JOptionPane.showMessageDialog(
                    null,
                    "Login realizado com sucesso!");

            MenuView menu =
                    new MenuView();

            menu.setVisible(true);

            dispose();

        } else {

            JOptionPane.showMessageDialog(
                    null,
                    "Usuario ou senha invalidos!");

            txtSenha.setText("");
            txtSenha.requestFocus();
        }
    }
}