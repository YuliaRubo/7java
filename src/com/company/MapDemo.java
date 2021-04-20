package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Person c1 = new Person("Алиса", "Петрова", Gender.FEMALE);
        Person c2 = new Person("Марк", "Петров", Gender.MALE);
        Person c3 = new Person("Мила", "Петрова", Gender.FEMALE);
        Person c4 = new Person("Вася", "Сидоров", Gender.MALE);
        Person c5 = new Person("Марат", "Петров", Gender.MALE);

        Map< Integer, Person> mapPerson = new HashMap<>();
        mapPerson.put(1, c1);
        mapPerson.put(2, c2);
        mapPerson.put(3, c3);
        mapPerson.put(4, c4);
        mapPerson.put(5, c5);

        System.out.println(mapPerson.size());
        for (Map.Entry<Integer, Person> keyValuePair : mapPerson.entrySet()) {
            System.out.println(keyValuePair.getKey() + " - " + keyValuePair.getValue());
    }
}}

