package chapter5_.test;

public class ToStringDemo {
    public static void main(String[] args) {
        String s = "hello ";
        System.out.println(s + 10);
        // wrapper (обёртка) class
        Integer i = Integer.valueOf(10);
        System.out.println(s + i.toString());
        System.out.println(s + true);
        System.out.println(s + 5.5);
        System.out.println(s + 'g');
        System.out.println(s + " " + s + 5 + 10);
    }
}
