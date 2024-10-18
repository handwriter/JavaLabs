package ru.mirea.lab15;

import ru.mirea.lab14.Task1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;

public class Task2 extends JFrame {
    JComboBox<String> comboBox;
    JLabel label = new JLabel();
    String[] countriesNames = new String[4];
    String[] countriesDescriptions = new String[4];
    Task2() {
        super("Example");
        countriesNames[0] = "Australia";
        countriesDescriptions[0] = "Государство в Южном полушарии, занимающее одноимённый материк, остров Тасмания и несколько других островов Индийского и Тихого океанов";
        countriesNames[1] = "China";
        countriesDescriptions[1] = "Китай (официальное название — Китайская Народная Республика, сокращённо — КНР) — государство в Восточной Азии.";
        countriesNames[2] = "England";
        countriesDescriptions[2] = "Страна в составе Соединённого Королевства. Население Англии составляет 84 % от общего числа населения Великобритании. Столица — Лондон, крупнейший город Великобритании.";
        countriesNames[3] = "Russia";
        countriesDescriptions[3] = "Росси́я (Российская Федерация) — государство в Восточной Европе и в Северной Азии (занимает их большую часть)";
        comboBox = new JComboBox<>(countriesNames);
        getContentPane().add(comboBox, "North");
        getContentPane().add(label, "South");
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(countriesDescriptions[comboBox.getSelectedIndex()]);
            }
        });
        pack();
        setSize(800, 800);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Task2();
    }
}
