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

    void init() {
        field = new Field();
    }

    public static void start() {
        field.showField();
        System.out.println("___________________________");
        for (int i = 0; i < 10; i++) {
            field.setWinner();
            if (field.setWinner() == 1) {
                System.out.println("Победили X");
                break;
            }
            if (field.setWinner() == 2) {
                System.out.println("Победили O");
                break;
            } else {
                field.doShoot(player.getShoot(), Field.Type.X);
                field.showField();
                field.setWinner();
                System.out.println("___________________________");
                field.doShoot(computer.getShoot(), Field.Type.O);
                field.showField();
                field.setWinner();
                System.out.println("___________________________");
            }
        }
        if (field.setWinner() == 0) {
            System.out.println("Ничья!");
        }
    }
}
