package ru.geekbrains.java1.ultimatetictactoe.model;


import java.util.Random;

public class Point {
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Point getRandomPoint() {
        return new Point(new Random().nextInt(3), new Random().nextInt(3));
    }
}
