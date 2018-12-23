package io.javabrain.unit3;

import io.javabrain.unit1.Person;

import java.util.Arrays;
import java.util.List;

public class StreamsExample {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlylle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        //streams with the lambda expression
        people.stream()
                .filter(p->p.getLastName().startsWith("C"))
                .forEach(p -> System.out.println(p));

        //count operation
        Long count = people.stream()
                .filter(p->p.getLastName().startsWith("C"))
                .count();

        System.out.println(count);
    }

}
