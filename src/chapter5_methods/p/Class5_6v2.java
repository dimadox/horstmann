package chapter5_methods.p;

public class Class5_6v2 {
    public static int countVowels(String str){
        int i=0;
        int result = 0;
        String stroka = "AEIOUaeiou";
        for (i=0; i<str.length(); i++){
            for (int j=0; j<stroka.length(); j++){
                if ((str.charAt(i) == stroka.charAt(j))) {
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.print(countVowels("ImaUud"));
    }

}
