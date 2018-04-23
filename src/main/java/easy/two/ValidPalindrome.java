package easy.two;

import java.util.ArrayList;
import java.util.List;

public class ValidPalindrome {

//    Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
//    Note: For the purpose of this problem, we define empty string as valid palindrome.

//    Example 1:
//    Input: "A man, a plan, a canal: Panama"
//    Output: true

//    Example 2:
//    Input: "race a car"
//    Output: false

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    //17ms
    public static boolean isPalindrome(String s) {
        if(s == null || "".equals(s.trim())) return true;
        s = s.toLowerCase();
        List<Character> list = new ArrayList<>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) list.add(c);
        }
        if (list.size() == 0) return true;
        int first = 0;
        int last = list.size() - 1;
        while (first <= last){
            if(!list.get(first).equals(list.get(last)) ) return false;
            first ++ ;
            last -- ;
        }

        return true;
    }

    //13ms
    public static boolean isPalindrome2(String s) {
        if(s == null || "".equals(s.trim())) return true;
        s = s.toLowerCase();
        int first = 0;
        int last = s.length() - 1;
        while (first <= last){
            if(!Character.isLetterOrDigit(s.charAt(first))){
                first ++;
            }else if(!Character.isLetterOrDigit(s.charAt(last))){
                last --;
            }else {
                if(s.charAt(last) != s.charAt(first) ) return false;
                first ++;
                last --;
           }
        }
        return true;
    }

    //33ms
    public boolean isPalindromeLeetCode(String s) {
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuffer(actual).reverse().toString();
        return actual.equals(rev);
    }
}
