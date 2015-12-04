package ru.geekbrains.java1.ultimatetictactoe.controllers;


import ru.geekbrains.java1.ultimatetictactoe.model.Player;
import ru.geekbrains.java1.ultimatetictactoe.model.Point;


public class GameWindowController {

    public GameWindowController() {
    }

    public void doShoot(Point point) {
        Player.point = point;
        Player.isShoot = true;
    }

    //TODO реализовать;
    public void restartGame() {
    }
}
