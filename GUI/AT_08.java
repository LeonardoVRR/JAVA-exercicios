package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AT_08 extends JFrame{

    public static void main(String[] args) {
        AT_08 janela = new AT_08();
        janela.setVisible(true);
    }

    public AT_08() {
        setTitle("Janela Principal");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JButton botaoAbrirOutraJanela = new JButton("Abrir Outra Janela");
        botaoAbrirOutraJanela.setBounds(100, 50, 150, 30);
        add(botaoAbrirOutraJanela);

        botaoAbrirOutraJanela.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OutraJanela outraJanela = new OutraJanela(AT_08.this);
                outraJanela.setVisible(true);
                setState(JFrame.ICONIFIED);
            }
        });
    }
    
}


class OutraJanela extends JFrame {

    private JFrame menu;

    public OutraJanela(JFrame menu) {
        this.menu = menu;

        setTitle("Outra Janela");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        JButton botaoVoltar = new JButton("Voltar");
        botaoVoltar.setBounds(75, 50, 200, 30);
        add(botaoVoltar);

        botaoVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu.setExtendedState(JFrame.NORMAL);
                dispose();
            }
        });
    }
}
