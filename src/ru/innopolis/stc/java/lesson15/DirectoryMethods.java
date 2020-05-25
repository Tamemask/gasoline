package ru.innopolis.stc.java.lesson15;

import java.io.*;
import java.util.*;

public class DirectoryMethods {
    private static Scanner in = new Scanner(System.in);
    String s;
    public void major(){
        while(true)
        {
            System.out.println(
                    "Enter full path ('quit' to exit): ");

            String s = in.nextLine();
            if(s.equals("quit"))
                break;
        }

    }

    static void list(String szDir) {

    }
}
