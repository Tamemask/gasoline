package ru.innopolis.stc.java.lesson6.task1;

import java.util.Scanner;

import static ru.innopolis.stc.java.lesson6.task1.Book.addBookToCase;

public class BookCase {
    static Book[] arrayBooks;
    static String book;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите название добавляемой книги ");
        book = in.nextLine();
        addBookToCase(arrayBooks, book);
    }

}
