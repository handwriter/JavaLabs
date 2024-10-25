package ru.mirea.lab19;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.constant.DynamicCallSiteDesc;
import java.util.ArrayList;

public class LabClassUI extends JFrame {

    public static void PrintArray(JTextArea textField, ArrayList<Comparable> students)
    {
        String str = "";
        for (int i = 0; i < students.size(); ++i)
        {
            str += students.get(i).toString() + "\n";
        }

        textField.setText(str);
    }

    public LabClassUI() {
        LabClass cls = new LabClass();
        JTextArea textField = new JTextArea();
        textField.setEditable(false);
        PrintArray(textField, cls.students);
        JButton btn = new JButton("Сортировать");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int left = 0; left < cls.students.size(); left++) {
                    Student value = (Student) cls.students.get(left);
                    int i = left - 1;
                    for (; i >= 0; i--) {
                        if (value.compareTo((Student) cls.students.get(i)) < 0) {
                            cls.students.set(i + 1, cls.students.get(i));
                        } else {
                            break;
                        }
                    }
                    cls.students.set(i + 1, value);
                    PrintArray(textField, cls.students);
                }
            }
        });
        JLabel label = new JLabel("ФИО:");
        JTextField fio = new JTextField();
        JButton search = new JButton("Найти");
        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Student std = cls.findByName(fio.getText());
                    textField.setText(std.toString());
                } catch (EmptyStringExeption | StudentNotFoundExeption ex) {
                    System.out.println(ex);
                }
            }
        });
        getContentPane().add(btn, "North");
        getContentPane().add(label, "West");
        getContentPane().add(fio, "Center");
        getContentPane().add(search, "East");
        getContentPane().add(textField, "South");
        pack();
        setVisible(true);
    }
}
