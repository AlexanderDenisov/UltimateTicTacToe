package ru.geekbrains.java1.ultimatetictactoe;


public class Section {
    Player player;
    private String blankCell;
    private int fieldSize;


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
