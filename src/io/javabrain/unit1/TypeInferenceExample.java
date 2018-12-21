package io.javabrain.unit1;

public class TypeInferenceExample {


    public static void printLambda(lambdaInterface l){
        System.out.println(l.getLength("this is string"));
    }


    public static void main(String[] args) {

        printLambda(s -> s.length());
    }


    interface lambdaInterface {
        int getLength(String s);
    }

}