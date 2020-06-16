package ru.innopolis.stc.java.lesson22;

import java.util.Comparator;

interface PersonAgeComparator extends Comparator<Person> {
    @Override
    int compare(Person o1, Person o2);

    int thenComparing(Person o1, Person o2);
}
