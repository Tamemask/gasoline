package ru.innopolis.stc.java.lesson22;

import java.util.Comparator;

public class PersonSuperComparator implements PersonAgeComparator {

    @Override
    public int compare(Person o1, Person o2){
        return o1.getName().compareTo(o2.getName());
    }



    @Override
    public int thenComparing(Person o1, Person o2){
        return o1.getAge() - o2.getAge();
    }
}
