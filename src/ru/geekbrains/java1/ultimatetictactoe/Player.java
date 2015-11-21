package ru.geekbrains.java1.ultimatetictactoe;


public class Player implements Shootable {

    @Override
    public Point getShoot() {
        return Point.getRandomPoint();
    }
}
