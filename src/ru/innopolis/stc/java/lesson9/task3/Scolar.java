package ru.innopolis.stc.java.lesson9.task3;

public class Scolar extends Human{
    @Override
    public void moveLegs(){
        System.out.println("Scolar run to the lecture");
    }

    @Override
    public void moveLegsVeryFast() {
        System.out.println("Scolar run to the date");
    }


    @Override
    public void swimAsItCan() {
        System.out.println("Scolar Swim");
    }

    @Override
    public void swimUnderWater() {
        System.out.println("Scolar swim like axe");
        Human h = new Scolar();

    }
}
