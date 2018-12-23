package io.javabrain.unit3;

public class MethodReference {
    public static void main(String[] args){

        //lambda used to run method from thread interface
        //method execution
        Thread myThread = new Thread(()-> printMessage());
        myThread.run();


        //method reference.
        Thread myThread2 =  new Thread(MethodReference::printMessage);
        myThread2.start();
    }

    public static void printMessage(){
        System.out.println("from the thread");
    }
}
