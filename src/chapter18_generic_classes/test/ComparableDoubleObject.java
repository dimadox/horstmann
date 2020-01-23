package chapter18_generic_classes.test;

public class ComparableDoubleObject {
    private double value;

    public ComparableDoubleObject(double value) {
        this.value = value;
    }


    public int compareToOther(ComparableDoubleObject other) {
        if (value < other.value)
            return -1;
        else if (value > other.value)
            return 1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "CTIO: " + value;
    }

    public static void main(String[] args) {
        System.out.println("hello");

        ComparableDoubleObject x = new ComparableDoubleObject(10);

    }
}
