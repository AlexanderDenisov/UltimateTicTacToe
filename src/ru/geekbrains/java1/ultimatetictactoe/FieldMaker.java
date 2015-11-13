package ru.geekbrains.java1.ultimatetictactoe;


public class FieldMaker {
    private Field field;

    FieldMaker() {
    }

    public void setField() {
        field = new Field();
        field.setFieldSize(3);
        field.setHorizontalCoordinates(field.getFieldSize());
        field.setBlankCell("[ ]");
        field.setPlayingField(field.getBlankCell(), field.getFieldSize());
    }

    public Field getField() {
        field.getHorizontalCoordinates();
        field.getRandomPoint();
        field.getPlayingField();
        return field;
    }
}
