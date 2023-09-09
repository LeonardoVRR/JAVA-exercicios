package GUI;
/* 
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class MinhaJanela extends JFrame {

    public static void main(String[] args) {
        MinhaJanela janela = new MinhaJanela();
        janela.setVisible(true);
    }

    public MinhaJanela() {
        setTitle("Minha Janela");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        try {
            MaskFormatter mascaraData = new MaskFormatter("+## ## ####-####"); // Define a máscara de formato de data
            JFormattedTextField campoData = new JFormattedTextField(mascaraData);
            campoData.setColumns(10); // Define o tamanho do campo de texto
            campoData.setBounds(50, 50, 110, 20);
            add(campoData);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
*/


import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinhaJanela extends JFrame {

    private static MinhaJanela instancia;

    public static void main(String[] args) {
        instancia = new MinhaJanela();
        instancia.setVisible(true);
    }

    public static MinhaJanela getInstancia() {
        return instancia;
    }

    public MinhaJanela() {
        setTitle("Minha Janela");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JButton botaoAbrirJanela = new JButton("Abrir Janela");
        botaoAbrirJanela.setBounds(100, 50, 100, 30);
        add(botaoAbrirJanela);

        botaoAbrirJanela.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OutraJanela outraJanela = new OutraJanela();
                outraJanela.setVisible(true);
            }
        });
    }
}

class OutraJanela extends JFrame {

    public OutraJanela() {
        setTitle("Outra Janela");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JButton botaoVoltar = new JButton("Voltar");
        botaoVoltar.setBounds(100, 50, 100, 30);
        add(botaoVoltar);

        botaoVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MinhaJanela.getInstancia().setVisible(true);
            }
        });
    }
}
