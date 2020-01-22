package chapter7_input_output_and_exception_handling.test;

public class ThrowingExceptions741 {
    public static void main(String[] args) {
        int amount = 4;
        int balance = 2;
//        if (amount>balance){
//            throw new IllegalArgumentException("Amount exceeds balance!!!");
//
//        }


        int number = 7;
        String string = "12qq1";
        int value1 = Integer.parseInt(string);

        try {
            int value = Integer.parseInt(string);
        }

        catch (NumberFormatException exception){
            //exception.printStackTrace();
            System.out.println(exception.getMessage());
        }


    }
}
