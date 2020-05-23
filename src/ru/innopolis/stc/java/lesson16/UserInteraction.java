package ru.innopolis.stc.java.lesson16;

import java.io.*;
import java.util.Scanner;

public class UserInteraction {
    public void menu() {
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
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
        }
    }
}
