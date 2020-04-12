package ru.innopolis.stc.java.lesson9.task1;

public class Unicorn extends Animal implements Run, Fly, Swim {
    String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void moveLegs() {
        System.out.println("Unicorn RUNNING");
    }

    @Override
    public void moveWings() {
        System.out.println("Unicorn FLY without wings, but he has a rainbow");
    }


    @Override
    public void swimAsItCan() {
        System.out.println("Unicorn SWIM on serfing");
    }

    public void setName(String name) {
        this.name = name;
    }
}
