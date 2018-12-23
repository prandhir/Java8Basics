package io.javabrain.unit3;

import io.javabrain.unit1.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlylle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        //sort people list by last name.
        printConditional(people ,p -> true ,p -> System.out.println(p));
        printConditional(people ,p -> true ,System.out::println);

    }


    private static void printConditional(List<Person> people, Predicate<Person> c, Consumer<Person> consumer) {
        for (Person p : people) {
            if (c.test(p)) {
                consumer.accept(p);
            }

        }
    }

}

