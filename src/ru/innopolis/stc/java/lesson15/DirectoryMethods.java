package ru.innopolis.stc.java.lesson15;

import java.io.*;
import java.nio.file.Paths;
import java.util.*;

public class DirectoryMethods {
    private static Scanner in = new Scanner(System.in);
    private static int depthOfDirectory = 1;
    private String space = " ";

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
            printDirectoryContents(s, depthOfDirectory);
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
    private void printDirectoryContents(String usersDirectory, int depthOfDirectoryParam) {
        File directoryFile = new File(usersDirectory);
        String[] filePaths = directoryFile.list();

        int i;
        for (i = 0; i < filePaths.length; i++) {
            File fileForPrint = new File(usersDirectory, filePaths[i]);
            if (fileForPrint.isFile()) {
                System.out.println(space + Paths.get(usersDirectory, filePaths[i]).toString());
            } else {
                printDirectoryContents(Paths.get(usersDirectory, filePaths[i]).toString(), depthOfDirectory);
                space+= " ";
            }
        }
    }

/*    private String printDepthOfDirectory(int depthOfDirectory) {
        for (int i = 0; i < depthOfDirectory; i++) {
            space.concat(" ");
        }
        return space;
    }*/
}
