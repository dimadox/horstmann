package chapter20_.test;

public class MyRun3 implements java.lang.Runnable {
    public void run(){
        try{
            for (int i = 0; i < 10 && !Thread.interrupted(); i++){
                System.out.println("111");
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException exception){

        }
    }
}
