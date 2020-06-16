package ru.innopolis.stc.java.lesson22;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person o) {
        return this.getAge() - o.getAge();
    }
}
