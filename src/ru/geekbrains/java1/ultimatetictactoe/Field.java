package ru.geekbrains.java1.ultimatetictactoe;


import java.util.Random;

public class Field {
    private String blankCell;
    private int fieldSize;
    private String[][] playingField;

    Field() {
    }

    protected void setCoordinates(int fieldSize) {
        this.fieldSize = fieldSize;
    }

    protected void getHorizontalCoordinates() {
        System.out.print(" " + " ");
        for (int i = 1; i < fieldSize + 1; i++) {
            System.out.print(" " + i + " ");
        }
    }

    protected void setPlayingField(String blankCell, int fieldSize) {
        this.fieldSize = fieldSize;
        this.blankCell = blankCell;
        playingField = new String[fieldSize][fieldSize];
        for (int i = 0; i < playingField.length; i++) {
            for (int j = 0; j < playingField.length; j++) {
                playingField[j][i] = blankCell;
            }
        }
    }

    protected String[][] getRandomPoint(int fieldSize) {
        Random random = new Random();
        Point point = new Point(random.nextInt(fieldSize), random.nextInt(fieldSize));
        playingField[point.getX()][point.getY()] = "[X]";
        return playingField;
    }

    protected String[][] getPlayingField() {
        getRandomPoint(fieldSize);
        System.out.println();
        for (int i = 0; i < playingField.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < playingField.length; j++) {
                System.out.print(playingField[j][i]);
            }
            System.out.print("\n");
        }
        return playingField;
    }

    protected void setBlankCell(String blankCell) {
        this.blankCell = blankCell;
    }

    protected String getBlankCell() {
        return blankCell;
    }

    protected void setFieldSize(int fieldSize) {
        this.fieldSize = fieldSize;
    }

    protected int getFieldSize() {
        return fieldSize;
    }
}
