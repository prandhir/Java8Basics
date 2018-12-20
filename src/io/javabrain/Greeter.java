package io.javabrain;

public class Greeter {

    public void greeter(Greeting greeting){
        greeting.greet();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        SpanishGreeting spanishGreeting= new SpanishGreeting();
        greeter.greeter(spanishGreeting);
    }
}
