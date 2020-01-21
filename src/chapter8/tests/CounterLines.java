package chapter8.tests;

public class CounterLines {
    String strokes = "";

    public void count(){
        strokes = strokes + "|";
    }

    public String getValue(){
        return strokes;
    }

    public void reset(){
        strokes = "";
    }

}
