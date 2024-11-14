package ru.mirea.lab24;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextEditor extends JFrame {
    public TextDocument document;
    public JTextArea textArea;
    TextEditor() {
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("Файл");
        menuBar.add(file);
        JMenuItem newBtn = new JMenuItem("Новый");
        newBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                document = (TextDocument) new CreateTextDocument().createNew();
            }
        });
        textArea = new JTextArea();
        add(textArea);
        JMenuItem openBtn = new JMenuItem("Открыть");
        openBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser();
                int returnVal = fc.showOpenDialog(getParent());

                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = fc.getSelectedFile();
                    byte[] fileContent = null;
                    try {
                        fileContent = Files.readAllBytes(file.toPath());
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    document = (TextDocument) new CreateTextDocument().createOpen(file.getAbsolutePath(), file.getName(), fileContent);
                    readDocumentData();
                }
            }
        });
        JMenuItem saveBtn = new JMenuItem("Сохранить");
        saveBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser();
                int returnVal = fc.showSaveDialog(getParent());

                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = fc.getSelectedFile();
                    try {
                        Files.writeString(Path.of(file.getAbsolutePath()), textArea.getText());
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });
        JMenuItem exitBtn = new JMenuItem("Выйти");
        exitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        file.add(newBtn);
        file.add(openBtn);
        file.add(saveBtn);
        file.add(exitBtn);
        setJMenuBar(menuBar);
        pack();
        setVisible(true);
    }

    public void readDocumentData()
    {
        try {
            textArea.setText(new String(document.getData(), "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        new TextEditor();
    }
}
