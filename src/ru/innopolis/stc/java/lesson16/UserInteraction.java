package ru.innopolis.stc.java.lesson16;

import java.io.*;
import java.util.Scanner;

public class UserInteraction {
    public static void menu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Доступные действия: \n" +
                "1 - вывести содержимое библиотеки \n" +
                "2 - добавить книгу");

        Book zero = new Book("Old man and the sea", "Hemingway", 1899);
        Book first = new Book ("Deniska's storys", "Dragunski", 1980);
        Book second = new Book ("The Art of the deal", "D.Trump, T.Shwarz", 1987);

        switch (in.nextInt()) {
            case 1:
                try(DataInputStream libraryDIS = new DataInputStream(new FileInputStream("data.txt"))) {

                    String title = libraryDIS.readUTF();
                    String author = libraryDIS.readUTF();
                    int yearOfPrint = libraryDIS.readInt();
                    //System.out.printf("Title: %s  Author: %d YearOfPrint: %f");
                    System.out.printf("Title: "+ title + "  Author: " + author +"  YearOfPrint: " + yearOfPrint);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
                break;
            /**
             * TODO:Организовать обработку отсутствия файла как пустую библиотеку
             * TODO: как организовать окончание считывания информации из файла?
             * Варианты: по строкам, принудительно заканчивать цикл после даты
             * TODO: организовать добавление в файл пользовательской книги
             * TODO: обработать исключения - пользователь выбрал не существующую цифру
             * TODO: обработать подгрузку стандартной библиотеки - классов, которые
             */
            case 2:
                try(DataOutputStream libraryDOS = new DataOutputStream(new FileOutputStream("data.txt"))) {
                    /*System.out.println("введите название:");
                    System.out.println("введите автора");
                    System.out.println("введите год издания");*/
                    libraryDOS.writeUTF(zero.getTitle());
                    libraryDOS.writeUTF(zero.getAuthor());
                    libraryDOS.writeInt(zero.getYearOfPrint());
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
                break;
        }
    }
}

class Book {
    /**
     * Есть набор объектов типа "Книга".
     * * Каждая книга имеет название, автора, год издания.
     * * Можно больше, по желанию.
     */
    private String title;
    private String author;
    private int yearOfPrint;

    public Book(String title, String author, int yearOfPrint) {
        this.title = title;
        this.author = author;
        this.yearOfPrint = yearOfPrint;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPrint() {
        return yearOfPrint;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearOfPrint(int yearOfPrint) {
        this.yearOfPrint = yearOfPrint;
    }
}