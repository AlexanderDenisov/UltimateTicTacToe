package ru.geekbrains.java1.ultimatetictactoe.model;


public class Computer implements Shootable {

    @Override
    public Point getShoot() {
        return Point.getRandomPoint();

    }
}
