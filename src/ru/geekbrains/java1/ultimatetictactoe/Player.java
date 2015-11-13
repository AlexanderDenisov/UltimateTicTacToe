package ru.geekbrains.java1.ultimatetictactoe;


public class Player {
    private String name;
    private Player player;
    private Point point;
    private int x;
    private int y;

    Player() {
    }

    public void setCurrentActivePlayer(Player player) {
        this.player = player;
    }

    public Player getCurrentActivePlayer() {
        return player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
