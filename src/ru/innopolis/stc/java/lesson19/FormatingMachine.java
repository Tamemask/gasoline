package ru.innopolis.stc.java.lesson19;


import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Formatter;

public class FormatingMachine {
    File raw = new File("B:\\SCUM\\dowloads2\\Fridge\\products.txt");
    File salesReceipt = new File("B:\\SCUM\\dowloads2\\Fridge\\out.txt");
    String workingString;
    String productName = null;
    double productAmount = 0;
    double productPrice;
    int stringsAmount = 0;

    void Formatting() {
        try (
                BufferedReader bfr = new BufferedReader(new FileReader(raw));
                //FileWriter fr  = new FileWriter(salesReceipt);
                Formatter f = new Formatter(salesReceipt)) {
            while ((workingString = bfr.readLine()) != null); {
                switch (stringsAmount) {
                    case (0):
                        productName = workingString;
                        stringsAmount +=1;
                        break;
                    case (1):
                        productAmount = Double.parseDouble(workingString);
                        stringsAmount +=1;
                        break;
                    case (2):
                        productPrice = Double.parseDouble(workingString);
                        Formatter f2 = new Formatter();
                        f.format("%20s %7,2f %3,3f\n", productName, productPrice, productAmount);
                        //fr.write(String.valueOf(f2.format("%20s %7,2f %3,3f\n", productName, productPrice, productAmount)));
                        System.out.println(f2);
                        stringsAmount = 0;
                        break;
                }
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
