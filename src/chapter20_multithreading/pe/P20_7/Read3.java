package chapter20_multithreading.pe.P20_7;

public class Read3 implements Runnable{
//    ReadObj readObj;
//
//    public Read3(ReadObj readObj){
//        this.readObj = readObj;
//    }

    @Override
    public void run() {
        ReadObj.read("F:\\java\\P20_7fil3.txt");
    }
}
