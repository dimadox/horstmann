package chapter5_.r;

public class Class5_14 {
    public static int[] falseSwap(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;

        int[] result = new int[2];
        result[0] = a;
        result[1] = b;

        return result;
    }
    public static void main(String[] args)
    {

        int x = 3;
        int y = 4;

        int[] result;
        result = falseSwap(x, y);
        x = result[0];
        y = result[1];

        System.out.println(x + " " +  y);
    }
}
