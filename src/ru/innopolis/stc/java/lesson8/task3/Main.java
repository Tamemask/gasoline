package ru.innopolis.stc.java.lesson8.task3;

public class Main {
    /*В третьей задаче данные классов недостаточно инкапсулированы.
    Вообще поля всегда по умолчанию делай private, если делаешь иначе - должен уметь объяснить почему.
    При конвертации необходимо создавать новый объект акта, а на вход получать только контракт.*/
    public static void main(String[] args) {
        Conrtact c = new Conrtact();
        c.setNumber(3);
        System.out.println(Converter.Convert(c).getNumber());
    }
}
