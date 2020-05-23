package ru.innopolis.stc.java.lesson7.task1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;

public class Feedback {
    public static Scanner in = new Scanner(System.in);
    public static int productNumber;
    public static int paidSumm;


    public static void getProductNumber() {
        System.out.println("Какой напиток хотите купить?");
        int i = 1;
        for (Drink d : Drink.values()) {
            System.out.println("если " + d + " - введите " + i);
            i++;
        }
        productNumber = in.nextInt();
    }

    public static void showProductPrice() {
        Product p = new Product(productNumber);
    }

    public enum Drink {COLA, ORANGE, MINERAL, LEMONADE;}

    public static class Product {
        static int priceOfProduct;

        Product(int productNumber) {
            //Main.log.fine("productNumber in Product: {}", productNumber);
            switch (productNumber) {
                case 1:
                    setPrice(100);
                    break;
                case 2:
                    setPrice(180);
                    break;
                case 3:
                    setPrice(150);
                    break;
                case 4:
                    setPrice(50);
                    break;
                default:
                    System.out.println("Введен не корректный номер, попробуйте еще раз.");
                    getProductNumber();
            }
            Main.log.log(Level.FINE,"ran showPrice");
            showPrice();
            Main.log.log(Level.FINE,"paidSumm set to: {}", paidSumm);
            paidSumm = in.nextInt();
        }

        void setPrice(int price) {
            Main.log.log(Level.FINE,"priceOfProduct set to: {}", price);
            priceOfProduct = price;
        }

        void showPrice() {
            System.out.println("Введите " + priceOfProduct + " рублей");
        }

        public static void assertSumms() {
            if (paidSumm >= priceOfProduct) {
                Main.log.log(Level.FINE,"give a food and sdacha");
                System.out.println("Заберите товар. Ваша сдача " + (paidSumm - priceOfProduct) + " рублей");
            } else {
                Main.log.log(Level.FINE,"paidSumm <= priceOfProduct, ran: takeMoreOrRefund()");
                takeMoreOrRefund();
            }
        }

        private static void takeMoreOrRefund() {
            int difference = priceOfProduct - paidSumm;
            System.out.println("Не хватает " + difference + " рублей");
            System.out.println("Введите 1 чтобы внести еще средства. введите другое число, чтобы вернуть себе деньги");
            int decision = in.nextInt();
            switch (decision) {
                case 1:
                    Main.log.log(Level.FINE,"вывести на экран ", difference);
                    System.out.println("Введите " + difference + " рублей или больше");
                    Main.log.log(Level.FINE,"run takeMore()");
                    takeMore();
                    break;
                default:
                    System.out.println("Возврат " + paidSumm + " рублей");
            }
        }


        private static void takeMore() {
            int more = in.nextInt();
            paidSumm += more;
            assertSumms();
        }


    }
}
