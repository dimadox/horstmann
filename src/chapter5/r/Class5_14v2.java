package chapter5.r;

// anti-pattern
// static/class methods, static/class variables = plain C
// (not C++, not Java, not python)

public class Class5_14v2 {

    static int x = 3;       // class variables (static variables)
    static int y = 4;       // class variables (static variables)

    // class method (static method)
    public static void swap()
    {
        int temp = x;
        x = y;
        y = temp;
    }

    // class method (static method)
    public static void main(String[] args)
    {
        swap();

        System.out.println(x + " " +  y);
    }
}
