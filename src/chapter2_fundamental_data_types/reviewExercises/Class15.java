package chapter2_fundamental_data_types.reviewExercises;

public class Class15 {
    public static void main(String[] args) {
        int number = 785151515;
        String str = Integer.toString(number);
        char start = str.charAt(0);
        System.out.println(start);

        System.out.println(number / (long) Math.pow(10, Math.floor(Math.log10(number))));

        int remsinder = number%10;
        System.out.println(remsinder);


    }
}
