package ru.innopolis.stc.java.lesson18;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Converter {

    public final static Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);


    public static void main(String[] args) {

        File example2 = new File("B:\\SCUM\\example2.txt");
        File example3 = new File("B:\\SCUM\\example3.txt");
        String s;

        try (BufferedReader bfr = new BufferedReader(new FileReader(example2, Charset.forName("Windows-1251")));
             FileOutputStream fw = new FileOutputStream(example3)
        ) {
            System.out.println(Charset.defaultCharset());
            while ((s = bfr.readLine()) != null) {
                s +="\n";
                byte[] sFormatted = s.getBytes(Charset.forName("KOI8-R"));
                fw.write(sFormatted);
            }
        } catch (IOException e) {
            log.log(Level.SEVERE, "Error", e);
        }
    }
}
