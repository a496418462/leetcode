package easy.one;

public class ImplementStrStr {

//    Implement strStr().
//    Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

//    Example 1:
//    Input: haystack = "hello", needle = "ll"
//    Output: 2

//    Example 2:
//    Input: haystack = "aaaaa", needle = "bba"
//    Output: -1

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "o";
        System.out.println(strStr(haystack,needle));
    }

    public static int strStr(String haystack, String needle) {
        if(haystack == null || needle == null || haystack.length()<needle.length()) return -1;
        if(needle.length() == 0) return 0;
        int position = 0;
        for(;position <= haystack.length() - needle.length();position++){
            if(haystack.charAt(position) == needle.charAt(0)){
               if(haystack.substring(position,position+needle.length()).equals(needle)) return position;
            }
        }
        return -1;
    }
}
