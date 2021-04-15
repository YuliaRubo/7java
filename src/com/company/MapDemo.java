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

        Map< Person, Integer> mapPerson = new HashMap<>();
        mapPerson.put(c1, 1);
        mapPerson.put(c2, 2);
        mapPerson.put(c3, 3);
        mapPerson.put(c4, 4);
        mapPerson.put(c5, 5);

        System.out.println(mapPerson.size());
        for (Map.Entry<Person, Integer> keyValuePair : mapPerson.entrySet()) {
            System.out.println(keyValuePair.getKey() + " - " + keyValuePair.getValue());
    }
}}

