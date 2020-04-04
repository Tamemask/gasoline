package ru.innopolis.stc.java.lesson6.task1;

import java.util.Scanner;

public class BookCase {
    private String bookCaseName;
    private Book[] arrayBooks = new Book[10];
    private static int amount = 0;

    BookCase(String bookCaseName) {
        this.bookCaseName = bookCaseName;
    }


    public void addBookToCase(Book bookName) {
        arrayBooks[amount] = bookName;
        amount++;
        System.out.println("Добавлена книга " + arrayBooks[amount].getName());
    }

    public void addChapterToBook(Chapter chapter, int book, int numberOfChapter) {
        arrayBooks[book].addChapter(chapter, numberOfChapter);
    }


}
