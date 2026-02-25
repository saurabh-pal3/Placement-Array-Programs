package A11;

import java.util.*;

public class MaxConsecutiveOnesCollection {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 0, 1, 1, 1);

        int maxCount = 0;
        int currentCount = 0;

        for (int x : list) {
            if (x == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }

        System.out.println("Max consecutive 1s = " + maxCount);
    }
}
