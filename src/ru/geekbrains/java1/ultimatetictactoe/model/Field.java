package ru.geekbrains.java1.ultimatetictactoe.model;


import ru.geekbrains.java1.ultimatetictactoe.views.GameWindow;

public class Field {
    private static Type[][] cells;
    final static int fieldSize = 3;
    private GameWindow gameWindow = new GameWindow();

    public enum Type {
        X, O, N
    }

    //конструктор игрового поля.
    public Field() {
        cells = new Type[getFieldSize()][getFieldSize()];
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                cells[i][j] = Type.N;
            }
        }
    }

    private void setCells(Type[][] cells) {
        this.cells = cells;
    }

    public Type[][] getCells() {
        return cells;
    }

    public static int getFieldSize() {
        return fieldSize;
    }

    //ход делает компьютер играющий за крестик
    public void computerDoShootX(Point point, Type type) {
        if (cells[point.getX()][point.getY()] == Type.X) {
            computerDoShootX(Point.getRandomPoint(), type);
        }
        if (cells[point.getX()][point.getY()] == Type.O) {
            computerDoShootX(Point.getRandomPoint(), type);
        }
        if (cells[point.getX()][point.getY()] == Type.N) {
            cells[point.getX()][point.getY()] = type;
            gameWindow.updateWindowWithX(point.getX(), point.getY());
        }
    }

    // сделать так, чтобы игра не продолжалась, если игрок пошел в занятую клетку. Решено
    // проверка хода игрока играющего за нолики
    public void playerDoShootO(Point point) throws Exception {
        if (cells[point.getX()][point.getY()] == Type.X || cells[point.getX()][point.getY()] == Type.O) {
            Player.isShoot = false;
            throw new Exception();
        }
        if (cells[point.getX()][point.getY()] == Type.N) {
            Player.isShoot = true;
            cells[point.getX()][point.getY()] = Type.O;
            gameWindow.updateWindowWithO(point.getX(), point.getY());
        }
    }

    // TODO обратиться к вьюшке;
    //показываем поле
    public void showField() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                System.out.print(cells[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    // проверка, есть ли победитель
    public int setWinner() {
        if ((cells[0][0] == Type.X && cells[0][1] == Type.X && cells[0][2] == Type.X) ||
                (cells[1][0] == Type.X && cells[1][1] == Type.X && cells[1][2] == Type.X) ||
                (cells[2][0] == Type.X && cells[2][1] == Type.X && cells[2][2] == Type.X) ||
                (cells[0][0] == Type.X && cells[1][0] == Type.X && cells[2][0] == Type.X) ||
                (cells[0][1] == Type.X && cells[1][1] == Type.X && cells[2][1] == Type.X) ||
                (cells[0][2] == Type.X && cells[1][2] == Type.X && cells[2][2] == Type.X) ||
                (cells[0][0] == Type.X && cells[1][1] == Type.X && cells[2][2] == Type.X) ||
                (cells[0][2] == Type.X && cells[1][1] == Type.X && cells[2][0] == Type.X)) {
            return 1;
        }
        if ((cells[0][0] == Type.O && cells[0][1] == Type.O && cells[0][2] == Type.O) ||
                (cells[1][0] == Type.O && cells[1][1] == Type.O && cells[1][2] == Type.O) ||
                (cells[2][0] == Type.O && cells[2][1] == Type.O && cells[2][2] == Type.O) ||
                (cells[0][0] == Type.O && cells[1][0] == Type.O && cells[2][0] == Type.O) ||
                (cells[0][1] == Type.O && cells[1][1] == Type.O && cells[2][1] == Type.O) ||
                (cells[0][2] == Type.O && cells[1][2] == Type.O && cells[2][2] == Type.O) ||
                (cells[0][0] == Type.O && cells[1][1] == Type.O && cells[2][2] == Type.O) ||
                (cells[0][2] == Type.O && cells[1][1] == Type.O && cells[2][0] == Type.O)) {
            return 2;
        }
        if (cells[0][0] != Type.N && cells[0][1] != Type.N && cells[0][2] != Type.N &&
                cells[1][0] != Type.N && cells[1][1] != Type.N && cells[1][2] != Type.N &&
                cells[2][0] != Type.N && cells[2][1] != Type.N && cells[2][2] != Type.N) {
            return 0;
        }
        return 3;
    }
}