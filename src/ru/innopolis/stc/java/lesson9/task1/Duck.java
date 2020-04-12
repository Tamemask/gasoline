package ru.innopolis.stc.java.lesson9.task1;

import ru.innopolis.stc.java.lesson9.task2.Fly;
import ru.innopolis.stc.java.lesson9.task2.Run;
import ru.innopolis.stc.java.lesson9.task2.Swim;

public class Duck extends Animal implements Fly, Run, Swim {
    String name;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String donald) {
        name = donald;
    }

    @Override
    public void moveWings() {
        System.out.println("Duck FLY. Not so aristocratic bird, but at least it can feel the fly.");
    }

    @Override
    public void moveLegs() {
        System.out.println("Duck RUNNING. Not so fast, it has very short legs.");
    }

    @Override
    public void moveLegsVeryFast() {
        System.out.println("it trying");
    }

    @Override
    public void swimAsItCan() {
        System.out.println("Duck SWIM. Not so cool, but it exists and can't kill you at least");
    }

    @Override
    public void swimUnderWater() {

    }
}
