package ru.innopolis.stc.java.lesson8.task2;

public class Counter {
    /*Реализовать класс в конструкторе которого будет счетчик количества создаваемых объектов. Написать метод для получения информации о количестве.*/
    public static int numberOfClones;
    Counter(){
        numberOfClones++;
    }
    public static int getNumberOfClones() {
        return numberOfClones;
    }
}
