package ru.innopolis.stc.java.lesson6.task1;

import java.util.Scanner;

public class Book {
    private static String bookName;
    private String jenre;
    private static Chapter[] summ;
    private static Scanner in = new Scanner(System.in);

    Book(String bookName) {
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

    public static String getName() {
        return bookName;
    }

}
