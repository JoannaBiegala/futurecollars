package com.futurecollars.lesson12.task4;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<Person> persons = new TreeSet<>();
        Person person1 = new Person("Anna", "Nowak", 1999, 170, 60);
        Person person2 = new Person("Hanna", "Nowakowska", 1989, 170, 67);
        Person person3 = new Person("Joanna", "Malinowska", 2000, 175, 70);
        Person person4 = new Person("Anna", "Kowalska", 1997, 160, 80);
        Person person5 = new Person("Barbara", "Nowak", 1999, 170, 60);
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);

        TreeSet<Person> personsSortedByHeight = new TreeSet<>
                (Comparator.comparingInt(Person::getHeight).thenComparingInt(System::identityHashCode));
        personsSortedByHeight.addAll(persons);
        printPersons(personsSortedByHeight, "height");

        TreeSet<Person> personsSortedByWeight = new TreeSet<>((o1, o2) -> {
            int result = Integer.compare(o2.getWeight(), o1.getWeight());
            if (result == 0) {
                result = Integer.compare(System.identityHashCode(o1),
                        System.identityHashCode(o2));
            }
            return result;
        });
        personsSortedByWeight.addAll(persons);
        printPersons(personsSortedByWeight, "weight reverse");

        printPersons(persons, "age (default and reverse)");
    }

    public static void printPersons(TreeSet<Person> persons, String order) {
        System.out.println("The persons sorted by " + order);
        for (Person person : persons) {
            System.out.println(person);
        }
    }

}
