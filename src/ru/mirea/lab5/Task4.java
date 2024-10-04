package ru.mirea.lab5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Task4 {
    public static int pictureIndex = 0;

    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("My Second second GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);
        JPanel panel= new JPanel();
        JLabel picLabel = new JLabel();
        panel.add(picLabel);
        frame.getContentPane().add(panel);
        Timer t=new Timer(1000,new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {

                if (args.length > 0)
                {
                    if (pictureIndex >= args.length) pictureIndex = 0;
                    System.out.println(pictureIndex);
                    try
                    {
                        BufferedImage myPicture = ImageIO.read(new File(args[pictureIndex]));
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
        frame.pack();
        frame.setVisible(true);

    }
}
