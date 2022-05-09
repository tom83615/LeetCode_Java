package problem;

import java.util.*;

public class LetterCombinationsOfAPhoneNumber {

    public List<String> letterCombinations(String digits) {
        ArrayList<String> res = new ArrayList<>();
        if(digits == null || digits.isEmpty()) {
            return res;
        }

        Map<Character, Character[]> map = new HashMap();
        map = Map.of(
        '2', new Character[] { 'a', 'b', 'c' },
        '3', new Character[] { 'd', 'e', 'f' },
        '4', new Character[] { 'g', 'h', 'i' },
        '5', new Character[] { 'j', 'k', 'l' },
        '6', new Character[] { 'm', 'n', 'o' },
        '7', new Character[] { 'p', 'q', 'r', 's' },
        '8', new Character[] { 't', 'u', 'v' },
        '9', new Character[] { 'w', 'x', 'y', 'z' }
        );

        for(char c: digits.toCharArray()){
            if(res.size() == 0){
                // simple append
                for(char c1: map.get(c)){
                    res.add(String.valueOf(c1));
                }
            }else {
                ArrayList<String> temp = new ArrayList<>();

                for (String oriString : res) {
                    for (char cn : map.get(c)) {
                        temp.add(oriString + String.valueOf(cn));
                    }
                }

                res = new ArrayList<>(temp);
            }
        }

        return res;
    }
}
