package GUI;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class MinhaJanelaPrincipal extends JFrame {

    public static void main(String[] args) {
        MinhaJanelaPrincipal janelaPrincipal = new MinhaJanelaPrincipal();
        janelaPrincipal.setVisible(true);
    }

    public MinhaJanelaPrincipal() {
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

        JButton botaoCPF = new JButton("Verificador de CPF");
        botaoCPF.setBounds(x+50, 50, 150, 30);
        add(botaoCPF);

        

        botaoRegistro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                FichaRegistro outraJanela = new FichaRegistro();
                outraJanela.setVisible(true);
                dispose();

            }
        });

        botaoCPF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                ValidadeCPF outraJanela = new ValidadeCPF();
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
                
                    MinhaJanelaPrincipal outraJanela = new MinhaJanelaPrincipal();
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

class ValidadeCPF extends JFrame{
    ValidadeCPF(){
        super("Validador de CPF");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(550, 600);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        int larguraBotao = 100;
        int alturaBotao = 30;
        int x = (getWidth() - larguraBotao) / 2; // Centraliza horizontalmente
        int y = (getHeight() - alturaBotao) / 2; // Posiciona no centro vertical

        JLabel titulo = new JLabel("Validador de CPF");
        titulo.setBounds(x, 10, larguraBotao+100, alturaBotao);
        add(titulo);

        JLabel cpf = new JLabel("Insira os numeros do CPF: ");
        cpf.setBounds(x-155, 55, 155, 30);
        add(cpf);

        try {
            MaskFormatter mascaraCPF = new MaskFormatter("### ### ###-##"); 
            JFormattedTextField campoCPF = new JFormattedTextField(mascaraCPF);
            campoCPF.setColumns(10); // Define o tamanho do campo de texto
            campoCPF.setBounds(x, 60, 100, 20);
            add(campoCPF);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    
}