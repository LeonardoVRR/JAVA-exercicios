package Testes;

import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class JFrame_01 extends JFrame{

    JFrame_01(){
        //criando a janela
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setTitle("ATIVIDADE 08 - POO");
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout(ERROR, ALLBITS, ABORT));

        this.setVisible(true);
    }


    public static void main(String[] args) {
        JFrame_01 app = new JFrame_01();
        
        }
}