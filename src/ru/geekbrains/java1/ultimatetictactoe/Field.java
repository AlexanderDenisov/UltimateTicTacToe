package ru.geekbrains.java1.ultimatetictactoe;


import java.util.Random;

public class Field {
    private int fieldSize;
    private String[][] playingField;
    String type;

    public enum String {
        X, O, NOT_SET
    }

    Field() {
    }

    public void setHorizontalCoordinates(int fieldSize) {
        this.fieldSize = fieldSize;
    }

    public void getHorizontalCoordinates() {
        System.out.print(" " + " ");
        for (int i = 1; i < fieldSize + 1; i++) {
            System.out.print(" " + i + " ");
        }
    }

    public void setPlayingField(int fieldSize) {
        this.fieldSize = fieldSize;
        playingField = new String[fieldSize][fieldSize];
        for (int i = 0; i < playingField.length; i++) {
            for (int j = 0; j < playingField.length; j++) {
                playingField[j][i] = String.NOT_SET;
            }
        }
    }

    public void doShoot(Point point) {
        if (playingField[point.getX()][point.getY()] == String.NOT_SET) {
            playingField[point.getX()][point.getY()] = type;
        }
    }

    public String[][] getPlayingField() {
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

    public void setFieldSize(int fieldSize) {
        this.fieldSize = fieldSize;
    }

    public int getFieldSize() {
        return fieldSize;
    }
}
