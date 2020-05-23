package ru.innopolis.stc.java.lesson16;

public class Book {
    /**
     * Есть набор объектов типа "Книга".
     * * Каждая книга имеет название, автора, год издания.
     * * Можно больше, по желанию.
     */
    private String title;
    private String author;
    private String yearOfPrint;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getYearOfPrint() {
        return yearOfPrint;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearOfPrint(String yearOfPrint) {
        this.yearOfPrint = yearOfPrint;
    }
}
