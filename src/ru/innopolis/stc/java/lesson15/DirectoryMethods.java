package ru.innopolis.stc.java.lesson15;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class DirectoryMethods {
    private static Scanner in = new Scanner(System.in);

    public void printDirectoryContents() {
        System.out.println("Enter full path ('quit' to exit): ");
        while (true) {
            String s = in.nextLine();
            if (s.equals("quit"))
                break;

            File f = new File(s);
            if (!f.exists()) {
                System.out.println("\nNot found: " + s);
                continue;
            }

            if (!f.isDirectory()) {
                System.out.println(
                        "\nNot directory: " + s);
                continue;
            }
            printDirectoryContents(s, 0);
        }

    }

    /**
     * Данный метод используется только внутри класса,
     * Метод выводит в консоль каждую папку и файл в директори, переданной в параметре,:
     * Вложенные директории он тоже рекурсивно обходит.
     *
     * @param usersDirectory
     */
    //сделать реализацию отступов через увеличение НЕстатичной переменной для всех экземпляров класса, передаваемой в конструктор
    //способ два
    private void printDirectoryContents(String usersDirectory, int depthOfDirectory) {
        File directoryFile = new File(usersDirectory);
        String[] filePaths = directoryFile.list();

        int i;
        for (i = 0; i < filePaths.length; i++) {
            File fileForPrint = new File(usersDirectory, filePaths[i]);

            System.out.println(printDepthOfDirectory(depthOfDirectory) + Paths.get(usersDirectory, filePaths[i]).toString());
            if (fileForPrint.isDirectory()) {
                printDirectoryContents(Paths.get(usersDirectory, filePaths[i]).toString(), depthOfDirectory+1);
            }
        }
    }

    private String printDepthOfDirectory(int depthOfDirectory) {
        String space = " ";
        for (int i = depthOfDirectory; i < 0; i--) {
            space.concat(" ");
        }
        return space;
    }
}
