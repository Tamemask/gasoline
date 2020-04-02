package ru.innopolis.stc.java.lesson6.task1;

import static ru.innopolis.stc.java.lesson6.task1.Book.summ;

public class Chapter {
    private final String name;
    int startPage;

    public Chapter(String name, int startPage) {
        this.name = name;
    }

    public static void startNewChapter(String nameChapter, int startPage) {
        int i = summ.length - 1;
        Chapter chapter = new Chapter(nameChapter, startPage);
        summ[1] = chapter;
    }
}
