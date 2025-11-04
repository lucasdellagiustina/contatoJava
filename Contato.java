package aulalayout;

import java.awt.*;
import javax.swing.*;

public class Contato extends JFrame {
    public Contato() {
        setTitle("Contato");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setupLayout();
        setVisible(true);
    }
    private void setupLayout() {
        setLayout(new BorderLayout(2, 2));
        add(new JLabel("Sistema de Controle Acadêmico"), BorderLayout.SOUTH);
        JPanel toolbar = new JPanel();
        toolbar.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));
        add(toolbar, BorderLayout.NORTH);
        toolbar.add(new JButton("|<"));
        toolbar.add(new JButton("<"));
        toolbar.add(new JButton(">"));
        toolbar.add(new JButton(">|"));
        toolbar.add(new JButton("+"));
        toolbar.add(new JButton("-"));
        toolbar.add(new JButton("edit"));
        toolbar.add(new JButton("save"));
        toolbar.add(new JButton("cancel"));
        JPanel ads = new JPanel();
        ads.setLayout(new GridLayout(3, 1, 2, 2));
        ads.add(new JButton("Compre"));
        ads.add(new JButton("Agora"));
        ads.add(new JButton("na Amazon.com"));
        add(ads, BorderLayout.EAST);
        JPanel form = new JPanel();
        add(form, BorderLayout.CENTER);
        form.setLayout(new BorderLayout(2, 2));
        JPanel buttons = new JPanel();
        buttons.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));
        buttons.add(new JButton("Imprimir"));
        buttons.add(new JButton("Sair"));
        form.add(buttons, BorderLayout.SOUTH);
        RowPanel rowPanel = new RowPanel();
        rowPanel.init(5);
        rowPanel.addRow(new JLabel("Nome"), new JTextField(30));
        rowPanel.addRow(
            new JLabel("Telefone"),
            new JTextField(15),
            new JLabel("Idade"),
            new JTextField(10)
        );
        form.add(rowPanel, BorderLayout.CENTER);
    }
}
