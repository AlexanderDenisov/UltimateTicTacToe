package ru.geekbrains.java1.ultimatetictactoe;


public class Game {
    private static Game instance;
    private FieldMaker fieldMaker = new FieldMaker();

    protected static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    private Game() {
    }

    void init() {
        fieldMaker.setField();
    }

    void start() {
        fieldMaker.getField();
    }
}
