package ru.innopolis.stc.java.lesson4.task2;

import java.util.Scanner;

public class NumberClassifier {
    public static void main(String[] args) {
        //код после Reformat Code
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        double i = in.nextInt();
        System.out.print("Число ");
        if (i > 0)
            System.out.print("положительное");
        else if (i < 0)
            System.out.print("отрицательное");
        else
            System.out.print("нулевое");
        System.out.print(", ");
        double j = i % 2;
        if (j != 0)
            System.out.print("нечетное.");
        else
            System.out.print("четное.");
    }
}
