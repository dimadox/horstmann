package chapter18.pe;

public class P18_2v2 {

    public static void swap (int first, int second){
        int swap = first;
        first = second;
        second = swap;
        System.out.println(first + " " + second);

    }

    public static void main(String[] args) {
        swap(1,2);

    }
}
