package chapter20_.pe.P20_7v2;

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
