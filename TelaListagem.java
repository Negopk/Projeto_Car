package entities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaListagem extends JFrame {
   
	private static final long serialVersionUID = 1L;
	private JTable table;
    private JButton btnAlterarDisponibilidade;

    public TelaListagem() {
        setTitle("Tela de Listagem");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());

        String[] columnNames = {"Marca", "Modelo", "Ano", "Cor", "Placa", "Disponibilidade"};
        Object[][] data = {
            {"Toyota", "Corolla", "2020", "Prata", "ABC-1234", "Disponível"},
            {"Honda", "Civic", "2019", "Preto", "DEF-5678", "Indisponível"},
            {"Volkswagen", "Golf GTI","2013", "Branco Burgues", "DGI-9101", "Disponivel"}
        };

        table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setEnabled(false);
        panel.add(scrollPane, BorderLayout.CENTER);

        btnAlterarDisponibilidade = new JButton("Alterar Disponibilidade");
        panel.add(btnAlterarDisponibilidade, BorderLayout.SOUTH);

        add(panel);

        btnAlterarDisponibilidade.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    String disponibilidade = (String) table.getValueAt(selectedRow, 5);
                    if (disponibilidade.equals("Disponível")) {
                        table.setValueAt("Indisponível", selectedRow, 5);
                    } else {
                        table.setValueAt("Disponível", selectedRow, 5);
                    }
                }
            }
        });
    }
}
