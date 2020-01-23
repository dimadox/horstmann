package chapter5_methods.test;

public class MethodWithoutReturnValues {
    public static void boxString(String contents)
    {
        int n = contents.length();
        for (int i = 0; i < n + 2; i++) { System.out.print("-"); }
        System.out.println();
        System.out.println("!" + contents + "!");
        for (int i = 0; i < n + 2; i++) { System.out.print("-"); }
        System.out.println();
    }
    public static void main(String[] args) {
        boxString("Dima");
    }
}
