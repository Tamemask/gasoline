package part1.lesson03.task02;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        Boolean i = true;


        int purpose = rand.nextInt(101);
        System.out.println("Угадайте число.");

        while (i) {
            System.out.println("Введите число от 0 до 100");
            int fromPlayer = in.nextInt();
            //i = fromPlayer.equls(purpose);
            if (fromPlayer == purpose) {
                i = false;
                System.out.println("верно!");
            }
            else if (fromPlayer > purpose) {
                System.out.println("меньше");
            }
            else {
                System.out.println("больше");
            }
        }
    }

}
