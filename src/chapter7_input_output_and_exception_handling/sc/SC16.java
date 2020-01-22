package chapter7_input_output_and_exception_handling.sc;

public class SC16 {
    public static void main(String[] args) {
        int balance = 100;
        int amount = 200;

        if (amount > balance)
        {
            throw new IllegalArgumentException("Amount exceeds balance");
        }
        balance = balance - amount;
    }
}
