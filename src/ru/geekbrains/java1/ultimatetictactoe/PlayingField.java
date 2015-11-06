package ru.geekbrains.java1.ultimatetictactoe;


public class PlayingField {
    Section section;
    String[] playingField;


    PlayingField() {
        section = new Section();
        section.setFieldSize(9);
        section.setBlankCell("[ ]");
        section.getBlankCell();
        playingField = new String[section.getFieldSize() * section.getFieldSize()];
        for (int i = 0; i < playingField.length; i++) {
            playingField[i] = section.getBlankCell();
        }
        System.out.print("\t");
        for (int i = 0; i < playingField.length; i++) {
            System.out.print(playingField[i] + "\t");
            if ((i + 1) % section.getFieldSize() == 0) {
                System.out.print("\n");
            }
            if ((i + 1) % 3 == 0) {
                System.out.print("\t");
            }
            if ((i + 1) % 27 == 0) {
                System.out.println();
                System.out.print("\t");
            }
        }
    }

    public String[] getPlayingField() {
        return playingField;
    }
}
