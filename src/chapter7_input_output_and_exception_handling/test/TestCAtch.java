package chapter7_input_output_and_exception_handling.test;

public class TestCAtch {
    public static void main(String[] args) {
        int i=0;
        try {
            int j=i/0;
        }
        catch (ArithmeticException exception){
//            System.err.println("Error");
            exception.printStackTrace();

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println(exception.getMessage());

        }

    }
}
