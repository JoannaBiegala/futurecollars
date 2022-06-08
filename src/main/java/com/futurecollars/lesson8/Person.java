package com.futurecollars.lesson8;

import java.util.Objects;

public class Person {

    private final String firstName;
    private final String lastName;
    private final String occupation;
    private final int yearOfBirth;

    public Person(String firstName, String lastName, String occupation, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return yearOfBirth == person.yearOfBirth && firstName.equals(person.firstName) && lastName.equals(person.lastName) && occupation.equals(person.occupation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, occupation, yearOfBirth);
    }

}
