package A10;

import java.util.*;

public class Clloection {
    public static void main(String[] args) {

        int N = 7;
        int[] arr = {1, 2, 3, 4, 5, 7};   // missing 6

        Set<Integer> set = new HashSet<>();

        // Step 1: add all array elements to set
        for (int x : arr) {
            set.add(x);
        }

        // Step 2: check from 1 to N which is missing
        int missing = -1;
        for (int i = 1; i <= N; i++) {
            if (!set.contains(i)) {
                missing = i;
                break;
            }
        }

        System.out.println("Missing number: " + missing);
    }
}