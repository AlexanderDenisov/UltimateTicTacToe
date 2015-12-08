package ru.geekbrains.java1.ultimatetictactoe.model;


import ru.geekbrains.java1.ultimatetictactoe.views.GameConsolView;
import ru.geekbrains.java1.ultimatetictactoe.views.GameWindow;

public class Game {
    private static Game instance;
    private static GameActivity gameActivity;

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    private Game() {
    }

    public void init() {
        GameWindow gameWindow = new GameWindow();
        gameWindow.init();
        gameActivity = new GameActivity();
        gameActivity.reset();
        GameConsolView consolView = new GameConsolView(gameActivity);
    }

    public static void start() {
        gameActivity.gamePlaying();
    }
}
