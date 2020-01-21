package chapter20.test;

public class MyRun2 implements java.lang.Runnable {
    public void run(){
        try{
            for (int i = 0; i < 10 && !Thread.interrupted(); i++){
                System.out.println("Goodbye");
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException exception){

        }
    }
}
