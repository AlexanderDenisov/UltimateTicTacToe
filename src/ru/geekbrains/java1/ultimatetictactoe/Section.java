package ru.geekbrains.java1.ultimatetictactoe;


public class Section {
    Player player;
    private String blankCell;
    private int fieldSize;
    boolean isActive;

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

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
}
