package ru.geekbrains.java1.ultimatetictactoe.views;

import ru.geekbrains.java1.ultimatetictactoe.controllers.GameWindowController;
import ru.geekbrains.java1.ultimatetictactoe.model.Field;
import ru.geekbrains.java1.ultimatetictactoe.model.Point;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GameWindow extends JFrame {
    JPanel jPanel = new JPanel();
    JButton[][] buttons = new JButton[Field.getFieldSize()][Field.getFieldSize()];

    public void init() {
        setSize(400, 400);
        setTitle("КРЕСТИКИ - НОЛИКИ");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel.setLayout(new GridLayout(Field.getFieldSize(), Field.getFieldSize()));

        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                JButton jButton = new JButton();
                jButton.setText(" ");
                buttons[i][j] = jButton;
                jPanel.add(jButton);

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


        JPanel jPanelNorth = new JPanel();
        JButton newGameButton = new JButton("NEW GAME");
        newGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GameWindowController.startNewGame();
            }
        });
        jPanelNorth.add(newGameButton);

        JPanel jPanelSouth = new JPanel();
        JLabel infoText = new JLabel("GJBYN");
        jPanelSouth.add(infoText);
        add(jPanelSouth, BorderLayout.SOUTH);

        JButton restartButton = new JButton("RESTART");
        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GameWindowController.restartGame();
            }
        });
        jPanelNorth.add(restartButton);
        add(jPanelNorth, BorderLayout.NORTH);
        setVisible(true);

    }
}
