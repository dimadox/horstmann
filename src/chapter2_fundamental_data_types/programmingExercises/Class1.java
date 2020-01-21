package chapter2_fundamental_data_types.programmingExercises;

public class Class1 {
    public static void main(String[] args) {
        final double length = 11; //это и есть константы - final?
        // lenght++;
        final double width = 8.5;

        final double inchesToMillimeters = 25.4;

        System.out.println("A4 size is " +
                length * inchesToMillimeters +
                " on " +  width * inchesToMillimeters);
    }
}
