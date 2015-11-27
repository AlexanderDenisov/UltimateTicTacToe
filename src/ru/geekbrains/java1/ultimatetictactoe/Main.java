package ru.geekbrains.java1.ultimatetictactoe;


import ru.geekbrains.java1.ultimatetictactoe.model.Game;

public class Main {
    public static void main(String[] args) {
        Game game = Game.getInstance();
        game.init();
        game.start();
    }
}
