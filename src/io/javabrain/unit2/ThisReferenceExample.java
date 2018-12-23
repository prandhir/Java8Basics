package io.javabrain.unit2;

public class ThisReferenceExample {

    public void runProcess(){
        doProcess(10, (int j) -> {
            System.out.println("This is Lambda example.." + j);
            //This will work cause this is lambda and This is reffered for class level , non static method
            System.out.println(this);
        });
    }

    public static void main(String[] args){
           ThisReferenceExample trf = new ThisReferenceExample();

        trf.doProcess(10, (int j) -> {
            System.out.println("This is Lambda example.." + j);
            //This will not work cause this is lambda and This is reffered for static main
            //System.out.println(this);
        });

        trf.runProcess();

        trf.doProcess(20,new Process(){

            @Override
            public void process(int i) {
                System.out.println("This is inner class" + i);
                //GThis will work cause this is treated as reference to the inner class.
                System.out.println(this);
            }

            @Override
            public String toString() {
                return "This is inner class";
            }
        });

    }

    private static void doProcess(int i , Process p){
        p.process(i);
    }

    interface Process{
        void process(int i);
    }

    @Override
    public String toString() {
        return "This is main class";
    }
}
