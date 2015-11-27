package ru.geekbrains.java1.ultimatetictactoe.model;


public class Player implements Shootable {

    public static volatile boolean isShoot;
    public static Point point;

    @Override
    public Point doShoot() {
        isShoot = false;
        while (!isShoot) ;
        return point;
    }
}
