package ru.geekbrains.java1.ultimatetictactoe;


public class Game {
    private static Game instance;
    private Field field = new Field();
    private CreateField createField = new CreateField();

    protected static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    private Game() {
    }

    protected void init() {
        createField.setField(field);
    }

    protected void start() {
        createField.getField();
    }
}
