package chapter20_.pe.P20_7;

public class Read1 implements Runnable{
//    ReadObj readObj;
//
//    public Read1(ReadObj readObj){
//        this.readObj = readObj;
//    }

    @Override
    public void run() {
        ReadObj.read("F:\\java\\P20_7fil1.txt");
    }
}
