package ru.mirea.lab16;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Task2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        JLabel northLabel = new JLabel("Север", SwingConstants.CENTER);
        JLabel southLabel = new JLabel("Юг", SwingConstants.CENTER);
        JLabel eastLabel = new JLabel("Восток", SwingConstants.CENTER);
        JLabel westLabel = new JLabel("Запад", SwingConstants.CENTER);
        JLabel centerLabel = new JLabel("Центр", SwingConstants.CENTER);
        frame.add(northLabel, BorderLayout.NORTH);
        frame.add(southLabel, BorderLayout.SOUTH);
        frame.add(eastLabel, BorderLayout.EAST);
        frame.add(westLabel, BorderLayout.WEST);
        frame.add(centerLabel, BorderLayout.CENTER);
        northLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(frame, "Добро пожаловать в САО");
            }
        });
        southLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(frame, "Добро пожаловать в ЮАО");
            }
        });
        eastLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(frame, "Добро пожаловать в ВАО");
            }
        });
        westLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(frame, "Добро пожаловать в ЗАО");
            }
        });
        centerLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(frame, "Добро пожаловать в ЦАО");
            }
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
