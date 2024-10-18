package ru.mirea.lab12;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static int pictureIndex = 0;
    public static ArrayList<String> paths = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        paths.addAll(List.of(args));
        JFrame frame = new JFrame("My Second second GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);
        JPanel panel= new JPanel();
        JLabel picLabel = new JLabel();
        panel.add(picLabel);
        frame.getContentPane().add(panel, "South");
        Timer t=new Timer(1000,new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {

                if (!paths.isEmpty())
                {
                    if (pictureIndex >= paths.size()) pictureIndex = 0;
                    try
                    {
                        BufferedImage myPicture = ImageIO.read(new File(paths.get(pictureIndex)));
                        picLabel.setIcon(new ImageIcon(myPicture));
                        picLabel.setSize(200, 200);
                        pictureIndex++;
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }

        });
        t.setInitialDelay(200);
        t.start();
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
                    paths.add(String.valueOf(fileChooser.getSelectedFile()));
                }
            }
        });
        frame.add(btn, "North");
        frame.pack();
        frame.setVisible(true);

    }
}
