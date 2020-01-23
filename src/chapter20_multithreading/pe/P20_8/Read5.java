package chapter20_multithreading.pe.P20_8;

public class Read5 implements Runnable{
//    ReadObj readObj;
//
//    public Read5(ReadObj readObj){
//        this.readObj = readObj;
//    }

    @Override
    public void run() {
        ReadObj.read("F:\\java\\P20_7fil5.txt");
    }
}
