package ru.geekbrains.java1.ultimatetictactoe;


import java.util.Random;

public class Field {
    private String blankCell;
    private int fieldSize;
    private String[][] playingField;
    private Random random = new Random();
    private Point point;

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

    public void setPlayingField(String blankCell, int fieldSize) {
        this.fieldSize = fieldSize;
        this.blankCell = blankCell;
        playingField = new String[fieldSize][fieldSize];
        for (int i = 0; i < playingField.length; i++) {
            for (int j = 0; j < playingField.length; j++) {
                playingField[j][i] = blankCell;
            }
        }
    }

    public String[][] getRandomXPoint() {
        point = new Point(random.nextInt(fieldSize), random.nextInt(fieldSize));
        playingField[point.getX()][point.getY()] = "[X]";
        return playingField;
    }

    public String[][] getRandomOPoint() {
        point = new Point(random.nextInt(fieldSize), random.nextInt(fieldSize));
        playingField[point.getX()][point.getY()] = "[O]";
        return playingField;
    }

    public void getRandomPoint() {
        point = new Point(random.nextInt(fieldSize), random.nextInt(fieldSize));
        if (playingField[point.getX()][point.getY()] == "[ ]") {
            getRandomXPoint();
        } else {
            getRandomOPoint();
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

    public void setBlankCell(String blankCell) {
        this.blankCell = blankCell;
    }

    public String getBlankCell() {
        return blankCell;
    }

    public void setFieldSize(int fieldSize) {
        this.fieldSize = fieldSize;
    }

    public int getFieldSize() {
        return fieldSize;
    }
}
