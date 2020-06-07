package ru.innopolis.stc.java.lesson18;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Converter {
    static Scanner in = new Scanner(System.in);
    static File target = new File(String.valueOf(in.nextLine()));
    public final static Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) throws FileNotFoundException {

        File example2 = new File("B:\\SCUM\\example2.txt");
        File example3 = new File("B:\\SCUM\\example3.txt");
        String s;

        try(BufferedReader bfr = new BufferedReader(new FileReader(example2));
            FileWriter fw = new FileWriter(example3)
        ){
            while ((s = bfr.readLine()) != null ) {
                byte[] sFormatted = s.getBytes("UTF-8");
                fw.write(sFormatted + "\n");
            }
            //for (int i = 0; i < fr. )

        }
        catch (IOException e) {
            log.log(Level.SEVERE,"Error", e);
        }

        /**
         * как перегнать инфу в байты
         * как перегнать байты в новую кодировку?
         */
    }
}
