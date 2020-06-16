package ru.innopolis.stc.java.lesson22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> students = new ArrayList<>();

        Person misha = new Person("Misha", 22);
        Person masha = new Person("Masha", 20);
        Person sasha = new Person("Sasha", 21);

        students.add(misha);
        students.add(masha);
        students.add(sasha);

/*        Collections.sort(students);
        for (int i = 0; i < students.size(); i++)
        System.out.println(students.get(i).getName());
        System.out.println();*/

        Comparator personAgeComparator = new PersonSuperComparator();
        Collections.sort(students, personAgeComparator);
        for (int i = 0; i < students.size(); i++)
            System.out.println(students.get(i).getName());
        System.out.println();

    }
}
