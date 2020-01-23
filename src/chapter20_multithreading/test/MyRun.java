package chapter20_multithreading.test;

public class MyRun implements java.lang.Runnable {
    public void run(){
        try{
            for (int i = 0; i < 10 && !Thread.interrupted(); i++){
                System.out.println("Hello");
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException exception){

        }
    }
}
