package ru.innopolis.stc.java.lesson16;

import java.io.*;
import java.util.Scanner;

public class UserInteraction {
    public static void menu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Доступные действия: \n" +
                "1 - вывести содержимое библиотеки \n" +
                "2 - добавить книгу");
        switch (in.nextInt()) {
            case 1:
                try(DataInputStream libraryDIS = new DataInputStream(new FileInputStream("data.bin"))) {
                    String title = libraryDIS.readUTF();
                    String author = libraryDIS.readUTF();
                    int yearOfPrint = libraryDIS.readInt();
                    System.out.printf("Title: %s  Author: %d YearOfPrint: %f");
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 2:
                try(DataOutputStream libraryDOS = new DataOutputStream(new FileOutputStream("data.bin"))) {
                    System.out.println("введите название:");
                    System.out.println("введите автора");
                    System.out.println("введите год издания");
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
                break;
        }
    }
}
