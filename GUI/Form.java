package GUI;

import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Form extends JFrame{

    public static void main(String[] args) {
        Form janela = new Form();
        janela.setVisible(true);
    }

    public Form(){
        //criando a janela
        super("ATIVIDADE 08 - POO");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        //this.setVisible(true);

        int larguraBotao = 100;
        int alturaBotao = 30;
        int x = (getWidth() - larguraBotao) / 2; // Centraliza horizontalmente
        int y = (getHeight() - alturaBotao) / 2; // Posiciona no centro vertical

        
        JLabel titulo = new JLabel("Registro de Funcionário");
        titulo.setBounds(x, 10, larguraBotao+100, alturaBotao);

        Font fonte = new Font("Arial", Font.BOLD, 16); // Cria uma nova instância de Font com estilo "Negrito" (bold) e tamanho 16
        titulo.setFont(fonte);
        add(titulo);

        //Adicionando TextBox

        JLabel nome = new JLabel("Insira seu nome: ");
        nome.setBounds(50, 50, larguraBotao, alturaBotao);
        add(nome);

        JTextField textFieldNome = new JTextField(30);
        textFieldNome.setBounds(160, 55, 200,20);
        add(textFieldNome);

        
        //Adicionando os Botões de opção

        JLabel sexo = new JLabel("Genero: ");
        sexo.setBounds(50, 135, larguraBotao, alturaBotao);
        add(sexo);

        JRadioButton t1 = new JRadioButton("Masculino", false);
        t1.setBounds(50, 155, larguraBotao, alturaBotao);
        add(t1);

        JRadioButton t2 = new JRadioButton("Feminino", false);
        t2.setBounds(160, 155, larguraBotao, alturaBotao);
        add(t2);

        ButtonGroup group = new ButtonGroup();
        group.add(t1);
        group.add(t2);
        
        //Adicionando os Botões ComboBox

        JLabel estadoNasc = new JLabel("Nascido no estado: ");
        estadoNasc.setBounds(300, 135, larguraBotao+100, alturaBotao);
        add(estadoNasc);

        JComboBox<String> estado = new JComboBox<>();
        estado.addItem("Acre (AC)");
        estado.addItem("Alagoas (AL)");
        estado.addItem("Amapá (AP)");
        estado.addItem("Amazonas (AM)");
        estado.addItem("Bahia (BA)");
        estado.addItem("Ceará (CE)");
        estado.addItem("Distrito Federal (DF)");
        estado.addItem("Espírito Santo (ES)");
        estado.addItem("Goiás (GO)");
        estado.addItem("Maranhão (MA)");
        estado.addItem("Mato Grosso (MT)");
        estado.addItem("Mato Grosso do Sul (MS)");
        estado.addItem("Minas Gerais (MG)");
        estado.addItem("Pará (PA)");
        estado.addItem("Paraíba (PB)");
        estado.addItem("Paraná (PR)");
        estado.addItem("Pernambuco (PE)");
        estado.addItem("Piauí (PI)");
        estado.addItem("Rio de Janeiro (RJ)");
        estado.addItem("Rio Grande do Norte (RN)");
        estado.addItem("Rio Grande do Sul (RS)");
        estado.addItem("Rondônia (RO)");
        estado.addItem("Roraima (RR)");
        estado.addItem("Santa Catarina (SC)");
        estado.addItem("São Paulo (SP)");
        estado.addItem("Sergipe (SE)");
        estado.addItem("Tocantins (TO)");
        estado.setBounds(300, 165, larguraBotao+50, alturaBotao);
        add(estado);

        //Adicionando campo formatado p/ colocar o numero de Cel.

        JLabel cel = new JLabel("Numero de Celular: ");
        cel.setBounds(500, 135, (larguraBotao+100), alturaBotao);
        add(cel);

        try {
            MaskFormatter mascaraData = new MaskFormatter("+## ## ####-####"); // Define a máscara de formato de data
            JFormattedTextField campoData = new JFormattedTextField(mascaraData);
            campoData.setColumns(10); // Define o tamanho do campo de texto
            campoData.setBounds(500, 165, 110, 20);
            add(campoData);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //Adicionando os Botões CheckBox

        JLabel materia = new JLabel("Idiomas que fala com fluencia: ");
        materia.setBounds(50, 80, (larguraBotao+100), alturaBotao);
        add(materia);

        // CheckBox

        JCheckBox t11 = new JCheckBox("Mandarim");
        t11.setBounds(60, 105, larguraBotao, alturaBotao);
        add(t11);
        

        JCheckBox t21 = new JCheckBox("Japones");
        t21.setBounds(160, 105, larguraBotao, alturaBotao);
        add(t21);
        

        JCheckBox t3 = new JCheckBox("Espanhol");
        t3.setBounds(260, 105, larguraBotao, alturaBotao);
        add(t3);
        

        JCheckBox t4 = new JCheckBox("Francês");
        t4.setBounds(360, 105, larguraBotao, alturaBotao);
        add(t4);
        

        JCheckBox t5 = new JCheckBox("Ingles");
        t5.setBounds(460, 105, larguraBotao, alturaBotao);
        add(t5);
        

        //Adicionando os Botões de clicar

        JButton botaoRegistrar = new JButton("Registrar");
        botaoRegistrar.setBounds(x, (y+200), larguraBotao, alturaBotao); // Define a posição e tamanho do botão
        add(botaoRegistrar);

        //inserindo evento aos botões

        class ButtonHandler implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == botaoRegistrar) {
            
                String nome = textFieldNome.getText();
                JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nLinguas com Fluencia:");
                    }
                }

            }
            
            List<JCheckBox> listaOpcoes;
            listaOpcoes = new ArrayList<>();

            listaOpcoes.add(t11);
            listaOpcoes.add(t21);
            listaOpcoes.add(t3);
            listaOpcoes.add(t4);
            listaOpcoes.add(t5);

            t11.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    if (t11.isSelected()) {
                        String itemSelecionado = ((JCheckBox) e.getSource()).getText();
                        JOptionPane.showMessageDialog(null, "Linguas com Fluencia: " + itemSelecionado);
                        
                    }
                }
            });

            t21.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    if (t21.isSelected()) {
                        String itemSelecionado = ((JCheckBox) e.getSource()).getText();
                        JOptionPane.showMessageDialog(null, "Linguas com Fluencia: " + itemSelecionado);
                    }
                }
            });

        

            ButtonHandler handler = new ButtonHandler();
            botaoRegistrar.addActionListener(handler);
    }
}
