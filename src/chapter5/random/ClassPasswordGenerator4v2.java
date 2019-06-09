package chapter5.random;

public class ClassPasswordGenerator4v2 {

    public static char pickAtRandom(String s) {
        // in: String alphabet
        int j = (int) (Math.random() * s.length());
        char ch = s.charAt(j);
        // out: char ch
        return ch;
    }

    public static void main(String[] args) {
        int lenght = 10;
        String pass = "";


        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String bigAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "1234567890";
        String special = "@#$%^&*()_+";

        String[] sets = new String[]{alphabet, bigAlphabet, numbers, special};

        for (int i = 0; i < lenght; i++) {
            int type = (int) (Math.random() * 4);
            System.out.println("type is " + type);
            pass = pass + pickAtRandom(sets[type]);
            System.out.println(pass);
        }

        System.out.println(pass);
    }
}
