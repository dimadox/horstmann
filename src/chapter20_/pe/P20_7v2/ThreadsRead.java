package chapter20_.pe.P20_7v2;

public class ThreadsRead {
    public static void main(String[] args) {
        Read1 read1 = new Read1();
        Read2 read2 = new Read2();
        Read3 read3 = new Read3();
        Read4 read4 = new Read4();
        Read5 read5 = new Read5();

        Thread thread1 = new Thread(read1);
        Thread thread2 = new Thread(read2);
        Thread thread3 = new Thread(read3);
        Thread thread4 = new Thread(read4);
        Thread thread5 = new Thread(read5);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }


}
