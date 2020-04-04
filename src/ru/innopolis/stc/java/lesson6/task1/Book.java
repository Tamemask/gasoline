package ru.innopolis.stc.java.lesson6.task1;

import java.util.Scanner;

public class Book {
    private static String bookName;
    private String jenre;
    private Chapter[] summ = new Chapter[10];
    private Scanner in = new Scanner(System.in);

    Book(String bookName) {
        this.bookName = bookName;
    }



    public static String getName() {
        return bookName;
    }

    public void addChapter(Chapter chapter, int numberOfChapter) {
        summ[numberOfChapter] = chapter;
    }
}
