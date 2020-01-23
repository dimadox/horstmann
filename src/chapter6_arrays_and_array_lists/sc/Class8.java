package chapter6_arrays_and_array_lists.sc;

public class Class8 {
    public static void main(String[] args) {
        int[] primes = {2, 3, 5, 7, 11};
        int counter = 0;

        for (int element : primes)
            {
            if (element == 2) {
                counter++;
            }
        }
//        for (int i = 0; i<primes.length; i++){
//            System.out.println(primes[i]);
//        }
        System.out.println(counter);

    }
}
