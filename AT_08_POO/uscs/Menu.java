package uscs;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.ParseException;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;


public class Menu extends JFrame {

    public static void main(String[] args) {
        Menu janelaPrincipal = new Menu();
        janelaPrincipal.setVisible(true);
    }

    public Menu() {
        setTitle("Janela Principal");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        int larguraBotao = 100;
        int alturaBotao = 30;
        int x = (getWidth() - larguraBotao) / 2; // Centraliza horizontalmente
        int y = (getHeight() - alturaBotao) / 2; // Posiciona no centro vertical

        JLabel titulo = new JLabel("MENU");
        titulo.setBounds(x+20, 10, larguraBotao, alturaBotao);
        add(titulo);

        JButton botaoRegistro = new JButton("Ficha de Registro ");
        botaoRegistro.setBounds(x-120, 50, 150, 30);
        add(botaoRegistro);

        JButton botaoCronometro = new JButton("Cronometro");
        botaoCronometro.setBounds(x+50, 50, 150, 30);
        add(botaoCronometro);

        

        botaoRegistro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                FichaRegistro outraJanela = new FichaRegistro();
                outraJanela.setVisible(true);
                dispose();

            }
        });

        botaoCronometro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                Cronometro outraJanela = new Cronometro();
                outraJanela.setVisible(true);
                dispose();

            }
        });


    }
}

class FichaRegistro extends JFrame{

    public FichaRegistro(){

        //criando a janela
        super("Ficha de Registro");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(550, 600);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        int larguraBotao = 100;
        int alturaBotao = 30;
        int x = (getWidth() - larguraBotao) / 2; // Centraliza horizontalmente
        int y = (getHeight() - alturaBotao) / 2; // Posiciona no centro vertical

        JLabel titulo = new JLabel("Ficha de Registro");
        titulo.setBounds(x, 10, larguraBotao+100, alturaBotao);
        add(titulo);

        JLabel nome = new JLabel("Insira seu nome: ");
        nome.setBounds(x-120, 50, larguraBotao, alturaBotao);
        add(nome);

        JTextField textFieldNome = new JTextField(30);
        textFieldNome.setBounds(x-20, 58, 200,20);
        add(textFieldNome);

        JLabel telefone = new JLabel("Insira seu numero de celular: ");
        telefone.setBounds(x-190, 80, larguraBotao+100, alturaBotao);
        add(telefone);

        JTextField textFieldCel = new JTextField(30);
        textFieldCel.setBounds(x-20, 88, 200,20);
        add(textFieldCel);

        JLabel enderco = new JLabel("Insira seu endereço: ");
        enderco.setBounds(x-140, 110, larguraBotao+100, alturaBotao);
        add(enderco);

        JTextField textFieldEndereco = new JTextField(30);
        textFieldEndereco.setBounds(x-20, 118, 200,20);
        add(textFieldEndereco);

        JLabel dataNasc = new JLabel("Insira sua data de nascimento: ");
        dataNasc.setBounds(x-200, 140, larguraBotao+100, alturaBotao);
        add(dataNasc);

        JTextField textField_dataNasc = new JTextField(30);
        textField_dataNasc.setBounds(x-20, 148, 200,20);
        add(textField_dataNasc);

        JButton botaoRegistrar = new JButton("Registrar");
        botaoRegistrar.setBounds(x-100, (y+200), larguraBotao, alturaBotao); // Define a posição e tamanho do botão
        add(botaoRegistrar);

        JButton botaoVoltar = new JButton("Voltar");
        botaoVoltar.setBounds(x+50, (y+200), larguraBotao, alturaBotao);
        add(botaoVoltar);

        class ButtonHandler implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == botaoRegistrar) {
            
                String nome = textFieldNome.getText();
                String celular = textFieldCel.getText();
                String endereco = textFieldEndereco.getText();
                String dataNasc = textField_dataNasc.getText();
                JOptionPane.showMessageDialog(null, "Nome: "+ nome +"\nCelular: " + celular + "\nEndereço: " + endereco + "\nData de Nascimento: " + dataNasc);
                    }

                else if (event.getSource() == botaoVoltar){
                
                    Menu outraJanela = new Menu();
                    outraJanela.setVisible(true);

                    dispose();
                    }
                }

            }

        ButtonHandler handler = new ButtonHandler();
        botaoRegistrar.addActionListener(handler);
        botaoVoltar.addActionListener(handler);
    }
}

class Cronometro extends JFrame {
    public JLabel label;
    public Timer timer;
    public int segundos;

    public Cronometro() {
        label = new JLabel("00:00:00");
        label.setFont(new Font("Arial", Font.BOLD, 50));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        JButton startButton = new JButton("Iniciar");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startTimer();
            }
        });

        JButton stopButton = new JButton("Parar");
        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stopTimer();
            }
        });

        JButton voltarButton = new JButton("Voltar");
        voltarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == voltarButton){
            
                    Menu outraJanela = new Menu();
                    outraJanela.setVisible(true);
        
                    dispose();
                }
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));
        panel.add(startButton);
        panel.add(stopButton);
        panel.add(voltarButton);

        add(label, BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);

        setTitle("Cronômetro");
        setSize(550, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public void startTimer() {
        segundos = 0;
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                segundos++;
                String tempoFormatado = formatarTempo(segundos);
                label.setText(tempoFormatado);
            }
        });
        timer.start();
    }

    public void stopTimer() {
        if (timer != null) {
            timer.stop();
        }
    }

    public String formatarTempo(int segundos) {
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = segundos % 60;

        DecimalFormat formato = new DecimalFormat("00");
        return formato.format(horas) + ":" + formato.format(minutos) + ":" + formato.format(segundosRestantes);
    }

    
}
