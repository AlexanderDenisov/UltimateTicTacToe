package ru.geekbrains.java1.ultimatetictactoe.views;

import ru.geekbrains.java1.ultimatetictactoe.controllers.GameWindowController;
import ru.geekbrains.java1.ultimatetictactoe.model.Field;
import ru.geekbrains.java1.ultimatetictactoe.model.Point;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GameWindow extends JFrame {
    private GameWindowController controller;
    private JPanel jPanel;
    private static JButton[][] buttons;
    private JButton jButton;

    public GameWindow() {
    }


    public GameWindow(GameWindowController controller) {
        this.controller = controller;
        jPanel = new JPanel();
        buttons = new JButton[Field.getFieldSize()][Field.getFieldSize()];
    }

    public void init() {
        setSize(400, 400);
        setTitle("КРЕСТИКИ - НОЛИКИ");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel.setLayout(new GridLayout(Field.getFieldSize(), Field.getFieldSize()));

        JPanel jPanelSouth = new JPanel();
        JLabel infoText = new JLabel("Старт!");
        jPanelSouth.add(infoText);
        add(jPanelSouth, BorderLayout.SOUTH);

        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                jButton = new JButton();
                buttons[i][j] = jButton;
                jPanel.add(jButton);

                final int finalI = i;
                final int finalJ = j;

                jButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //String buttonText = e.getActionCommand();
                        //System.out.printf("Button: %s, X: %d, Y: %d \n", buttonText, finalI, finalJ);
                        controller.doShoot(new Point(finalI, finalJ));
                        infoText.setText("ХОД НОЛИКОВ. X: " + finalI + ", " + " Y: " + finalJ);
                    }
                });
            }
        }

        add(jPanel);

        JPanel jPanelNorth = new JPanel();
        JButton restartButton = new JButton("RESTART");
        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("RESTART")) {
                    //gameWindowController.restartGame();
                    infoText.setText("НОВАЯ ИГРА. Старт.");
                } else {
                    infoText.setText("ERROR!");
                }
            }
        });
        jPanelNorth.add(restartButton);
        add(jPanelNorth, BorderLayout.NORTH);
        setVisible(true);
    }

    public void updateWindowWithO(int x, int y) {
        Font font = new Font("Verdana", Font.BOLD, 76);
        buttons[x][y].setFont(font);
        buttons[x][y].setText("O");
    }

    public void updateWindowWithX(int x, int y) {
        Font font = new Font("Verdana", Font.BOLD, 76);
        buttons[x][y].setFont(font);
        buttons[x][y].setText("X");
    }
}