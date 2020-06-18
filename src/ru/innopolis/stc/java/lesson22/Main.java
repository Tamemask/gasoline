package ru.innopolis.stc.java.lesson22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> students = new ArrayList<>();

        Person misha = new Person("Misha", 22);
        Person misha1 = new Person("Misha", 19);
        Person masha = new Person("Masha", 20);
        Person sasha = new Person("Sasha", 21);

        students.add(misha);
        students.add(misha1);
        students.add(masha);
        students.add(sasha);



        Comparator<Person> cm = new PersonSuperComparator();
        students.sort(cm);
        for (int i = 0; i < students.size(); i++)
            System.out.println(students.get(i).getName() + "\t" + students.get(i).getAge());
        System.out.println();

    }
}
