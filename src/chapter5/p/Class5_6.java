package chapter5.p;

public class Class5_6 {
    public static int countVowels(String str){
        int i=0;
        int result = 0;
        for (i=0; i<str.length(); i++){
            if ((str.charAt(i) == 'a') ||
                    (str.charAt(i) == 'e') ||
                    (str.charAt(i) == 'i') ||
                    (str.charAt(i) == 'o') ||
                    (str.charAt(i) == 'u') ||

                    (str.charAt(i) == 'A') ||
                    (str.charAt(i) == 'E') ||
                    (str.charAt(i) == 'I') ||
                    (str.charAt(i) == 'O') ||
                    (str.charAt(i) == 'U')

            ) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.print(countVowels("Ima"));
    }

}
