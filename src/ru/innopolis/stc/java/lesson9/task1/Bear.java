package ru.innopolis.stc.java.lesson9.task1;

import ru.innopolis.stc.java.lesson9.task2.Run;
import ru.innopolis.stc.java.lesson9.task2.Swim;

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
    public void moveLegsVeryFast() {
        System.out.println("Bear RUNNING FAST!");
    }

    @Override
    public void swimAsItCan() {
        System.out.println("Bear SWIM, water can't save you from this muscular mountain, ROAR!");
    }

    @Override
    public void swimUnderWater() {

    }
}
