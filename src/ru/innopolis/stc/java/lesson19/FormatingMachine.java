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
                Formatter f = new Formatter(salesReceipt)) {
            do {
                switch (stringsAmount) {
                    case (0):
                        productName = workingString;
                        break;
                    case (1):
                        productAmount = Double.parseDouble(workingString);
                        break;
                    case (2):
                        productPrice = Double.parseDouble(workingString);
                        Formatter f2 = new Formatter();
                        f2.format("%20s %7,2f %3,3f\n", productName, productPrice, productAmount);
                        System.out.println(f2);
                        stringsAmount +=1;
                        break;
                }
            } while ((workingString = bfr.readLine()) != null);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
