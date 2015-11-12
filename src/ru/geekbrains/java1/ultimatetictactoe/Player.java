package ru.geekbrains.java1.ultimatetictactoe;


public class Player {
    private String name;
    private Player[] players;
    private Player player;

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

    public void setPlayer(Player[] players) {
        this.players = players;
    }

    public Player[] getPlayer() {
        return players;
    }
}
