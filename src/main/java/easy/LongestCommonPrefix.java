package easy;

import java.util.Arrays;

public class LongestCommonPrefix {

//    Write a function to find the longest common prefix string amongst an array of strings.

    public static void main(String[] args) {
        String[] strs = {"abc","ac","ab" ,"abcd"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }else if (strs.length == 1){
            return strs[0];
        }else {
            StringBuffer prefix = new StringBuffer("");
            boolean flag;
            for(int i = 0 ; i < strs[0].length();i++){
                flag = true;
                char temp = strs[0].charAt(i);
                for(int j = 1 ;j < strs.length;j++){
                    if(i >= strs[j].length() || temp != strs[j].charAt(i)){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    prefix.append(temp);
                }else {
                    break;
                }
            }
            return prefix.toString();
        }
    }

    public static String longestCommonPrefixLeetCode(String[] strs) {
        StringBuilder result = new StringBuilder();

        if (strs != null && strs.length > 0) {

            Arrays.sort(strs);

            char[] a = strs[0].toCharArray();
            char[] b = strs[strs.length - 1].toCharArray();

            for (int i = 0; i < a.length; i++) {
                if (b.length > i && b[i] == a[i]) {
                    result.append(b[i]);
                } else {
                    return result.toString();
                }
            }
            return result.toString();
        }
        return "";
    }
}
