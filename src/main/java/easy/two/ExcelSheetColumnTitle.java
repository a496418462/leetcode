package easy.two;

public class ExcelSheetColumnTitle {
//    Given a positive integer, return its corresponding column title as appear in an Excel sheet.

//    For example:
//    1 -> A
//    2 -> B
//    3 -> C
//    ...
//    26 -> Z
//    27 -> AA
//    28 -> AB
//    ...
//    Example 1:
//    Input: 1
//    Output: "A"

//    Example 2:
//    Input: 28
//    Output: "AB"

//    Example 3:
//    Input: 701
//    Output: "ZY"

    public String convertToTitle(int n) {
        if(n == 0) return null;
        StringBuilder s = new StringBuilder();
        while ((n-1) / 26 != 0){
            s.insert(0,(char)((n-1) % 26 + 65));
            n = (n-1) / 26;
        }
        s.insert(0,(char)((n-1) % 26 + 65));
        return s.toString();
    }

}
