package io.javabrain.unit2;

import io.javabrain.unit1.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterfaceExample {

        public static void main(String[] args){

            List<Person> people = Arrays.asList(
                    new Person("Charles" , "Dickens" ,60),
                    new Person("Lewis" , "Carroll" ,42),
                    new Person("Thomas" , "Carlylle" ,51),
                    new Person("Charlotte" , "Bronte" ,45),
                    new Person("Matthew" , "Arnold" ,39)
            );

            //sort people list by last name

            Collections.sort(people , ( o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));

          //printAll(people);
            printConditional(people ,p -> true ,p -> System.out.println("This is the list **"+p.getLastName()));
            //System.out.println("This is the list"+people);
            System.out.println("Empty line");
            //print peorple who have last name with c


            printConditional(people ,p -> p.getLastName().startsWith("C") , p -> System.out.println("This is the list"+p));

            //print name with condition
            printConditionalWithGivenInterface(people ,p -> p.getFirstName().startsWith("M"));


        }


        private static void printConditional(List<Person> people , Predicate<Person> c , Consumer<Person> consumer){
            for(Person p :people){
                if(c.test(p)){
                    consumer.accept(p);
                }

            }
        }


    private static void printConditionalWithGivenInterface(List<Person> people , Predicate<Person> c){
        for(Person p :people){
            if(c.test(p)){
                System.out.println("This is the list"+p);
            }

        }
    }

}