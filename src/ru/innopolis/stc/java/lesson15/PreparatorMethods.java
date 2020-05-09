package ru.innopolis.stc.java.lesson15;

import java.io.File;
import java.util.Scanner;

public class PreparatorMethods {
    static Scanner in = new Scanner(System.in);
    static String fileName = in.nextLine();
    public static File makeFile() {
        File dir = new File("B:\\SomeDir\\" + fileName + ".txt");
        System.out.println(dir);
        return dir;
    }

/*    public static void renameFile() {
        fileName.
    }*/

    public static void copyFile() {
    }

    public static void deleteFile() {
    }
}
