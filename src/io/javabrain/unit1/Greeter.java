package io.javabrain.unit1;

public class Greeter {

    public void greetNow(Greeting greeting){
        greeting.greet();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        //normal implementation
        Greeting spanishGreeting= new SpanishGreeting();

        //Lambda implementation
        Greeting myLambdaGreeting = () -> System.out.println("Hello world from Lambda");

        //inner class implementation
        Greeting innerClassGreeting = new Greeting(){
            public void greet(){
                System.out.println("Hello world from inner class");
            };
        };

        greeter.greetNow(myLambdaGreeting);
        myLambdaGreeting.greet();
        innerClassGreeting.greet();

    }
}
