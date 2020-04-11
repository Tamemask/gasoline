package ru.innopolis.stc.java.lesson8.task2;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Сколько клонов вы хотите создать?");
        Counter.createCounters(in.nextInt());
        System.out.println("Введите еще число клонов для создания");
        Counter.createCounters(in.nextInt());
        System.out.println("Всего создано " + Counter.getNumberOfClones() + " клонов");
    }
}
