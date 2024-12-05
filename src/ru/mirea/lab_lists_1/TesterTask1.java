package ru.mirea.lab_lists_1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TesterTask1 extends JFrame {
    private StudentsGroup currentGroup;
    private static TesterTask1 inst;
    public TesterTask1() {
        inst = this;
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Список");
        JMenuItem item = new JMenuItem("Создать пустой");
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentGroup = new StudentsGroup();
            }
        });
        menu.add(item);
        item = new JMenuItem("Добавить элемент");
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var name = JOptionPane.showInputDialog("Имя студента:");
                var age = JOptionPane.showInputDialog("Возраст студента:");
                try {
                    currentGroup.add(new Student(name, Integer.parseInt(age)));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(inst, ex.toString());
                }
            }
        });
        menu.add(item);
        item = new JMenuItem("Удалить элемент");
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var index = JOptionPane.showInputDialog("Индекс элемента:");
                try {
                    currentGroup.removeAt(Integer.parseInt(index));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(inst, ex.toString());
                }
            }
        });
        menu.add(item);
        item = new JMenuItem("Вывести элемент");
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var index = JOptionPane.showInputDialog("Индекс элемента:");
                try {
                    String message = currentGroup.printElem(Integer.parseInt(index));
                    JOptionPane.showMessageDialog(inst, message);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(inst, ex.toString());
                }
            }
        });
        menu.add(item);
        item = new JMenuItem("Очитстить список");
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentGroup.clear();
                JOptionPane.showMessageDialog(inst, "Список очищен");
            }
        });
        menu.add(item);
        item = new JMenuItem("Проверить на пустоту");
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentGroup.isEmpty()) {
                    JOptionPane.showMessageDialog(inst, "Список пустой");
                } else {
                    JOptionPane.showMessageDialog(inst, "Список не пустой");
                }
            }
        });
        menu.add(item);
        menuBar.add(menu);
        setJMenuBar(menuBar);
        currentGroup = new StudentsGroup();
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new TesterTask1();
    }
}
