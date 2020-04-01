package ru.innopolis.stc.java.lesson4.task4;

import java.util.Scanner;

public class Progression {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        int j;
        int n;
        int step;
        System.out.println("Введите 1, если хотите арифметическую прогрессию \nВведите 2, если хотите геометрическую прогрессию");
        i = in.nextInt();
        System.out.println("Введите число, для которого хотите прогрессию");
        j = in.nextInt();
        System.out.println("Введите N (количество чисел в прогрессии)");
        n = in.nextInt();
        System.out.println("Введите шаг прогрессии");
        step = in.nextInt();
        int f = 0;
        int z = 1;
        switch (i) {
            case 1:
                System.out.println(j);
                for (int s = 1; s < n; s++) {
                    System.out.println(f = f + step*j);
                    step++;
                }
                break;
            case 2:
                for (int s = 0; s < n; s++) {
                    System.out.println(z *= j);
                }
                break;
            default:
                System.out.println("Что-то пошло не так");
        }
    }
}
