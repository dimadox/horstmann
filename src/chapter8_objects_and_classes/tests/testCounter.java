package chapter8_objects_and_classes.tests;

public class testCounter {
    public static void main(String[] args) {
        int i = 0;
        Counter c = new Counter();
        c.count();
        c.count();
        System.out.println(c.getValue());
        c.reset();
        System.out.println(c.getValue());

        CounterLines string = new CounterLines();
        string.count();
        string.count();
        System.out.println(string.getValue());
    }
}
