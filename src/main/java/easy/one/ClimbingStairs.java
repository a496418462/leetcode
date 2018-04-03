package easy.one;

public class ClimbingStairs {

//    You are climbing a stair case. It takes n steps to reach to the top.
//    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//    Note: Given n will be a positive integer.

//    Example 1:
//    Input: 2
//    Output:  2
//    Explanation:  There are two ways to climb to the top.
//    1. 1 step + 1 step
//    2. 2 steps

//    Example 2:
//    Input: 3
//    Output:  3
//    Explanation:  There are three ways to climb to the top.
//    1. 1 step + 1 step + 1 step
//    2. 1 step + 2 steps
//    3. 2 steps + 1 step

    public static void main(String[] args) {
        System.out.println(climbStairs(44));
    }

    public static int climbStairs(int n) { //	Time Limit Exceeded
        if( n <= 2){
            return n;
        }
        int i = 3; //stairs
        int a = 1; // one stair
        int b = 2; // two stairs
        int all = 0; // n stairs
        while (i <= n){
            all = a + b;
            a = b; // plus one stair
            b = all; // plus one stair
            i++;
        }
        return all;
    }


    public static int climbStairs2(int n) { //	Time Limit Exceeded n=44,result=1134903170
        if( n <= 2){
            return n;
        }else {
            return climbStairs(n-1) + climbStairs(n-2);
        }
    }
}
