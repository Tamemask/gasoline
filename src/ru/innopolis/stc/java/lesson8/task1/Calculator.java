package ru.innopolis.stc.java.lesson8.task1;

import java.util.Scanner;
/*Одним из навыков хорошего java разработчика является создание классов
с четко очерченными зонами ответственности. Не должно быть универсальных классов
выполняющих много различных задач.
Один класс взаимодействует с пользователем,
другой хранит данные,
третий обрабатывает данные и т.д.

Поэтому прошу в классе калькулятора оставить только
методы выполнения операций.
Ввод данных пользователя,
передачу в калькулятор и
вывод результата
нужно вынести в другой класс - класс Main например.

В классе калькулятора должны быть отдельные методы
для работы с целыми
методы для работы с дробными числами.
Сумма двух целых чисел возвращает целое число и т.д.,
но с одним исключением - деление двух целых чисел возвращает дробное число. */
public class Calculator {

    static Scanner in = new Scanner(System.in);
    static double numbers[];
    static double firstNumber;
    static double secondNumber;
    static double result;

    public static void setFirstNumber() {
        firstNumber = in.nextDouble();
    }

    public static void setSecondNumber() {
        secondNumber = in.nextDouble();
    }

    public static void action() {
        switch (in.nextInt()) {
            case 1:
                summ();
                break;
            case 2:
                subtraction();
                break;
            case 3:
                multiplication();
                break;
            case 4:
                procentation();
                break;
        }
    }

    public static void setNumbresAmount() {
        numbers = new double[in.nextInt()];
    }

    public static void getNumbers() {
        for (double n : numbers) {
            int l = 0;
            while (l <= numbers.length) {
                System.out.println("Введите " + (l + 1) + "-е число, с которым хотите произвести операции");
                numbers[l] = in.nextDouble();
            }
        }
    }


    static void summ() {
        firstNumber += secondNumber;
    }

    static void subtraction() {
        firstNumber -= secondNumber;
    }

    static void multiplication() {
        firstNumber *= secondNumber;
    }

    static void procentation() {
        firstNumber = (firstNumber * secondNumber) * 0.01;
    }

    public static void showResult() {
        System.out.println("Результат вычислений:" + firstNumber);
    }

    public static void getGeneral() {
        System.out.println("Введите число, с которым хотите произвести операции");
        Calculator.setFirstNumber();
        resumeOperations();
    }

    public static void resumeOperations() {
        System.out.println("Введите следующее число для операции");
        Calculator.setSecondNumber();
        System.out.println("Что вы хотите сделать с этим числом? Введите цифру");
        System.out.println("1 - Сложение, 2 - вычитание, 3 - перемножение, 4 - взятие от него процента");
        Calculator.action();
        System.out.println("Результат операции над числами:");
        Calculator.showResult();
        repeatOperations();
    }

    public static void repeatOperations() {
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
                default:break;

        }
    }
}
