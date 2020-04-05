package ru.innopolis.stc.java.lesson8.task1;

import java.util.Scanner;

public class Calculator {

    static Scanner in = new Scanner(System.in);
    static double numbers[];
    static double firstNumber;
    static double result;


    public static void setNumbresAmount() {
        numbers = new double[in.nextInt()];
    }

    public static void getNumbers() {
        for (double n : numbers) {
            int l = 0;
            while (l <= numbers.length) {
                System.out.println("Введите " + (l + 1) + "-е число, с которым хотите произвести операции");
                numbers[l] = in.nextDouble();
            }
        }
    }

    public static void action() {
        double t = 0;
        for (double g : numbers) {

        }
    }

    static void summ(double t, double g) {
        t += g;
    }

    static void subtraction(double t, double g) {
        t -= g;
    }

    static void multiplication(double t, double g) {
        t *= g;
    }
}
