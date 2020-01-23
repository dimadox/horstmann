package chapter6_arrays_and_array_lists.p;

public class Class6_11v3 {
    public static void main(String[] args) {
        boolean check1 = true;
        boolean check2 = true;

        boolean tempCheck2 = false;

        int[] array1 = {1, 2, 3, 1, 2, 6, 7};
        int[] array2 = {1, 2, 6, 7, 1, 2, 3};

        if (array1.length != array2.length) {
            System.out.println("the lengths are different");
            return;
        }

        // assertion: array1.length == array2.length
        int n = array1.length;

        boolean found = false;
        int shift = 0;

        // OR = disjunction
        // shift1 || shift2 || ... || shiftN
        for (int i = 0; i < n; i++)
            if (array1[0] == array2[i]) {
                shift = i;
                System.out.println("candidate: " + shift);

                // AND = conjunction
                // p0match && p1match && .. && p[n-1]match
                boolean match = true;
                for (int j = 0; j != n; ++j) {
                    System.out.printf("array1[%d] -> array2[%d]\n", j, (j + shift) % n);
                    if (array1[j] != array2[(j + shift) % n]) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    found = true;
                    break;
                }
            }

        // System.out.println(check1 + " " + check2);
        if (found) {
            System.out.println("Это одинаковые массивы со смещением: " + shift);
        } else {
            System.out.println("Это разные массивы");
        }
    }
}
