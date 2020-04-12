package ru.innopolis.stc.java.lesson9.task1;

public class Bear extends Animal implements Run, Swim {
    String name;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void moveLegs() {
        System.out.println("Bear RUNNING, his legs impressively strong");
    }

    @Override
    public void swimAsItCan() {
        System.out.println("Bear SWIM, water can't save you from this muscular mountain, ROAR!");
    }
}
