package chapter18.sc;

public class Pair <T, S> {
    private T first;
    private S second;

    public Pair() {

    }

    public Pair(T firstElement, S secondElement){
        first = firstElement;
        second = secondElement;
    }

    public T getFirst(){
        return first;
    }

    public S getSecond(){
        return second;
    }

    public String toString(){
        return first.toString() + "  " + second.toString()  + "  " +  first.getClass()  + "  " + second.getClass();

        //return (new T().getClass());
        //return null;
    }
}
