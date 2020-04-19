package ru.innopolis.stc.java.lesson11;

import java.util.Scanner;

/**
 * Напишите программу которая получает на вход некую строку ,
 * после она вызывает метод, заменяющий в строке все вхождения слова «бяка» на «вырезано цензурой»
 * и выводит результат в консоль!
 */
public class Censor {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        setPhrase();
    }

    static void setPhrase() {
        System.out.println("Введите строку");
        String phrase = in.nextLine();
        if (phrase.contains("бяка")) {
            System.out.println(phrase.replace("бяка", "вырезано цензурой"));
        } else {
            System.out.println("не содержит плохих слов");
        }

    }
}
