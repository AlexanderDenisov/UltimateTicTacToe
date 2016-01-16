package ru.geekbrains.java1.ultimatetictactoe.model;


public class TheWinner implements WinnerInterface {
    Field.Type[][] cells;

    @Override
    public void setWinner(PlayersInterface playersInterface) {

    }

    @Override
    public int getWinner() {
        if ((cells[0][0] == Field.Type.X && cells[0][1] == Field.Type.X && cells[0][2] == Field.Type.X) ||
                (cells[1][0] == Field.Type.X && cells[1][1] == Field.Type.X && cells[1][2] == Field.Type.X) ||
                (cells[2][0] == Field.Type.X && cells[2][1] == Field.Type.X && cells[2][2] == Field.Type.X) ||
                (cells[0][0] == Field.Type.X && cells[1][0] == Field.Type.X && cells[2][0] == Field.Type.X) ||
                (cells[0][1] == Field.Type.X && cells[1][1] == Field.Type.X && cells[2][1] == Field.Type.X) ||
                (cells[0][2] == Field.Type.X && cells[1][2] == Field.Type.X && cells[2][2] == Field.Type.X) ||
                (cells[0][0] == Field.Type.X && cells[1][1] == Field.Type.X && cells[2][2] == Field.Type.X) ||
                (cells[0][2] == Field.Type.X && cells[1][1] == Field.Type.X && cells[2][0] == Field.Type.X)) {
            return 1;
        }
        if ((cells[0][0] == Field.Type.O && cells[0][1] == Field.Type.O && cells[0][2] == Field.Type.O) ||
                (cells[1][0] == Field.Type.O && cells[1][1] == Field.Type.O && cells[1][2] == Field.Type.O) ||
                (cells[2][0] == Field.Type.O && cells[2][1] == Field.Type.O && cells[2][2] == Field.Type.O) ||
                (cells[0][0] == Field.Type.O && cells[1][0] == Field.Type.O && cells[2][0] == Field.Type.O) ||
                (cells[0][1] == Field.Type.O && cells[1][1] == Field.Type.O && cells[2][1] == Field.Type.O) ||
                (cells[0][2] == Field.Type.O && cells[1][2] == Field.Type.O && cells[2][2] == Field.Type.O) ||
                (cells[0][0] == Field.Type.O && cells[1][1] == Field.Type.O && cells[2][2] == Field.Type.O) ||
                (cells[0][2] == Field.Type.O && cells[1][1] == Field.Type.O && cells[2][0] == Field.Type.O)) {
            return 2;
        }
        if (cells[0][0] != Field.Type.N && cells[0][1] != Field.Type.N && cells[0][2] != Field.Type.N &&
                cells[1][0] != Field.Type.N && cells[1][1] != Field.Type.N && cells[1][2] != Field.Type.N &&
                cells[2][0] != Field.Type.N && cells[2][1] != Field.Type.N && cells[2][2] != Field.Type.N) {
            return 0;
        }
        return 3;
    }
}
