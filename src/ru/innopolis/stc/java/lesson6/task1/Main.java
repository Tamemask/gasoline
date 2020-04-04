package ru.innopolis.stc.java.lesson6.task1;

import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);
    private static BookCase[] cupboard = new BookCase[5];
    private static int amount;

    public static void main(String[] args) {
        System.out.println(amount);
        newBookCase();
        newBook();
        newChapter();
/*        System.out.println("Введите название добавляемой книги ");
        BookCase top = new BookCase();
        top.addBookToCase(in.nextLine());*/
    }

    static void newBookCase() {
        System.out.println("Введите название для новой полки ");
        BookCase c = new BookCase(in.nextLine());
        setCupboard(c);
    }

    private static void newBook() {
        System.out.println("Введите название для новой книги ");
        Book b = new Book(in.nextLine());
        cupboard[0].addBookToCase(b);
    }

    private static void newChapter() {
        System.out.println("введите название главы");
        String name = in.nextLine();
        System.out.println("Введите номер страницы, с которой начинается глава");
        int page = in.nextInt();
        Chapter chapter = new Chapter(name, page);
        System.out.println("Введите номер главы в книге (1-10)");
        int numberOfChapter = in.nextInt();
        System.out.println("Введите номер книги на полке (1-10), в которую хотите добавить главу");
        int numberOfBook = in.nextInt();
        System.out.println("Введите номер полки (1-5)");
        int numberOfBookCase = in.nextInt();
        cupboard[numberOfBookCase].addChapterToBook(chapter, numberOfBook, numberOfChapter);
    }

    static void setCupboard(BookCase bookCase) {
        cupboard[amount] = bookCase;
        amount++;
    }



}
