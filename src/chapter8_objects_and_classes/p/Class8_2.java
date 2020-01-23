package chapter8_objects_and_classes.p;
public class Class8_2 {
    int value = 0;
    int maximumValue = 0;

    public void setLimit(int maximum){
        maximumValue = maximum;
    }

    public void count(){
        if (maximumValue > value){
            value++;
        } else System.err.println("Limit exceeded");
    }

    public int getValue(){
        return value;
    }

    public void undo(){
        if (value>0){
            value--;
        }
        else System.err.println("Impossible value");
    }

    public void reset(){
        value = 0;
    }



    public static void main(String[] args) {
        Class8_2 counter = new Class8_2();
        counter.setLimit(3);
        counter.count();
        counter.count();
        counter.count();
        counter.count();
        System.out.println();
        System.out.print("The last value is " + counter.getValue());
    }



}
