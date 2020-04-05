package ru.innopolis.stc.java.lesson6.task1;


public class Book {
    private final String bookName;
    private String jenre;
    private Chapter[] summ = new Chapter[10];

    Book(String bookName) {
        this.bookName = bookName;
    }

//контроль переполнения массива
    //геттер сеттер (в тч для жанра)

    public String getName() {
        return bookName;
    }

    public void addChapter(Chapter chapter, int numberOfChapter) {
        summ[numberOfChapter] = chapter;
    }
}
