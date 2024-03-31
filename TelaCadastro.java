package entities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaCadastro extends JFrame implements ActionListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtMarca, txtModelo, txtAno, txtCor, txtPlaca;
    private JButton btnCadastrar, btnDeletar;
    private JTable table;

    public TelaCadastro() {
        setTitle("Tela de Cadastro");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(7, 2));

        panel.add(new JLabel("Marca:"));
        txtMarca = new JTextField();
        panel.add(txtMarca);

        panel.add(new JLabel("Modelo:"));
        txtModelo = new JTextField();
        panel.add(txtModelo);

        panel.add(new JLabel("Ano:"));
        txtAno = new JTextField();
        panel.add(txtAno);

        panel.add(new JLabel("Cor:"));
        txtCor = new JTextField();
        panel.add(txtCor);

        panel.add(new JLabel("Placa:"));
        txtPlaca = new JTextField();
        panel.add(txtPlaca);

        btnCadastrar = new JButton("Cadastrar");
        btnDeletar = new JButton("Deletar");

        panel.add(btnCadastrar);
        panel.add(btnDeletar);

        String[] columnNames = {"Marca", "Modelo", "Ano", "Cor", "Placa"};
        Object[][] data = {};

        table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        panel.add(scrollPane);

        add(panel);

        btnCadastrar.addActionListener(this);
        btnDeletar.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCadastrar) {
            String marca = txtMarca.getText();
            String modelo = txtModelo.getText();
            String ano = txtAno.getText();
            String cor = txtCor.getText();
            String placa = txtPlaca.getText();

          
        } else if (e.getSource() == btnDeletar) {
            
        }
    }
}
