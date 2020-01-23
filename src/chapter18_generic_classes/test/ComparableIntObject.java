package chapter18_generic_classes.test;

public class ComparableIntObject {
    private int value;

    public ComparableIntObject(int value) {
        this.value = value;
    }

    public int getInt() {
        return value;
    }

    public int compareToOther(ComparableIntObject other) {
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

        ComparableIntObject x = new ComparableIntObject(10);

    }
}
