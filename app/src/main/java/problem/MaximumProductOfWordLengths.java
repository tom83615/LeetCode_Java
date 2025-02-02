package problem;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumProductOfWordLengths {

    public int maxProduct(String[] words) {
        int n = words.length;
        int[] bitmask = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            // Calculate bitmask for current word
            for (int j = 0; j < words[i].length(); j++) {
                int index = words[i].charAt(j) - 'a';

                // left shift 1 by index and OR it with the current bitmask
                bitmask[i] |= (1 << index);
            }

            // Compare bitmask of current string with previous strings bitmask
            for (int j = 0; j < i; j++) {
                if ((bitmask[i] & bitmask[j]) == 0)
                    max = Math.max(max, words[i].length() * words[j].length());
            }
        }

        return max;
    }
}
