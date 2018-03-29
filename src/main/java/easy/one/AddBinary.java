package easy.one;

public class AddBinary {
//    Given two binary strings, return their sum (also a binary string).

//    For example,
//    a = "11"
//    b = "1"
//    Return "100".

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a,b));

    }

    public static String addBinary(String a, String b) {
        if(a == null || b == null) return null;
        if(a == "") return b;
        if(b == "") return a;

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        int sum = 0;
        StringBuilder returnString = new StringBuilder("");
        while (i >= 0 || j >= 0){
            if(i >= 0){
                sum = sum + Character.getNumericValue(a.charAt(i));
                i-- ;
            }
            if(j >= 0){
                sum = sum + Character.getNumericValue(b.charAt(j));
                j-- ;
            }
            sum = sum + carry;
            returnString.append(sum % 2);
            carry = sum / 2;
            sum = 0;
        }
        if(carry == 1) returnString.append(carry);
        return returnString.reverse().toString();
    }
}
