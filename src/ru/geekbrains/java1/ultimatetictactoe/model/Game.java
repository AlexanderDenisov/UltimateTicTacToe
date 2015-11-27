package ru.geekbrains.java1.ultimatetictactoe.model;


import ru.geekbrains.java1.ultimatetictactoe.views.GameWindow;

public class Game {
    private static Game instance;
    private static GameActivity gamePlay;

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    private Game() {
    }

    public void init() {
        GameWindow gameWindow = new GameWindow();
        gameWindow.init();
        gamePlay = new GameActivity();
    }

    public void start() {
        gamePlay.gamePlaying();
    }

    void reset() {
        gamePlay.clearField();
        start();
    }
}
