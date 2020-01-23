package chapter18_generic_classes.pe;

public class P18_2 <T>{
    private T first;
    private T second;


    public P18_2(T firstElement, T secondElement){
        first = firstElement;
        second = secondElement;
    }

    public String toString(){
        return first.toString() + second.toString();
    }


    public void swap(){
        T temp;
        temp = first;
        first = second;
        second = temp;
    }


    public static void main(String[] args) {
        P18_2 test = new P18_2(1, 2);
        test.swap();
        System.out.println(test);

    }
}
