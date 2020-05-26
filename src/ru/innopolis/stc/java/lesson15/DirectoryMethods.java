package ru.innopolis.stc.java.lesson15;

import java.io.*;
import java.util.*;

public class DirectoryMethods {
    private static Scanner in = new Scanner(System.in);
    public void major(){
        System.out.println(
                "Enter full path ('quit' to exit): ");
        while(true)
        {
            String s = in.nextLine();
            if(s.equals("quit"))
                break;

            File f = new File(s);
            if(!f.exists())
            {
                System.out.println("\nNot found: " + s);
                continue;
            }

            if(!f.isDirectory())
            {
                System.out.println(
                        "\nNot directory: " + s);
                continue;
            }
            list(s);
        }

    }

    static void list(String Vhodyashee) {
        File f = new File(Vhodyashee);
        String[] SpisokVhodyasheh = f.list();

        int i;
        for(i = 0; i < SpisokVhodyasheh.length; i++)
        {
            File f1 = new File(Vhodyashee +
                    File.separator + SpisokVhodyasheh[i]);

            if(f1.isFile())
                System.out.println(Vhodyashee +
                        File.separator + SpisokVhodyasheh[i]);
            else
            {
                list(Vhodyashee +
                        File.separator + SpisokVhodyasheh[i]);
            }
        }
    }
}
