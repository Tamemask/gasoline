package ru.innopolis.stc.java.lesson22;

import java.util.Comparator;

public class PersonSuperComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2){
        if (o1.getName().compareTo(o2.getName()) != 0) {
            return o1.getName().compareTo(o2.getName());
        } else {
            return o1.getAge() - o2.getAge();
        }
    }
}
