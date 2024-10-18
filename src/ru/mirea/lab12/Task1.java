package ru.mirea.lab12;
import javax.swing.*;
import java.awt.*;

public class Task1 extends JPanel {
    private Shape[] shapes = new Shape[0];

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.add(new Task1());
        f.setSize(600, 600);
        f.setVisible(true);
    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        if (shapes.length == 0)
        {
            shapes = new Shape[20];
            for (int i = 0;i<20;i++)
            {
                double r = Math.random();
                double g = Math.random();
                double b = Math.random();
                Color randomColor = new Color((float)r, (float)g, (float)b);
                if (Math.random() > 0.5)
                {
                    shapes[i] = new Circle(randomColor, (int) (Math.random()*getWidth()), (int) (Math.random()*getHeight()), (int) (Math.random()*10));
                }
                else
                {
                    shapes[i] = new Rectangle(randomColor, (int) (Math.random()*getWidth()), (int) (Math.random()*getHeight()), (int) (Math.random()*10), (int) (Math.random()*10));
                }
            }
        }
        for (int i = 0;i<shapes.length;i++)
        {
            shapes[i].draw(gr);
        }
    }
}
