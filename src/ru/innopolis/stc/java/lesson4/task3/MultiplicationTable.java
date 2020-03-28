package ru.innopolis.stc.java.lesson4.task3;

public class MultiplicationTable {
    public static void main(String[] args) {
        int[][] table = new int[10][10];
        Integer i = new Integer(1);

        System.out.print(" ");
        for (int s = i; s < 10; s++) {
            int j;
            System.out.println(" ");
            for (j = 1; j < 10; j++) {
                int f = 0;
                table[j][s] = j;
                System.out.print(table[j][s]*s + " ");
            }
        }

    }
}
