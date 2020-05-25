package ru.innopolis.stc.java.lesson7.task1;

import java.io.IOException;
import java.util.logging.*;

public class Main {

    /*
    * Реализовать программу «Вендинговый автомат», которая позволит:
    * Посмотреть меню напитков
    * Внести деньги на внутренний счет
    * Выбрать номер напитка и получить его, если на счету достаточно средств.
    * Программа должна обрабатывать следующие ситуации:
    * Пользователь не внес деньги
    * Пользователь выбрал более дорогой напиток, чем внесено денег
    * Пользователь выбрал несуществующий номер напитка
    * Для хранения напитков предлагается использовать массив с enum. У напитка должна быть цена и название.
    * - Переписать проект с урока (вендинговый автомат) используя конструктор, перечисления и
взаимодействие с пользователем.
* */

    //можно сделать несколько операций до выхода из программы - например купить несколько напитков
    //отделить операцию выбора от операции внесения
    //проверка, что денег достаточно

    /**
     *
     * @param args
     */
    public final static Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {
        LogManager.getLogManager().reset();
        log.setLevel(Level.ALL);

        ConsoleHandler ch = new ConsoleHandler();
        ch.setLevel(Level.ALL);
        log.addHandler(ch);

        try{
            FileHandler fh = new FileHandler("MyFile.log", true);
            fh.setLevel(Level.ALL);
            log.addHandler(fh);
        }
        catch (IOException e) {
            log.log(Level.SEVERE, "File logger is not working", e);
        }
       /* try {
            Properties prop = new Properties();
            LogManager.getLogManager().readConfiguration(
                    Main.class.getResourceAsStream("src\\ru\\innopolis\\stc\\java\\lesson14\\logging.properties"));
        } catch (IOException e) {
            System.err.println("Could not setup logger configuration: " + e.toString());
        }*/
        log.setLevel(Level.ALL);

        log.info("Run getProductNumber();");
        Feedback.getProductNumber();
        log.info("Run showProductPrice();");
        Feedback.showProductPrice();
        log.info("Run Product.assertSumms();");
        Feedback.Product.assertSumms();
    }


}
