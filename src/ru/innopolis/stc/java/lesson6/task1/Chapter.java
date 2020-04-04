package ru.innopolis.stc.java.lesson6.task1;



public class Chapter {
    private final String name;
    private int startPage;

    public Chapter(String name, int startPage) {
        this.name = name;
        this.startPage = startPage;
    }

    public void startNewChapter(String nameChapter, int startPage) {
        Chapter chapter = new Chapter(nameChapter, startPage);
        //addChapterToArr(chapter);
    }
}
