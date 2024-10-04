package ru.mirea.lab5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task1 {
    private static int milan = 0;
    private static int realMadrid = 0;

    private static JLabel result;
    private static JLabel lastScorer;
    private static JLabel winner;

    private static String lastScore;

    public static void UpdateText()
    {
        result.setText("Result: " + milan + " X " + realMadrid);
        lastScorer.setText("Last Scorer: " + lastScore);
        winner.setText("Winner: " + (realMadrid > milan ? "Real Madrid" : (milan > realMadrid ? "AC Milan": "DRAW")));
    }

    public static void main(String args[]) {
        JFrame frame = new JFrame("My Second second GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);
        JPanel panel= new JPanel();
        panel.setLayout(new GridLayout(3, 2, 15, 14));
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize( new Dimension(200,300));
        JButton button1 = new JButton("AC Milan");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milan += 1;
                lastScore = "AC Milan";
                UpdateText();
            }
        });
        JButton button2 = new JButton("Real Madrid");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realMadrid += 1;
                lastScore = "Real Madrid";
                UpdateText();
            }
        });
        panel.add(button1, BorderLayout.PAGE_START);
        panel.add(button2, BorderLayout.PAGE_START);
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize( new Dimension(200,300));
        result = new JLabel("Result: 0 X 0");
        panel.add(result, BorderLayout.CENTER);
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize( new Dimension(200,300));
        lastScorer = new JLabel("Last Scorer: N/A");
        panel.add(lastScorer, BorderLayout.PAGE_END);
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize( new Dimension(200,300));
        winner = new JLabel("Winner: DRAW");
        panel.add(winner, BorderLayout.PAGE_END);
        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);
        }
}
