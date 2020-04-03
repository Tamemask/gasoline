package ru.innopolis.stc.java.lesson6.task1;

import static ru.innopolis.stc.java.lesson6.task1.Book.addChapterToArr;

public class Chapter {
    private final String name;
    private int startPage;

    public Chapter(String name, int startPage) {
        this.name = name;
        this.startPage = startPage;
    }

    public static void startNewChapter(String nameChapter, int startPage) {
        Chapter chapter = new Chapter(nameChapter, startPage);
        addChapterToArr(chapter);
    }
}
