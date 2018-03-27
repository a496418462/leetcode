package easy;

public class LengthOfLastWord {

//    Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
//    return the length of last word in the string.

//    If the last word does not exist, return 0.

//    Note: A word is defined as a character sequence consists of non-space characters only.

//    Example:
//    Input: "Hello World"
//    Output: 5

    public static void main(String[] args) {
        System.out.println(lengthOfLastWordLeetCode("aaaa a"));
    }

    public static int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0) return 0;
        String[] array = s.split(" ");
        if(array.length == 0) return 0;
        return array[array.length-1].length();
    }

    public static int lengthOfLastWordLeetCode(String s) {
        s = s.trim();
        int lastIndex = s.lastIndexOf(' ') + 1;
        return s.length() - lastIndex;
    }
}
