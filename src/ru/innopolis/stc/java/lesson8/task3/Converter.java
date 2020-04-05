package ru.innopolis.stc.java.lesson8.task3;

public class Converter {
    /*
    * Реализовать два класса: договор и акт.
    * В каждом сделать поля: номер, дата, список товаров (массив строк).
    * Написать класс со статическим методом конвертации договора в акт (на вход передавать договор, на выходе получаем акт).*/
    public static Act Convert(Conrtact c) {
        Act a = new Act();
        a.setArray(c.getArray());
        a.setDate(c.getDate());
        a.setNumber(c.getNumber());
        return a;
    }
}
