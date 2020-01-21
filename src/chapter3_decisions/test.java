package chapter3_decisions;

public class test {
    public static void main(String[] args) {
        int floor = 14;
        System.out.println("Actual floor: " + (floor > 13 ? floor - 1 : floor));
        int digit = 2;
        String digitName = "";
        switch (digit)
        {
            case 1: digitName = "one"; break;
            case 2: digitName = "two"; break;
            case 3: digitName = "three"; break;
            default: digitName = ""; break;

        }
        System.out.println(digitName);
    }
}
