package ru.innopolis.stc.java.lesson8.task2;

public class Counter {
    /*Реализовать класс в конструкторе которого будет счетчик количества создаваемых объектов. Написать метод для получения информации о количестве.*/
    private static int numberOfClones;
    private static int numberOfNewClones;

    Counter() {
        numberOfClones ++;
    }

    public static void createCounters(int counter) {
        for (int i = counter; i > 0; i--){
            new Counter();
        }
    }

    public static int getNumberOfClones() {
        return numberOfClones;
    }
}
