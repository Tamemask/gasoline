package ru.innopolis.stc.java.lesson12;

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
}
