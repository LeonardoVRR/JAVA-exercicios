package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Cronometro extends JFrame {
    private JLabel label;
    private Timer timer;
    private int segundos;

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
                dispose();
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

    private void startTimer() {
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

    private void stopTimer() {
        if (timer != null) {
            timer.stop();
        }
    }

    private String formatarTempo(int segundos) {
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = segundos % 60;

        DecimalFormat formato = new DecimalFormat("00");
        return formato.format(horas) + ":" + formato.format(minutos) + ":" + formato.format(segundosRestantes);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Cronometro().setVisible(true);
            }
        });
    }
}




