package chapter20_multithreading.pe.P20_7;

public class Read2 implements Runnable{
//    ReadObj readObj;
//
//    public Read2(ReadObj readObj){
//        this.readObj = readObj;
//    }

    @Override
    public void run() {
        ReadObj.read("F:\\java\\P20_7fil2.txt");
    }
}
