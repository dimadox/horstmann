package chapter5.p;

public class Class5_3 {
    public static int firstDigit(int n){
        int numberOfDigits = String.valueOf(Math.abs(n)).length();
        //int result = (int) (n / (Math.pow(10, numberOfDigits-1)));
        //return result;
        return  (int) (n / (Math.pow(10, numberOfDigits-1)));
    }
    public static int lastDigit(int n){
        return n%10;
    }
    public static int digits(int n){
        return String.valueOf(Math.abs(n)).length();
    }



    public static void main(String[] args) {
        System.out.println(digits(1235454));
        System.out.println(firstDigit(1235454));
        System.out.println(lastDigit(1235454));


    }


}
