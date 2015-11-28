package ru.geekbrains.java1.ultimatetictactoe.model;


public class GameActivity {
    private Field field = new Field();
    private Computer computer = new Computer();
    private Player player = new Player();

    public void gamePlaying() {
        System.out.println("___КРЕСТИКИ-НОЛИКИ___"); // приветствие;
        //pause();
        field.showField(); // показываем пустое поле;
        for (int i = 0; i < 10; i++) {
            // проверяем есть ли победитель;
            if (field.setWinner() == 3) { //если победителя нет, то ходят крестики;
                //pause();
                System.out.println("___ХОДЯТ КРЕСТИКИ___");
                field.computerDoShootX(computer.doShoot(), Field.Type.X); // ход крестиков
                pause();
                field.showField(); // показываем поле после хода крестиков;
                // проверяем есть ли победитель после хода крестиков;
                if (field.setWinner() == 0) {//если после хода крестиков не осталось пустых клеток, но трех подряд X или 0 нет
                    pause();
                    System.out.println("___НИЧЬЯ!___"); // то ничья;
                    System.out.println("\n___GAME OVER___");
                    break; // игра заканчивается;
                }
                if (field.setWinner() == 1) { // если есть три клетки подряд заполнениые Х, то победили крестики;
                    pause();
                    System.out.println("___ПОБЕДИЛИ КРЕСТИКИ!___");
                    System.out.println("\n___GAME OVER___");
                    break; // игра заканчивается;
                }
                //проверяем есть ли победитель;
                // и если победителя нет, то ходят нолики
                pause();
                System.out.println("___ХОДЯТ НОЛИКИ___");
                do {
                    try {
                        field.playerDoShootO(player.doShoot()); // ход ноликов
                    } catch (Exception e) {
                        System.out.println("Вы сделали ход в занятую клетку. Сделайте новый ход.");
                        ;
                    }
                } while (!Player.isShoot);
                field.showField();// показываем поле после хода ноликов
                // и проверяем есть ли победитель после хода ноликов:
                if (field.setWinner() == 2) {
                    pause();// если есть три клетки подряд заполнениые 0, то победили нолики;
                    System.out.println("___ПОБЕДИЛИ НОЛИКИ!___");
                    System.out.println("\n___GAME OVER___");
                    break; // игра заканчивается;
                }
            }
        }
    }

    private static void pause() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clearField() {
        field.resetField();
        System.out.println("\n_____НОВАЯ ИГРА______");
        field.showField();
        gamePlaying();
    }
}
