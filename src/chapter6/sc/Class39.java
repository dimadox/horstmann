package chapter6.sc;

import java.util.ArrayList;

public class Class39 {
    public static void main(String[] args) {
        ArrayList<Integer>primes = new ArrayList<Integer>();
        int lenght = 5;
        int i = 1;
        while (primes.size()<5){

            if (i%2 == 0){
                primes.add(i);

            }
            i++;

        }
        System.out.println(primes);










    }
}
