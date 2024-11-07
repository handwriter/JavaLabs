package ru.mirea.lab22;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, divBtn, multiplyBtn, addBtn, subtractBtn, evalBtn, clearBtn, pointBtn, spaceBtn;
    JLabel strTxt;
    View() {
        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.5;
        constraints.gridy = 0;
        b1 = new JButton("1");
        constraints.gridx = 0;
        constraints.gridy = 3;
        add(b1, constraints);
        b2 = new JButton("2");
        constraints.gridx = 1;
        constraints.gridy = 3;
        add(b2, constraints);
        b3 = new JButton("3");
        constraints.gridx = 2;
        constraints.gridy = 3;
        add(b3, constraints);
        b4 = new JButton("4");
        constraints.gridx = 0;
        constraints.gridy = 4;
        add(b4, constraints);
        b5 = new JButton("5");
        constraints.gridx = 1;
        constraints.gridy = 4;
        add(b5, constraints);
        b6 = new JButton("6");
        constraints.gridx = 2;
        constraints.gridy = 4;
        add(b6, constraints);
        b7 = new JButton("7");
        constraints.gridx = 0;
        constraints.gridy = 5;
        add(b7, constraints);
        b8 = new JButton("8");
        constraints.gridx = 1;
        constraints.gridy = 5;
        add(b8, constraints);
        b9 = new JButton("9");
        constraints.gridx = 2;
        constraints.gridy = 5;
        add(b9, constraints);
        b0 = new JButton("0");
        constraints.gridx = 0;
        constraints.gridy = 6;
        add(b0, constraints);
        divBtn = new JButton("/");
        constraints.gridx = 3;
        constraints.gridy = 3;
        add(divBtn, constraints);
        multiplyBtn = new JButton("*");
        constraints.gridx = 3;
        constraints.gridy = 4;
        add(multiplyBtn, constraints);
        addBtn = new JButton("+");
        constraints.gridx = 3;
        constraints.gridy = 5;
        add(addBtn, constraints);
        subtractBtn = new JButton("-");
        constraints.gridx = 2;
        constraints.gridy = 6;
        add(subtractBtn, constraints);
        evalBtn = new JButton("=");
        constraints.gridx = 3;
        constraints.gridy = 6;
        add(evalBtn, constraints);
        clearBtn = new JButton("c");
        constraints.gridx = 3;
        constraints.gridy = 2;
        add(clearBtn, constraints);
        spaceBtn = new JButton("Space");
        constraints.gridx = 2;
        constraints.gridy = 2;
        add(spaceBtn, constraints);
        strTxt = new JLabel("0");
        constraints.gridwidth = 4;
        strTxt.setVerticalAlignment(SwingConstants.TOP);
        strTxt.setHorizontalAlignment(SwingConstants.RIGHT);
        constraints.gridx = 1;
        constraints.gridy = 0;
        add(strTxt, constraints);
        pointBtn = new JButton(".");
        constraints.gridwidth = 1;
        constraints.gridx = 1;
        constraints.gridy = 6;
        add(pointBtn, constraints);
        setSize(220, 180);
    }

    public JButton[] getNumBtns()
    {
        return new JButton[] { b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, divBtn, multiplyBtn, addBtn, subtractBtn, pointBtn };
    }
}
