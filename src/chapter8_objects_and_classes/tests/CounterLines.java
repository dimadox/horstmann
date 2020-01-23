package chapter8_objects_and_classes.tests;

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
