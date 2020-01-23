package chapter5_.p;

public class Class5_15 {
    public static String reverse(String str) {
        char theFirst = str.charAt(0);
        String result = "";
        //for (int i=0; i < str.length(); i++){
            result = str.substring(str.length()-1) + str.substring(0, str.length()-1);
            result = str.substring(str.length()-1) + str.substring(0, str.length()-1);
        //}
        return result;
    }

    public static void main(String[] args) {
        System.out.print(reverse("abc"));

    }
}
