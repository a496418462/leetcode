package easy;

public class CountAndSay {
//    The count-and-say sequence is the sequence of integers with the first five terms as following:
//    1.     1
//    2.     11
//    3.     21
//    4.     1211
//    5.     111221

//    1 is read off as "one 1" or 11.
//    11 is read off as "two 1s" or 21.
//    21 is read off as "one 2, then one 1" or 1211.

//    Given an integer n, generate the n(th) term of the count-and-say sequence.
//    Note: Each term of the sequence of integers will be represented as a string.

//    Example 1:
//    Input: 1
//    Output: "1"

//    Example 2:
//    Input: 4
//    Output: "1211"

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }

    public static String countAndSay(int n) {
        if(n <= 0) return "";
        if(n == 1){
            return "1";
        }else{
            StringBuffer returnString = new StringBuffer("");
            String s = countAndSay(n-1);
            char[] array = s.toCharArray();
            int count = 1;
            for(int i = 0 ;i<array.length - 1;i++){
                if(array[i] == array[i+1]){
                    count++;
                }else{
                    returnString.append(count);
                    returnString.append(array[i]);
                    count = 1;
                }
            }
            //for last count
            returnString.append(count);
            returnString.append(array[array.length - 1]);
            return returnString.toString();
        }


    }
}
