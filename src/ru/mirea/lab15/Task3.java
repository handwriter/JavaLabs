package ru.mirea.lab15;

import javax.swing.*;
import java.awt.*;

public class Task3 extends JFrame {
    Task3() {
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("Файл");
        JMenuItem save = new JMenuItem("Сохранить");
        JMenuItem exit = new JMenuItem("Выйти");
        file.add(save);
        file.add(exit);
        menuBar.add(file);
        JMenu edit = new JMenu("Редактировать");
        JMenuItem copy = new JMenuItem("Копировать");
        JMenuItem cut = new JMenuItem("Вырезать");
        JMenuItem paste = new JMenuItem("Вставить");
        edit.add(copy);
        edit.add(cut);
        edit.add(paste);
        menuBar.add(edit);
        menuBar.add(new JMenuItem("Справка"));
        add(menuBar, "North");
        JPanel grid = new JPanel();
        grid.add(new JButton("Button 1"), "West");
        grid.add(new JButton("Button 2"), "East");
        getContentPane().add(grid);
        getContentPane().add(new JTextArea(), "South");
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Task3();
    }
}
