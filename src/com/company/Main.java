package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Person a1 = new Person("Лиза", "Петрова",Gender.FEMALE);
        Person a2 = new Person("Алиса", "Лисья", Gender.FEMALE);
        Person a3= new Person("Алексей","Попов", Gender.MALE);
        Person a4 = new Person("Марк", "Мартов",Gender.MALE);
        Person a5 = new Person("Лев","Полин", Gender.MALE);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(a1);
        persons.add(a2);
        persons.add(a3);
        persons.add(a4);
        persons.add(a5);
        System.out.println(persons.size());
        System.out.println( persons.toString());


    }
}
