package ru.geekbrains.java1.ultimatetictactoe;

public class Main {
    public static void main(String[] args) {
        String emptyCell = "[ ]";
        String[][] cells = new String[10][10];

        for (int m = 0; m < cells.length; m++) {
            for (int n = 0; n < cells.length; n++) {
                cells[n][m] = emptyCell;
            }
        }

        System.out.println("  " + " 1 " + " 2 " + " 3 " + "\t " + " 4 " + " 5 " + " 6 " + "\t" + " 7 " + " 8 " + " 9 ");

        for (int m = 1; m < 4; m++) {
            System.out.print(m + " ");
            for (int n = 1; n < 4; n++) {
                System.out.print(cells[n][m]);
            }
            System.out.print("\t ");
            for (int n = 4; n < 7; n++) {
                System.out.print(cells[n][m]);
            }
            System.out.print("\t");
            for (int n = 7; n < 10; n++) {
                System.out.print(cells[n][m]);
            }
            System.out.print("\n");
        }
        System.out.println();

        for (int m = 4; m < 7; m++) {
            System.out.print(m + " ");
            for (int n = 1; n < 4; n++) {
                System.out.print(cells[n][m]);
            }
            System.out.print("\t ");
            for (int n = 4; n < 7; n++) {
                System.out.print(cells[n][m]);
            }
            System.out.print("\t");
            for (int n = 7; n < 10; n++) {
                System.out.print(cells[n][m]);
            }
            System.out.print("\n");
        }
        System.out.println();

        for (int m = 7; m < 10; m++) {
            System.out.print(m + " ");
            for (int n = 1; n < 4; n++) {
                System.out.print(cells[n][m]);
            }
            System.out.print("\t ");
            for (int n = 4; n < 7; n++) {
                System.out.print(cells[n][m]);
            }
            System.out.print("\t");
            for (int n = 7; n < 10; n++) {
                System.out.print(cells[n][m]);
            }
            System.out.print("\n");
        }
    }
}