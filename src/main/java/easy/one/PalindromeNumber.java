package easy.one;

public class PalindromeNumber {
    //Determine whether an integer is a palindrome. Do this without extra space.

    //Some hints:
    //Could negative integers be palindromes? (ie, -1)
    //If you are thinking of converting the integer to string, note the restriction of using extra space.
    //You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?
    //There is a more generic way of solving this problem.

    public static void  main(String[] args){
        System.out.println(isPalindrome(12300321));
    }

    public static boolean isPalindrome(int x) {
        if(x<0 || (x!=0 && x%10 == 0)){
            return false;
        }
        int sum = 0;
        while(x>sum){
            sum = sum*10 + x%10;
            x=x/10;
        }
        return (x == sum || x == sum/10);
    }
}
