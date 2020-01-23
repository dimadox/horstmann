package chapter8_objects_and_classes.p;

public class Class8_1 {
    int value = 0;

    public void count(){
        value++;
    }

    public int getValue(){
        return value;
    }

    public void undo(){
        value--;
    }

    public void undo2(){
        if (value>0){
            value--;
        }
        else {
            System.err.println("Impossible value");
        }

    }

    public void reset(){
        value = 0;
    }




    public static void main(String[] args) {
        Class8_1 counter = new Class8_1();
        counter.count();
        counter.undo2();
        counter.undo2();
        System.out.println(counter.getValue());
    }
}
