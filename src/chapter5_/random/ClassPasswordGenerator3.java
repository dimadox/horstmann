package chapter5_.random;

public class ClassPasswordGenerator3 {
    public static void main(String[] args) {
        int lenght = 5;
        String pass = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String bigAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "1234567890";
        String special = "@#$%^&*()_+";
        for (int i=0; i<lenght; i++) {
            double type =  Math.random() * 4;
            int type2 = (int) type;
            switch (type2) {

                case 0:
                    System.out.println("type is " + type2);
                    double alphabet1 =  Math.random() * 26;
                    int alphabet2 = (int) type;
                    char alphabet3 = alphabet.charAt(alphabet2);
                    pass = pass + Character.toString(alphabet3);
                    System.out.println(pass);
                    break;
                case 1:
                    System.out.println("type is " + type2);
                    double bigAlphabet1 =  Math.random() * 26;
                    int bigAlphabet2 = (int) type;
                    char bigAlphabet3 = bigAlphabet.charAt(bigAlphabet2);
                    pass = pass + Character.toString(bigAlphabet3);
                    System.out.println(pass);
                    break;
                case 2:
                    System.out.println("type is " + type2);
                    double numbers1 =  Math.random() * 10;
                    int numbers2 = (int) type;
                    char numbers3 = numbers.charAt(numbers2);
                    pass = pass + Character.toString(numbers3);
                    System.out.println(pass);
                    break;
                default:
                    System.out.println("type is " + type2);
                    double special1 =  Math.random() * 11;
                    int special2 = (int) type;
                    char special3 = special.charAt(special2);
                    pass = pass + Character.toString(special3);
                    System.out.println(pass);
                    break;

            }

        }
        System.out.print(pass);
    }


}
