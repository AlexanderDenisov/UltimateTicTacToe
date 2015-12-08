package ru.geekbrains.java1.ultimatetictactoe.model;


import java.util.ArrayList;

public class GameActivity implements Subject {
    private ArrayList observers;
    private Field field;
    private Computer computer;
    private Player player;
    private volatile boolean isGameOver = false;

    public GameActivity() {
        observers = new ArrayList();
    }

    private void resetPlayer() {
        player = new Player();
    }

    private void resetComputer() {
        computer = new Computer();
    }

    private void resetField() {
        field = new Field();
    }

    public void reset() {
        resetField();
        resetComputer();
        resetPlayer();
        System.out.println("\n_____НОВАЯ ИГРА______");
    }

    private void gameOver() {
        if (field.setWinner() == 1) {
            System.out.println("___ПОБЕДИЛИ КРЕСТИКИ!___");
            System.out.println("\n___GAME OVER___");
            isGameOver = true;
        }
        if (field.setWinner() == 2) {
            System.out.println("___ПОБЕДИЛИ НОЛИКИ!___");
            System.out.println("\n___GAME OVER___");
            isGameOver = true;
        }
        if (field.setWinner() == 0) {
            System.out.println("___НИЧЬЯ!___");
            System.out.println("\n___GAME OVER___");
            isGameOver = true;
        }
    }

    public void computerMove() {
        switch (field.setWinner()) {
            case 3:
                System.out.println("___ХОДЯТ КРЕСТИКИ___");
                field.computerDoShootX(computer.doShoot(), Field.Type.X);
                setField(field);
                break;
            case 0:
                gameOver();
                break;
            case 1:
                gameOver();
                break;
        }
    }

    private void playerMove() {
        switch (field.setWinner()) {
            case 3:
                System.out.println("___ХОДЯТ НОЛИКИ___");
                do {
                    try {
                        field.playerDoShootO(player.doShoot());
                    } catch (Exception e) {
                        System.out.println("Вы сделали ход в занятую клетку. Сделайте новый ход.");
                    }
                } while (!Player.isShoot);
                setField(field);
                break;
            case 2:
                gameOver();
                break;
        }
    }

    public void gamePlaying() {
        System.out.println("___КРЕСТИКИ-НОЛИКИ___");
        setField(field);
        do {
            computerMove();
            pause();
            playerMove();
            pause();
        } while (!isGameOver);
    }

    private static void pause() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(field);
        }
    }

    public void fieldChanged() {
        notifyObservers();
    }

    public void setField(Field field) {
        this.field = field;
        fieldChanged();
    }
}
