package ru.geekbrains.java1.ultimatetictactoe.views;

import ru.geekbrains.java1.ultimatetictactoe.model.DisplayElement;
import ru.geekbrains.java1.ultimatetictactoe.model.Field;
import ru.geekbrains.java1.ultimatetictactoe.model.Observer;
import ru.geekbrains.java1.ultimatetictactoe.model.Subject;


public class GameConsolView implements Observer, DisplayElement {
    private Field field = new Field();
    private Subject gameActivity;

    public GameConsolView(Subject gameActivity) {
        this.gameActivity = gameActivity;
        gameActivity.registerObserver(this);
    }

    @Override
    public void display() {
        field.showField();
    }

    @Override
    public void update(Field field) {
        this.field = field;
        display();
    }
}
