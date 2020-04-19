package ru.innopolis.stc.java.lesson9.task3;

public class Main {
    public static void main(String[] args) {
        Scolar s = new Scolar();
        Lebowski big = new Lebowski();
        swim(s, big);
        run(s, big);
    }

    static void swim(Human... h) {
        for (int i = h.length - 1; i >= 0; i--) {
            h[i].swimAsItCan();
            h[i].swimUnderWater();
        }
        System.out.println(" ");
    }

    static void run(Human... h) {
        for (int i = h.length - 1; i >= 0; i--) {
            h[i].moveLegs();
            h[i].moveLegsVeryFast();
        }
        System.out.println(" ");
    }
}
