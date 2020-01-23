package chapter20_multithreading.pe.P20_8;

public class Read4 implements Runnable{
//    ReadObj readObj;
//
//    public Read4(ReadObj readObj){
//        this.readObj = readObj;
//    }

    @Override
    public void run() {
        ReadObj.read("F:\\java\\P20_7fil4.txt");
    }
}
