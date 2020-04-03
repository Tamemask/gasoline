package ru.innopolis.stc.java.lesson6.task1;

import java.util.Scanner;

public class BookCase {
    private static Book[] arrayBooks = new Book[50];
    static int amount = 0;
    private static String book;
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите название добавляемой книги ");
        book = in.nextLine();
        addBookToCase(book);
    }

    public static void addBookToCase(String bookName) {
        Book book = new Book(bookName);
        arrayBooks[amount] = book;
        amount++;
        System.out.println("Добавлена книга " + arrayBooks[amount].getName());
    }
}
