package ru.innopolis.stc.java.lesson6.task1;

import java.util.Scanner;

public class Book {
    private final String bookName;
    String jenre;
    static Chapter[] summ;
    static Scanner in = new Scanner(System.in);

    public static void addBookToCase(Book[] arrayBooks, String bookName){
        Book book = new Book(bookName);
        int i = arrayBooks.length - 1;
        arrayBooks[i] = book;
    }

    Book(String bookName){
        this.bookName = bookName;
    }
    public static void startChapter(int page) {
        System.out.println("Введите название главы");
        Chapter.startNewChapter(in.nextLine(), page);
    }

    public static void addChapterToArr(Chapter chapter) {
        int i = summ.length - 1;
        summ[i] = chapter;
    }

}
