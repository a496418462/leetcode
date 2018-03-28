package easy;

public class PlusOne {

//    Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
//    You may assume the integer do not contain any leading zero, except the number 0 itself.
//    The digits are stored such that the most significant digit is at the head of the list.

    public static void main(String[] args) {
        int[] digits = {2,2,9};
        int[] result = plusOne(digits);
        for(int i : result){
            System.out.println(i);
        }

    }

    public static int[] plusOne(int[] digits) {
        for(int i = digits.length -1 ; i>=0 ; i--){
            if(digits[i] < 9){
                digits[i] ++;
                return digits;
            }else {
                digits[i] = 0;
            }
        }
        if(digits[0] == 0){
            int[] returnArray = new int[digits.length+1];
            returnArray[0] = 1;
            return returnArray;
        }
        return digits;
    }

}
