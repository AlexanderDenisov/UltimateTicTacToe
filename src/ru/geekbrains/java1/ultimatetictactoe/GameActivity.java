package ru.geekbrains.java1.ultimatetictactoe;


public class GameActivity {
    public static Field field = new Field();
    public static Computer computer = new Computer();
    public static Player player = new Player();

    public static void gamePlaying() {
        System.out.println("___КРЕСТИКИ-НОЛИКИ___"); // приветствие;
        pause();
        field.showField(); // показываем пустое поле;
        for (int i = 0; i < 10; i++) {
            field.setWinner(); // проверяем есть ли победитель;
            if (field.setWinner() == 3) { //если победителя нет, то ходят крестики;
                pause();
                System.out.println("___ХОДЯТ КРЕСТИКИ___");
                field.doShoot(player.getShoot(), Field.Type.X); // ход крестиков
                pause();
                field.showField(); // показываем поле после хода крестиков;
                field.setWinner(); // проверяем есть ли победитель после хода крестиков;
                if (field.setWinner() == 0) { //если после хода крестиков не осталось пустых клеток, но трех подряд X или 0 нет
                    System.out.println("___НИЧЬЯ!___"); // то ничья;
                    System.out.println("\n___GAME OVER___");
                    break; // игра заканчивается;
                }
                if (field.setWinner() == 1) { // если есть три клетки подряд заполнениые Х, то победили крестики;
                    System.out.println("___ПОБЕДИЛИ КРЕСТИКИ!___");
                    System.out.println("\n___GAME OVER___");
                    break; // игра заканчивается;
                }
            }
            //field.setWinner(); // еще раз проверяем есть ли победитель;
            if (field.setWinner() == 3) { // и если победителя нет, то ходят нолики
                pause();
                System.out.println("___ХОДЯТ НОЛИКИ___");
                field.doShoot(computer.getShoot(), Field.Type.O); // ход ноликов
                pause();
                field.showField(); // показываем поле после хода ноликов
                field.setWinner(); // и проверяем есть ли победитель после хода ноликов:
                /*if (field.setWinner() == 0) { //если после хода ноликов не осталось пустых клеток, но трех подряд X или 0 нет
                    System.out.println("___НИЧЬЯ!___"); // то ничья
                    System.out.println("\n___GAME OVER___"); // после хода ноликов ничьей быть не может
                    break;// игра заканчивается;
                }*/
                if (field.setWinner() == 2) { // если есть три клетки подряд заполнениые 0, то победили нолики;
                    System.out.println("___ПОБЕДИЛИ НОЛИКИ!___");
                    System.out.println("\n___GAME OVER___");
                    break; // игра заканчивается;
                }
            }
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
