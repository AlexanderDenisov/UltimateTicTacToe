package ru.geekbrains.java1.ultimatetictactoe;


public class Point {
    private int x;
    private int y;

    Point() {
    }

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

    Point(int x, int y) {
        setX(this.x = x);
        setY(this.y = y);
    }
}
