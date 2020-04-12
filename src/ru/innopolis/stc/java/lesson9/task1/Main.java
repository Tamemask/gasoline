package ru.innopolis.stc.java.lesson9.task1;

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.setName("Donald");
        Bear bear = new Bear();
        bear.setName("Fyodor");
        Unicorn unicorn = new Unicorn();
        unicorn.setName("Star");
        System.out.println(duck.getName() + " " + bear.getName() + " " + unicorn.getName());
    }
}

