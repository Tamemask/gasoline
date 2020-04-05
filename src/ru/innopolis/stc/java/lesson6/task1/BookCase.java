package ru.innopolis.stc.java.lesson6.task1;

import java.util.Scanner;

public class BookCase {
    private String bookCaseName;
    private Book[] arrayBooks = new Book[10];
    private int amount;

    BookCase(String bookCaseName) {
        this.bookCaseName = bookCaseName;
    }
//сделать геттер и сеттер для имени полки
    //если книга может быть дополнена - нужно сделать для этого метод, чтобы достать(сделать) и метод чтобы положить обратно (этот сделан)
    //public void

    public void addBookToCase(Book bookName) {
        arrayBooks[amount] = bookName;
        //контролировать, что массив не переполнится
        System.out.println("Добавлена книга " + arrayBooks[amount].getName()); //эта строка должна быть в основном методе - там, где вызывается аддБукТуКейс
        amount++;
    }

    public void addChapterToBook(Chapter chapter, int book, int numberOfChapter) {
        arrayBooks[book].addChapter(chapter, numberOfChapter);
    }


}
