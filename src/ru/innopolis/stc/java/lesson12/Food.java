package ru.innopolis.stc.java.lesson12;

import java.util.Random;

enum Food {

    CARROT("Морковь"),
    APPLE("Яблоко"),
    PORRIDGE("Каша");

    private String name;

    Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public static Food getRandomFood() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
