package chapter3_decisions;

public class test2 {
    public static void main(String[] args) {
        final boolean STRONG_LANGUAGE = false;

        // true == true => true
        if (STRONG_LANGUAGE == true) {
            System.out.println("get the fuck off");
        }

        // true == false => false
        if (STRONG_LANGUAGE == false) {
            System.out.println("good bye, sir");
        }

        // 5 * 1
        // 5 * 1 + 0




        if (STRONG_LANGUAGE) {
            System.out.println("get the fuck off");
        }

        // !true => false
        // !false => true
        if (!STRONG_LANGUAGE) {
            System.out.println("good bye, sir");
        }
    }
}
