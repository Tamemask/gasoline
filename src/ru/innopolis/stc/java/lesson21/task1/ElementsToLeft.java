package ru.innopolis.stc.java.lesson21.task1;

public class ElementsToLeft {

    public static void toLeft(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j < array[i].length-1) {
                    array[i][j] = array[i][j +1];
                System.out.print(array[i][j] + "\t");
                }
            }
            if (i < array.length - 1) {
                System.out.println(array[i][array[i].length - 1] = array[i + 1][0]);
            }
            else {
                System.out.print(0);
            }
        }
    }

}
