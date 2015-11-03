package ru.geekbrains.java1.ultimatetictactoe;

import java.util.Arrays;

/**
 * Created by Кирилл on 04.11.2015.
 */
public class PlayingField {
    public static void main(String[] args) {

        final char BLANK_CELL = '_';
        final int ROW_SIZE = 3;

        char[] playingSection = new char[ROW_SIZE * ROW_SIZE];

        for (int i = 0; i < playingSection.length; i++) {
            playingSection[i] = BLANK_CELL;
        }

        char[] playingField = new char[ROW_SIZE * ROW_SIZE];

        for (int i = 0; i < playingField.length; i++) {
            playingField[i] = showPlayingSection(playingSection, ROW_SIZE);

        }

        showPlayingSection(playingField, ROW_SIZE);
    }

    static char showPlayingSection(char[] cell, int rowSize) {
        for (int i = 0; i < cell.length; i++) {
            System.out.print(cell[i] + " ");
            if ((i + 1) / rowSize == 3) {
                System.out.println();
            }
        }
        return '_';
    }
}



