package chapter5_.p;

public class Class5_6v3 {
    public static int countVowels(String str){
        int i=0;
        int result = 0;
        String stroka = "AEIOUaeiou";
        for (i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (stroka.indexOf(ch) != -1)
                    result++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.print(countVowels("ImaUud"));
    }

}
