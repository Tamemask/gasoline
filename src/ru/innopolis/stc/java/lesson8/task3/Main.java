package ru.innopolis.stc.java.lesson8.task3;

public class Main {
    public static void main(String[] args) {
        Conrtact c = new Conrtact();
        Act s = new Act();
        c.setNumber(3);
        Converter.Convert(c, s);
        System.out.println(s.getNumber());
    }
}
