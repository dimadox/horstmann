package chapter2_fundamental_data_types;

public class PrintfDemo {
    public static void main(String[] args) {

        double price1 = 52.5;
        double price2 = 137.27;

        System.out.printf("%15s %10s\n", "x", "log(x)");

        for (int i = 0; i < 10; i++) {
            int x = (int) Math.pow(10, i);
            System.out.printf("%15d %10f\n", x, Math.log(x));
        }

        System.out.printf("Price­per­liter:%6.2f USD/liter\n", price1);
        System.out.println("Price­per­liter: " + price1 + " USD/liter");
    }
}
