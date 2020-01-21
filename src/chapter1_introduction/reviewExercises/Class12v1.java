package chapter1_introduction.reviewExercises;

public class Class12v1 {
    public static void main(String[] args) {
        double a = 499;
        int i;
        for (i = 0; ; i++) {
            a = a * 1.005;
            if (a < 500)
                break;
            a -= 500;
            System.out.println(a);
        }
        System.out.println("Денег хватит на " + i + " мес." + " и будет остаток " + a + " долл.");
    }
}
