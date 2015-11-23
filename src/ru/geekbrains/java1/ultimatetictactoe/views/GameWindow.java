package ru.geekbrains.java1.ultimatetictactoe.views;

import ru.geekbrains.java1.ultimatetictactoe.controllers.GameWindowController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GameWindow extends JFrame {
    JPanel jPanel = new JPanel();
    JButton[][] buttons = new JButton[3][3];

    public void init() {
        setSize(700, 400);
        setTitle("КРЕСТИКИ - НОЛИКИ");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //setLayout(new BorderLayout());
        jPanel.setLayout(new FlowLayout()); //работает по умолчанию

        jPanel.setLayout(new GridLayout(3, 3));

        /*JButton jButton = new JButton("Hello!");
        add(jButton, BorderLayout.NORTH);

        JButton jButton2 = new JButton("Bye!");
        add(jButton2, BorderLayout.CENTER);

        add(new JButton("SOUTH"), BorderLayout.SOUTH);
        add(new JButton("EAST"), BorderLayout.EAST);
        add(new JButton("WEST"), BorderLayout.WEST);*/

        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                JButton jButton = new JButton();
                jButton.setText(j % 2 == 0 ? "X" : "0");
                buttons[i][j] = jButton;
                jPanel.add(jButton);

                /*ActionListener actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Кликнули");
                    }
                };
                jButton.addActionListener(actionListener);*/

                final int finalJ = j;
                final int finalI = i;
                jButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String buttonText = e.getActionCommand();
                        System.out.printf("Button: %s, X: %d, Y: %d \n", buttonText, finalJ, finalI);
                        GameWindowController.doShoot(new Point(finalJ, finalI));
                    }
                });
            }
        }

        add(jPanel);

        JPanel jPanelSouth = new JPanel();
        jPanelSouth.add(new JButton("RESTART"));
        jPanelSouth.add(new JButton("NEW GAME"));

        add(jPanelSouth, BorderLayout.NORTH);

        setVisible(true);

    }
}
