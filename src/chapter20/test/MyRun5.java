package chapter20.test;

public class MyRun5 implements java.lang.Runnable {
    public void run(){
        try{
            for (int i = 0; i < 10 && !Thread.interrupted(); i++){
                System.out.println("æææææææææ");
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException exception){

        }
    }
}
