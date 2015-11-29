package ru.geekbrains.java1.ultimatetictactoe.model;


public class Computer implements Shootable {

    public Computer() {
    }

    @Override
    public Point doShoot() {
        return Point.getRandomPoint();
    }
}
