package easy.one;

public class SqrtX {

//    Implement int sqrt(int x).
//    Compute and return the square root of x.
//    x is guaranteed to be a non-negative integer.

//    Example 1:
//    Input: 4
//    Output: 2

//    Input: 8
//    Output: 2
//    Explanation: The square root of 8 is 2.82842..., and since we want to return an integer,
//    the decimal part will be truncated.

    public static void main(String[] args) {
        System.out.println(mySqrt(0));
    }


    public static int mySqrt(int x) {
        if( x == 0 || x == 1) return x;
        int left = 0;
        int right = x;
        int mid = 0;
        while(left <= right){
            mid = left + (right - left) /2;
            if(mid > x/mid){
                right = mid - 1;
            }else if (mid < x/mid){
                left = mid + 1;
            }else {
                return mid;
            }
        }
        return right;
    }

}
