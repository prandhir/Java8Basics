package io.javabrain.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Unit1ExcerciseSolutionJava8 {

        public static void main(String[] args){

            List<Person> people = Arrays.asList(
                    new Person("Charles" , "Dickens" ,60),
                    new Person("Lewis" , "Carroll" ,42),
                    new Person("Thomas" , "Carlylle" ,51),
                    new Person("Charlotte" , "Bronte" ,45),
                    new Person("Matthew" , "Arnold" ,39)
            );

            //sort people list by last name
            /*Collections.sort(people , new Comparator<Person>( ) {
                @Override
                public int compare(Person o1, Person o2) {

                    return o1.getLastName().compareTo(o2.getLastName());
                }
            });*/
            Collections.sort(people , ( o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));

          //printAll(people);
            printConditional(people ,p -> true);
            //System.out.println("This is the list"+people);
            System.out.println("Empty line");
            //print peorple who have last name with c
            /*printCName(people);*/

            //print name with condition
        /*    printConditional(people , new Condition() {
                @Override
                public boolean test(Person p) {
                    return p.getLastName().startsWith("A");
                }
            });*/

            printConditional(people ,p -> p.getLastName().startsWith("C"));

            //print name with condition
            printConditionalWithGivenInterface(people ,p -> p.getFirstName().startsWith("M"));

          /*  printConditional(people ,new Condition() {
                @Override
                public boolean test(Person p) {
                    return p.getFirstName().startsWith("A");
                }
            });*/
        }

/*        private static void printCName(List<Person> people ){
            for(Person p :people){
                if(p.getLastName().startsWith("C")){
                    System.out.println("This is the list"+p);
                }

            }
        }*/

        private static void printConditional(List<Person> people , Condition c){
            for(Person p :people){
                if(c.test(p)){
                    System.out.println("This is the list"+p);
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
       /* private static void printAll(List<Person> people ){
            for(Person p :people){
                System.out.println("This is the list"+p);
            }
        }*/

        interface Condition{
            boolean test(Person p);
        }

}
