package chapter7_input_output_and_exception_handling.test;

public class MyException {
    public static void main(String[] args) {
        int balance = 10;
        int number = 5;
        if (number>balance){
            IllegalArgumentException ex =  new IllegalArgumentException("the value is incorrect");
            throw ex;


            // ...
            // ...

        }
    }
}
