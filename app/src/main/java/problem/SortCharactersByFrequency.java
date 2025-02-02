package problem;

//        Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.
//
//        Return the sorted string. If there are multiple answers, return any of them.
//
//        Example 1:
//        Input: s = "tree"
//        Output: "eert"
//        Explanation: 'e' appears twice while 'r' and 't' both appear once.
//        So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
//
//        Example 2:
//        Input: s = "cccaaa"
//        Output: "aaaccc"
//        Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
//        Note that "cacaca" is incorrect, as the same characters must be together.
//
//        Example 3:
//        Input: s = "Aabb"
//        Output: "bbAa"
//        Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
//        Note that 'A' and 'a' are treated as two different characters.
//
//
//        Constraints:
//        1 <= s.length <= 5 * 105
//        s consists of uppercase and lowercase English letters and digits.

import java.util.*;
import java.util.stream.Collectors;

public class SortCharactersByFrequency {
    public static String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        // put in map
        for (char c: s.toCharArray()){
            Integer count = freq.containsKey(c)? freq.get(c)+1: 1;
            freq.put(c, count);
        }

        StringBuilder sb = new StringBuilder();
        // sort
        freq.entrySet().stream().sorted(new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                int condition1 = o2.getValue().compareTo(o1.getValue());
                return condition1 != 0? condition1: o1.getKey().compareTo(o2.getKey());
            }
        // reduce
        }).forEach(el->{
            for(int i=0; i< el.getValue(); i++){
                sb.append(el.getKey());
            }
        });
        return sb.toString();
    }
}
