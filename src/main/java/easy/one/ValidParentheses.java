package easy.one;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

//    Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
//    determine if the input string is valid.

//    The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

    public static void main(String[] args) {
        System.out.println(isValid("([)]"));
    }

    public static boolean isValid(String s) {

        if(s == null || s.length() == 0 || s.length() % 2 != 0){
            return false;
        }
        Map<Character,Character> map = new HashMap<Character, Character>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0 ; i<s.length();i++){
            if (!stack.empty() && map.get(s.charAt(i)) == stack.peek()){
                stack.pop();
            }else {
                stack.push(s.charAt(i));
            }
        }
        return stack.empty();
    }
}
