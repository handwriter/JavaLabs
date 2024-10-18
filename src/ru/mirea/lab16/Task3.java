package ru.mirea.lab16;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Editor");
        frame.setSize(500, 400);

        JTextArea textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        textArea.setForeground(Color.BLACK);
        frame.add(textArea, BorderLayout.CENTER);
        JMenuBar menuBar = new JMenuBar();
        JMenu colorMenu = new JMenu("Цвет");
        JMenuItem blueItem = new JMenuItem("Синий");
        JMenuItem redItem = new JMenuItem("Красный");
        JMenuItem blackItem = new JMenuItem("Черный");
        blueItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLUE);
            }
        });
        redItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.RED);
            }
        });
        blackItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLACK);
            }
        });
        colorMenu.add(blueItem);
        colorMenu.add(redItem);
        colorMenu.add(blackItem);
        JMenu fontMenu = new JMenu("Шрифт");
        JMenuItem timesNewRomanItem = new JMenuItem("Times New Roman");
        JMenuItem msSansSerifItem = new JMenuItem("MS Sans Serif");
        JMenuItem courierNewItem = new JMenuItem("Courier New");
        timesNewRomanItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("Times New Roman", Font.PLAIN, 16));
            }
        });
        msSansSerifItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 16));
            }
        });
        courierNewItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("Courier New", Font.PLAIN, 16));
            }
        });
        fontMenu.add(timesNewRomanItem);
        fontMenu.add(msSansSerifItem);
        fontMenu.add(courierNewItem);
        menuBar.add(colorMenu);
        menuBar.add(fontMenu);
        frame.add(menuBar, "North");
        frame.setVisible(true);
    }
}
