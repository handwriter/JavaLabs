package ru.mirea.lab12;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.*;
public class Task2 {
    private static JLabel label;

    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("My Second second GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);
        JPanel panel= new JPanel();
        if (args.length > 0)
        {
            try
            {
                label = new JLabel();
                TryLoadImage(args[0]);
                panel.add(label);
                frame.getContentPane().add(panel, "South");
                JButton btn = new JButton("Открыть изображение");
                btn.setSize(50, 10);
                btn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFileChooser fileChooser = new JFileChooser();
                        fileChooser.setDialogTitle("Выбор файла");
                        // Определение режима - только каталог
                        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                        int result = fileChooser.showOpenDialog(panel);
                        // Если директория выбрана, покажем ее в сообщении
                        if (result == JFileChooser.APPROVE_OPTION ) {
                            try {
                                TryLoadImage(String.valueOf(fileChooser.getSelectedFile()));
                            } catch (IOException ex) {
                                System.out.println(ex);
                            }
                        }
                    }
                });
                frame.add(btn, "North");
                frame.pack();
                frame.setVisible(true);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    private static void TryLoadImage(String filepath) throws IOException {
        BufferedImage myPicture = ImageIO.read(new File(filepath));
        label.setIcon(new ImageIcon(myPicture));
    }
}
