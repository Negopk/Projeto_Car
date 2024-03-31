package entities;
import javax.swing.*;
import java.awt.event.*;

public class TelaInicial extends JFrame implements ActionListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnCadastrar;
    private JButton btnListar;

    public TelaInicial() {
        setTitle("Tela Inicial");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        btnCadastrar = new JButton("Cadastrar Novo Carro");
        btnListar = new JButton("Listar Carros");

        JPanel panel = new JPanel();
        panel.add(btnCadastrar);
        panel.add(btnListar);

        add(panel);

        btnCadastrar.addActionListener(this);
        btnListar.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCadastrar) {
            TelaCadastro telaCadastro = new TelaCadastro();
            telaCadastro.setVisible(true);
        } else if (e.getSource() == btnListar) {
            TelaListagem telaListagem = new TelaListagem();
            telaListagem.setVisible(true);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                TelaInicial telaInicial = new TelaInicial();
                telaInicial.setVisible(true);
            }
        });
    }
}
