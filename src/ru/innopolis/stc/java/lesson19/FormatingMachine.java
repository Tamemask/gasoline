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
    String separator = "================================================";
    String multiplicatorSymbol = " х ";
    String workingString;
    String productName = null;
    double productAmount = 0;
    double productPrice;
    int stringsAmount = 0;

    void Formatting() {

        try (FileWriter fr  = new FileWriter(salesReceipt);
             Formatter f = new Formatter(fr)) {
            File myObj = new File("B:\\SCUM\\dowloads2\\Fridge\\products.txt");
            Scanner myReader = new Scanner(myObj);
            fr.write(separator);
            while (myReader.hasNextLine()) {
                String workingString = myReader.nextLine();
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
                        //fr.write(String.valueOf(f.format("%20s %7.2f %3.3f\n", productName, productPrice, productAmount)));
                        f.format("%20s %7.2f %s %3.3f %7.2f\n", productName, productPrice, multiplicatorSymbol, productAmount, productPrice*productAmount);
                        //System.out.println(f.format("%20s %7.2f %3.3f\n", productName, productPrice, productAmount));
                        stringsAmount = 0;
                        break;
                }
            }
            fr.write(separator);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
