package ru.innopolis.stc.java.lesson8.task1;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);
    static String firstNumber;
    static String secondNumber;
    static double result;
    static int action;

    public static void main(String[] args) {
        /*1. Поэксперементировать с ключевым словом final

2. Реализовать класс Calculator, который будет содержать статические методы для операций вычитания,
сложения, умножения, деления и взятия процента от числа. Класс должен работать как с целыми числами, так и с дробями.

3. Реализовать класс в конструкторе которого будет счетчик количества создаваемых объектов.
Написать метод для получения информации о количестве.

4. Реализовать два класса: договор и акт. В каждом сделать поля: номер, дата, список товаров (массив строк).
Написать класс со статическим методом конвертации договора в акт (на вход передавать договор, на выходе получаем акт).
*/
        getGeneral();
    }

    static double classifyNumber(String t) {
        if ((firstNumber.contains(".") | secondNumber.contains(".")) | action == (2|4)) {
            double numberDouble = Double.parseDouble(t);
            return numberDouble;
        } else {
            int numberInt = Integer.parseInt(t);
            return numberInt;
        }
    }

    static double returnDouble(String t) {
        double numberDouble = Double.parseDouble(t);
        return numberDouble;
    }

    //static double returnInt(String t) {}

    static void setFirstNumber() {
        firstNumber = in.nextLine();
    }

    static void setSecondNumber() {
        secondNumber = in.nextLine();
    }

    static void showResult() {
        int u = in.nextInt();
        System.out.println("Результат вычислений:" + action(classifyNumber(firstNumber), classifyNumber(secondNumber)));
    }

    static void getGeneral() {
        System.out.println("Введите число, с которым хотите произвести операции");
        setFirstNumber();
        resumeOperations();
    }

    static void resumeOperations() {
        System.out.println("Введите следующее число для операции");
        setSecondNumber();
        System.out.println("Что вы хотите сделать с этим числом? Введите цифру");
        System.out.println("1 - Сложение, 2 - вычитание, 3 - перемножение, 4 - взятие " + secondNumber + "% от " + firstNumber);
        showResult();
        repeatOperations();
    }

    static void repeatOperations() {
        System.out.println("Введите \n1 - если хотите продолжить операции с этим числом; " +
                "\n2 - если хотите начать операции заново; " +
                "\n3 - если хотите завершить");
        switch (in.nextInt()) {
            case 1:
                resumeOperations();
                break;
            case 2:
                getGeneral();
                break;
            default:
                break;

        }
    }

    static double action(Double firstNumber, Double secondNumber) {
        switch (action) {
            case 1:
                return Calculator.summ(firstNumber, secondNumber);
            case 2:
                return Calculator.subtraction(firstNumber, secondNumber);
            case 3:
                return Calculator.multiplication(firstNumber, secondNumber);
            case 4:
                return Calculator.procentation(firstNumber, secondNumber);
            default:
                System.out.println("неправильный номер операции, попробуйте еще раз");
        }
        return 0;
    }

    static double action(int firstNumber, int secondNumber, int u) {
        switch (action) {
            case 1:
                return Calculator.summ(firstNumber, secondNumber);
            case 2:
                return Calculator.subtraction(firstNumber, secondNumber);
            case 3:
                return Calculator.multiplication(firstNumber, secondNumber);
            case 4:
                return Calculator.procentation(firstNumber, secondNumber);
            default:
                System.out.println("неправильный номер операции, попробуйте еще раз");
        }
        return 0;
    }
}

