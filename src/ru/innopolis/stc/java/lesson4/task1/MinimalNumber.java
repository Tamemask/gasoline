package ru.innopolis.stc.java.lesson4.task1;

import java.util.Scanner;

public class MinimalNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int i;
        int j;

        System.out.println("введите первое число");
        i = in.nextInt();
        System.out.println("введите второе число");
        j = in.nextInt();
        if (i > j)
            System.out.println("минимальное число из двух - " + j);
        else
            System.out.println("минимальное число из двух - " + i);
    }
}
