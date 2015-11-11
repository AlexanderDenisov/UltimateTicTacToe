package ru.geekbrains.java1.ultimatetictactoe;


public class Game {
    Field coordinates;
    Field fieldSize;
    Field blankCell;
    Field field;
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
        fieldSize = new Field();
        fieldSize.setFieldSize(3);
        coordinates = new Field();
        coordinates.setCoordinates(fieldSize.getFieldSize());
        blankCell = new Field();
        blankCell.setBlankCell("[ ]");
        field = new Field();
        field.setPlayingField(blankCell.getBlankCell(), fieldSize.getFieldSize());
    }

    void start() {
        coordinates.getHorizontalCoordinates();
        field.getPlayingField();
    }
}
