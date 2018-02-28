public class ReverseInteger {

//    Given a 32-bit signed integer, reverse digits of an integer.
//    Example 1:
//    Input: 123
//    Output:  321
//
//    Example 2:
//    Input: -123
//    Output: -321
//
//    Example 3:
//    Input: 120
//    Output: 21

//    Note:
//    Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range.
//    For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

    public static void  main(String[] args){
        System.out.println(reverse(901000));
    }


    public static int reverse(int x) {
        int result=0;
        if(x==0){
            return result;
        }
        boolean isNegative = x<0;
        int absX = Math.abs(x);
        while (absX != 0){
            //Integer.MIN_VALUE = -2147483648
            //Integer.MAX_VALUE = 2147483647
            //Because of "/10",the difference of "7,8" can be ignored
            if(result > (Integer.MAX_VALUE - absX%10)/10){
                return 0;
            }
            result = result*10 + absX%10;
            absX = absX/10;
        }
        return isNegative ? -result:result;
    }
}
