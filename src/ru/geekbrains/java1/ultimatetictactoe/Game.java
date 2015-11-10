package ru.geekbrains.java1.ultimatetictactoe;


public class Game {
    Field coordinates;
    Field field0;
    Field field1;
    Field field2;
    Field field3;
    Field field4;
    Field field5;
    Field field6;
    Field field7;
    Field field8;
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
        coordinates = new Field();
        coordinates.setCoordinates(" a " + " b " + " c " + "\t " + "d " + " e " + " f " + "\t" + " g " + " h " + " i ");
        field0 = new Field();
        field1 = new Field();
        field2 = new Field();
        field3 = new Field();
        field4 = new Field();
        field5 = new Field();
        field6 = new Field();
        field7 = new Field();
        field8 = new Field();
        field0.setPlayingField();
        field1.setPlayingField();
        field2.setPlayingField();
        field3.setPlayingField();
        field4.setPlayingField();
        field5.setPlayingField();
        field6.setPlayingField();
        field7.setPlayingField();
        field8.setPlayingField();
    }

    void start() {
        coordinates.getCoordinates();
        field0.getPlayingField();
        field1.getPlayingField();
        field2.getPlayingField();
        field3.getPlayingField();
        field4.getPlayingField();
        field5.getPlayingField();
        field6.getPlayingField();
        field7.getPlayingField();
        field8.getPlayingField();
    }
}
