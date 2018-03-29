package easy.one;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    //Given a roman numeral, convert it to an integer.
    //Input is guaranteed to be within the range from 1 to 3999.

    //I（1）、V（5）、X（10）、L（50）、C（100）、D（500）和M（1000）。
    public static void main(String[] args) throws Exception{
        System.out.println(romanToInt("DCXXI"));
    }
    public static int romanToInt(String s) throws Exception {
        if (s == null || "".equals(s)){
            return -1;
        }
        Map<Character,Integer> map =new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int len = s.length();
        int sum = 0;
        for(;len > 0 ;len --){
            if(len-2 >=0 && map.get(s.charAt(len-2)) < map.get(s.charAt(len-1))){
                sum = sum + map.get(s.charAt(len-1)) - map.get(s.charAt(len-2));
                len--;
            }else {
                sum = sum + map.get(s.charAt(len-1));
            }
        }
        return sum;
    }

    public static int romanToInt2(String s) throws Exception {
        if (s == null || "".equals(s)){
            return -1;
        }
        int len = s.length();
        int sum = 0;
        for(;len > 0 ;len --){
            switch (s.charAt(len-1)){
                case 'I':
                    sum = sum +1;
                    break;
                case 'V':
                    sum = sum + 5;
                    if(len-2 >=0 && 'I' == s.charAt(len-2)){
                        sum = sum - 1;
                        len--;
                    }
                    break;
                case 'X':
                    sum = sum + 10;
                    if(len-2 >=0 && 'I' == s.charAt(len-2)){
                        sum = sum - 1;
                        len--;
                    }
                    break;
                case 'L':
                    sum = sum + 50;
                    if(len-2 >=0 && 'X' == s.charAt(len-2)){
                        sum = sum - 10;
                        len--;
                    }
                    break;
                case 'C':
                    sum = sum + 100;
                    if(len-2 >=0 && 'X' == s.charAt(len-2)){
                        sum = sum - 10;
                        len--;
                    }
                    break;
                case 'D':
                    sum = sum + 500;
                    if(len-2 >=0 && 'C' == s.charAt(len-2)){
                        sum = sum - 100;
                        len--;
                    }
                    break;
                case 'M':
                    sum = sum + 1000;
                    if(len-2 >=0 && 'C' == s.charAt(len-2)){
                        sum = sum - 100;
                        len--;
                    }
                    break;
                 default:
                     sum = -1;
            }
        }
        return sum;
    }
}
