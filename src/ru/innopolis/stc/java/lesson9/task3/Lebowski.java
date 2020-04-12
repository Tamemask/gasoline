package ru.innopolis.stc.java.lesson9.task3;

public class Lebowski extends Human {
    @Override
    public void moveLegs() {
        System.out.println("Lebowski dont run");
    }

    @Override
    public void moveLegsVeryFast() {
        System.out.println("Lebowski dont run fust");
    }

    @Override
    public void swimAsItCan() {
        System.out.println("Lebowski dont swim");
    }

    @Override
    public void swimUnderWater() {
        System.out.println("Lebowski dont swim under water");
    }
}
