package chapter20_.pe.P20_8;

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