package ru.geekbrains.java1.ultimatetictactoe.model;


public interface Subject {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
