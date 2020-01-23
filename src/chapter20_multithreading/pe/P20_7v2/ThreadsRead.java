package chapter20_multithreading.pe.P20_7v2;

public class ThreadsRead {
    public static void main(String[] args) {

        Read [] arrayRead = {new Read("F:\\java\\P20_7fil1.txt") , new Read("F:\\java\\P20_7fil2.txt") , new Read("F:\\java\\P20_7fil3.txt")};

        Thread [] arrayOfThread = {new Thread(arrayRead[0]), new Thread(arrayRead[1]), new Thread(arrayRead[2])};

        arrayOfThread[0].start();
        arrayOfThread[1].start();
        arrayOfThread[2].start();
    }


}
