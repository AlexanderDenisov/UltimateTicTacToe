package ru.geekbrains.java1.ultimatetictactoe;


public class Field {
    private String blankCell;
    private int fieldSize;
    private String[][] playingField;

    public Field() {
    }

    public void setCoordinates(int fieldSize) {
        this.fieldSize = fieldSize;
    }

    public void getHorizontalCoordinates() {
        System.out.print(" " + " ");
        for (int i = fieldSize; i > 0; i--) {
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
