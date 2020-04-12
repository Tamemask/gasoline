package ru.innopolis.stc.java.lesson8.task1;

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

    public static int summ(int firstNumber, int secondNumber) {
        firstNumber += secondNumber;
        return firstNumber;
    }

    public static int multiplication(int firstNumber, int secondNumber) {
        firstNumber *= secondNumber;
        return firstNumber;
    }


    public static double summ(double firstNumber, double secondNumber) {
        firstNumber += secondNumber;
        return firstNumber;
    }

    public static double subtraction(double firstNumber, double secondNumber) {
        firstNumber -= secondNumber;
        return firstNumber;
    }

    public static double multiplication(double firstNumber, double secondNumber) {
        firstNumber *= secondNumber;
        return firstNumber;
    }

    /**
     * написать джавадок к методу
     * @return
     */
    public static double procentation(double firstNumber, double secondNumber) {
        firstNumber = (firstNumber * secondNumber) * 0.01;
        return firstNumber;
    }
}
