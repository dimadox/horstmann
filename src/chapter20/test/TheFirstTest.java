package chapter20.test;

public class TheFirstTest {
    public static void main(String[] args) {
        MyRun run1 = new MyRun();
        MyRun2 run2 = new MyRun2();
        MyRun3 run3 = new MyRun3();
        MyRun4 run4 = new MyRun4();
        MyRun5 run5 = new MyRun5();

        Thread t1 = new Thread(run1);
        Thread t2 = new Thread(run2);
        Thread t3 = new Thread(run3);
        Thread t4 = new Thread(run4);
        Thread t5 = new Thread(run5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }
}