package ru.geekbrains.java1.ultimatetictactoe;


public class Computer implements Shootable {

    @Override
    public Point doShoot() {
        return Point.getRandomPoint();

    }
}
