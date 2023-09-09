package Testes;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Main extends JFrame {

    
    
    public static void main(String[] args)
    {
        JFrame frame = new JFrame(); // creating instance of JFrame

        JLabel nome = new JLabel("Insira seu nome: ");
        nome.setBounds(50, 10, 220,50);
        frame.add(nome);

        JTextField textFieldNome = new JTextField(30);
        textFieldNome.setBounds(160, 27, 200,20);
        frame.add(textFieldNome);
 
        //JButton button = new JButton(" GFG WebSite Click"); // creating instance of JButton
        //button.setBounds(160, 10, 100,50); // x axis, y axis, width, height
        //frame.add(button); // adding button in JFrame

        JLabel materia = new JLabel("Marque suas materias favoritas: ");
        materia.setBounds(50, 50, 220,50);
        frame.add(materia);
        
        // CheckBox
        JCheckBox t1 = new JCheckBox("Portugues");
        t1.setBounds(60, 85, 100,20);
        frame.add(t1);

        JCheckBox t2 = new JCheckBox("Matematica");
        t2.setBounds(160, 85, 100, 20);
        frame.add(t2);

        JCheckBox t3 = new JCheckBox("Historia");
        t3.setBounds(260, 85, 100, 20);
        frame.add(t3);

        JCheckBox t4 = new JCheckBox("Geografia");
        t4.setBounds(360, 85, 100, 20);
        frame.add(t4);

        JCheckBox t5 = new JCheckBox("Ingles");
        t5.setBounds(460, 85, 100, 20);
        frame.add(t5);

        //Radio Buttons

        JLabel sexo = new JLabel("Sexo: ");
        sexo.setBounds(50, 100, 220,50);
        frame.add(sexo);

        JRadioButton b1 = new JRadioButton("Masculino", false);
        b1.setBounds(50, 135, 220, 20);
        frame.add(b1);
        

        JRadioButton b2 = new JRadioButton("Feminino", false);
        b2.setBounds(70, 135, 220, 20);
        frame.add(b2);
        

        // definindo tamanho da tela
        frame.setSize(800,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
 
        
        frame.setLayout(null); // using no layout managers
        frame.setVisible(true); // making the frame visible
    }
}