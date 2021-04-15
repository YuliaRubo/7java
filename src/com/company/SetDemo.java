package com.company;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Person b1 = new Person("Алиса", "Петрова", Gender.FEMALE);
        Person b2 = new Person("Марк", "Петров", Gender.MALE);
        Person b3 = new Person("Алиса", "Петрова", Gender.FEMALE);
        Person b4 = new Person("Вася", "Сидоров", Gender.MALE);
        Person b5 = new Person("Марк", "Петров", Gender.MALE);

        HashSet<Person> PersonHashSet = new HashSet<>();
        PersonHashSet.add(b1);
        PersonHashSet.add(b2);
        PersonHashSet.add(b3);
        PersonHashSet.add(b4);
        PersonHashSet.add(b5);

        System.out.println(PersonHashSet.size());
        System.out.println( PersonHashSet.toString());

    }
}