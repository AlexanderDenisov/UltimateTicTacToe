package ru.geekbrains.java1.ultimatetictactoe;


public class GameActivity {
    public static Field field = new Field();
    ;
    public static Computer computer = new Computer();
    public static Player player = new Player();

    public static void gamePlaying() {
        System.out.println("___КРЕСТИКИ-НОЛИКИ___");
        pause();
        field.showField();
        for (int i = 0; i < 10; i++) {
            pause();
            System.out.println("___ХОДЯТ КРЕСТИКИ___");
            field.doShoot(player.getShoot(), Field.Type.X);
            pause();
            field.showField();
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
            }
            pause();
            System.out.println("___ХОДЯТ НОЛИКИ___");
            field.doShoot(computer.getShoot(), Field.Type.O);
            pause();
            field.showField();
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
            }
        }
        if (field.setWinner() == 0) {
            System.out.println("Ничья!");
        }
    }

    private static void pause() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clearField() {
        field.resetField();
        System.out.println("\n_____НОВАЯ ИГРА______");
        field.showField();
    }
}
