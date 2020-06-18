package ru.innopolis.stc.java.lesson21.task2;

public class MassiveReverser {
    public void revers(int[] array) {
        int order = array.length;
        int newOrder = 0;
        int[] newArray = new int[order];
        printArray(array);
        for (int i = order-1; i >= 0; i --) {
            newArray[newOrder] = array [i];
            newOrder++;
        }
        System.out.println();
        printArray(newArray);
        for (int i = order-1; i >= 0; i --) {
            array [i] = newArray[i];
        }
        System.out.println();
        printArray(array);
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
