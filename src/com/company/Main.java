package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double gasolineAmount = 50;
        double rawSalary = 70000;
        double secondsAmount = 3600;

        System.out.println(Gasoline.total(gasolineAmount));
        System.out.println(Salary.pure(rawSalary));
        System.out.println(SecToHourConverter.toHour(secondsAmount));

    }
}
