package part1.lesson01.task01.separate0;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double gasolineAmount = 50;
        double rawSalary = 70000;
        double secondsAmount = 3600;

        System.out.println("Введите количество литров бензина");

        System.out.println(Gasoline.total(gasolineAmount));
        System.out.println(Salary.pure(rawSalary));
        System.out.println(SecToHourConverter.toHour(secondsAmount));

    }
}
