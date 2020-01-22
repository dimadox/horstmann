package chapter7_input_output_and_exception_handling.test;

public class Exception {
    public static void main(String[] args) {


        int amount = 5;
        int balance = 3;

        if (amount > balance)
        {
            throw new IllegalArgumentException("Amount exceeds balance");
        }
        balance = balance - amount;
    }
}
