package ru.geekbrains.java1.ultimatetictactoe;


public class Computer implements Shootable {

    @Override
    public Point getShoot() {
        return Point.getRandomPoint();

    }
}
