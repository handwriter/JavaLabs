package ru.mirea.lab5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("My Second second GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);
        JPanel panel= new JPanel();
        if (args.length > 0)
        {
            try
            {
                BufferedImage myPicture = ImageIO.read(new File(args[0]));
                JLabel picLabel = new JLabel(new ImageIcon(myPicture));
                panel.add(picLabel);
                frame.getContentPane().add(panel);

                frame.pack();
                frame.setVisible(true);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
