package ru.geekbrains.java1.ultimatetictactoe.model;


public class Game {
    private static Game instance;
    public static GameActivity gamePlay;

    protected static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    private Game() {
    }

    public static void init() {
        gamePlay = new GameActivity();
    }

    public static void start() {
        gamePlay.gamePlaying();
    }

    public static void reset() {
        gamePlay.clearField();
    }
}
