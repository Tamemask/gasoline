package ru.innopolis.stc.java.lesson19;


import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Formatter;

public class FormatingMachine {
    File salesReceipt = new File("B:\\SCUM\\dowloads2\\Fridge\\out.txt");
    File myObj = new File("B:\\SCUM\\dowloads2\\Fridge\\products.txt");
    String header = "Наименование        Цена   Кол-во    Стоимость\n";
    String separator = "================================================\n";
    String multiplicatorSymbol = " х ";
    String total = "Итого:";

    double priceSumm;
    String workingString;
    String productName = null;
    double productAmount = 0;
    double productPrice;
    int stringsAmount = 0;


    void Formatting() {

        try (FileWriter fr  = new FileWriter(salesReceipt);
             Formatter f = new Formatter(fr);
             Scanner myReader = new Scanner(myObj);) {
            fr.write(header + separator);
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
                        double cost = productPrice*productAmount;
                        //fr.write(String.valueOf(f.format("%20s %7.2f %3.3f\n", productName, productPrice, productAmount)));
                        f.format("%-17s %7.2f %s %3.3f %7.2f\n",
                                productName, productPrice, multiplicatorSymbol, productAmount, cost);
                        //System.out.println(f.format("%20s %7.2f %3.3f\n", productName, productPrice, productAmount));
                        priceSumm += cost;
                        stringsAmount = 0;
                        break;
                }
            }
            fr.write(separator);
            f.format("%-40s %7.2f", total, priceSumm);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
