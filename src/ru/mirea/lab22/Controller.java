package ru.mirea.lab22;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private Model model;
    private View view;

    Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        SetupBtnsLogic();
    }

    private void SetupBtnsLogic()
    {
        JButton[] numBtns = view.getNumBtns();
        for (int i = 0;i<numBtns.length;i++)
        {
            numBtns[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    model.expression += e.getActionCommand();
                    view.strTxt.setText(model.expression);
                }
            });
        }
        view.clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.expression = "";
                view.strTxt.setText("0");
            }
        });
        view.evalBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    Double res = RpnCalculator.evaulate(model.expression);
                    model.expression = res.toString();
                    view.strTxt.setText(model.expression);
                }
                catch (Exception err)
                {
                    model.expression = "";
                    view.strTxt.setText("Error");
                }
            }
        });
        view.spaceBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.expression += " ";
                view.strTxt.setText(model.expression);
            }
        });
    }
}
