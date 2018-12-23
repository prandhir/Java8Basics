package io.javabrain.unit3;

import io.javabrain.unit1.Person;

import java.util.Arrays;
import java.util.List;

public class IterateList {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlylle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        System.out.println("\n regular loop");
        for(Person person: people){
            System.out.println(person);
        }

        System.out.println("\n Lambda loop");
        people.forEach((p)-> System.out.println(p));

        System.out.println("\n Lambda loop with method reference");
        people.forEach( System.out :: println);
    }
}
