package ru.innopolis.stc.java.lesson6.task1;

public class Book {
    private final String bookName;
    String jenre;
    Chapter[] summ;

    Book(String bookName){
        this.bookName = bookName;
    }

    void startNewChapter(String nameChapter){
        int i = summ.length - 1;
        Chapter chapter = new Chapter(nameChapter);
        summ[1] = chapter;
    }

}
