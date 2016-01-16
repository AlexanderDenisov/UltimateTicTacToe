package ru.geekbrains.java1.ultimatetictactoe.model;


public interface PlayersInterface {

    void makeMove();

    void doMoveInPoint(Point point, Field.Type type);

}
