package ru.mirea.lab16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task1 extends JFrame {
    static int counter = 0;
    static String value;
    Task1() {
        JLabel label = new JLabel("Введите предполагаемое значение (0-20):");
        JTextField textField = new JTextField();
        JButton btn = new JButton("Проверить");
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        value = String.valueOf((int)(Math.random() * 20));
        System.out.println(value);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter += 1;
                if (textField.getText().trim().equals(value.trim()))
                {
                    JOptionPane.showMessageDialog(null, "Верно");
                    dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Неверно");
                }
                if (counter == 3) dispose();
            }
        });
        getContentPane().add(label, "");
        getContentPane().add(textField);
        getContentPane().add(btn);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Task1();
    }
}
