package ru.geekbrains.java1.ultimatetictactoe;


public class Game {
    PlayingField playingField;
    private static Game instance;

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    private Game() {

    }

    void init() {
        playingField = new PlayingField();
        playingField.getPlayingField();
    }

    void start() {

    }
}
