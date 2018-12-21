package io.javabrain.unit1;

public class RunnableExample {
    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running from thread 1");
            }
        });

        myThread.run();

        Runnable myrunnableLambda = () -> System.out.println("This is from labda thread.");

        Thread myThread2 = new Thread(myrunnableLambda);

        myThread2.run();
    }
}
