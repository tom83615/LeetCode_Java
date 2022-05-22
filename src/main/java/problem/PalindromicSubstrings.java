package problem;

public class PalindromicSubstrings {
    int res;
    public int countSubstrings(String s) {
        res = 0;
        for(int i=0; i<s.length(); i++){
            isPalindrome(s, i, i);
            isPalindrome(s, i, i+1);
        }
        return res;
    }


    public void isPalindrome(String s,int left, int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            res++;
            left--;
            right++;
        }
    }
}
