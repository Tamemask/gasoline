package part1.lesson01.task01.separate1;

import java.util.Scanner;

 public class Main {

    public static void main(String[] args) {
        double price;
        double count;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите стоимость единицы товара");
        price = in.nextDouble();
        System.out.println("Введите количество единиц товара");
        count = in.nextDouble();

        double total = price*count;
        System.out.println("общая стоимость равна " + total);
    }
}
