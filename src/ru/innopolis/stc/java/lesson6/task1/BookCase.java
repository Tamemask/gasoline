package ru.innopolis.stc.java.lesson6.task1;

public class BookCase {
    Book[] arrayBooks;

    void addBookToCase(String bookName){
        Book book = new Book(bookName);
        int i = arrayBooks.length - 1;
        arrayBooks[i] = book;
    }
}
