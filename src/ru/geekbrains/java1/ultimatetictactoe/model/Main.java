package ru.geekbrains.java1.ultimatetictactoe.model;


public class Main {
    public static void main(String[] args) {
        Game game = Game.getInstance();
        game.init();
        game.start();
        game.reset();
    }
}
