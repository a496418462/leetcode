package easy.two;

public class ExcelSheetColumnNumber {

//    Given a column title as appear in an Excel sheet, return its corresponding column number.
//    For example:
//    A -> 1
//    B -> 2
//    C -> 3
//            ...
//    Z -> 26
//    AA -> 27
//    AB -> 28
//    Example 1:
//    Input: "A"
//    Output: 1

//    Example 2:
//    Input: "AB"
//    Output: 28

//    Example 3:
//    Input: "ZY"
//    Output: 701

    public int titleToNumber(String s) {
        if(s == null || s.length() == 0 ) return 0;
        int total = 0;
        for( int i = 0 ; i < s.length(); i++){
            total = total * 26 + s.charAt(i) - 64;
//            total = total * 26 + s.charAt(i) - 'A' + 1;  //leetcode
        }
        return total;
    }
}
