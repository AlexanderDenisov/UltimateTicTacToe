package ru.geekbrains.java1.ultimatetictactoe;


public class Field {
    private String blankCell;
    private String coordinates;
    private int fieldSize;
    public int n;
    private String[][] playingField;

    public Field() {
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
        System.out.println(coordinates);
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setPlayingField() {
        this.setFieldSize(3);
        this.setBlankCell("[ ]");
        playingField = new String[this.getFieldSize()][this.getFieldSize()];
        for (int i = 0; i < playingField.length; i++) {
            for (int j = 0; j < playingField.length; j++) {
                playingField[j][i] = this.getBlankCell();
            }
        }
    }

    public String[][] getPlayingField() {
        for (int i = 0; i < playingField.length; i++) {
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
