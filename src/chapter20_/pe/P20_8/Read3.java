package chapter20_.pe.P20_8;

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
