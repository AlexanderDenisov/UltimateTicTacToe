package ru.geekbrains.java1.ultimatetictactoe;



public class Player {
    String name;
    Player[] player;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayer(Player[] player) {
        this.player = player;
    }

    public Player[] getPlayer() {
        return player;
    }
}
