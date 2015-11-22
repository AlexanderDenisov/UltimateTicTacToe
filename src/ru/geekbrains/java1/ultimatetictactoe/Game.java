package ru.geekbrains.java1.ultimatetictactoe;


public class Game {
    private static Game instance;
    public static Field field;
    public static Computer computer = new Computer();
    public static Player player = new Player();

    protected static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    private Game() {
    }

    public static void init() {
        field = new Field();
    }

    public static void start() {
        System.out.println("___КРЕСТИКИ-НОЛИКИ___");
        field.showField();
        for (int i = 0; i < 10; i++) {
            field.setWinner();
            if (field.setWinner() == 1) {
                System.out.println("Победили X");
                System.out.println("___GAME OVER___");
                break;
            }
            if (field.setWinner() == 2) {
                System.out.println("Победили O");
                System.out.println("___GAME OVER___");
                break;
            } else {
                System.out.println("___ХОДЯТ КРЕСТИКИ___");
                field.doShoot(player.getShoot(), Field.Type.X);
                field.showField();
                field.setWinner();
                System.out.println("___ХОДЯТ НОЛИКИ___");
                field.doShoot(computer.getShoot(), Field.Type.O);
                field.showField();
                field.setWinner();
            }
        }
        if (field.setWinner() == 0) {
            System.out.println("Ничья!");
        }
    }

    public static void reset() {
        field.resetField();
        System.out.println("\n_____НОВАЯ ИГРА______");
        field.showField();
    }
}
