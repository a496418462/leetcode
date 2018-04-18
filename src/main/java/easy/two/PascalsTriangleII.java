package easy.two;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {

//    Given an index k, return the k'th row of the Pascal's triangle.

//    For example, given k = 3,
//    Return [1,3,3,1].

//    Note:
//    Could you optimize your algorithm to use only O(k) extra space?

    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        if (rowIndex == 0) {
            row.add(1);
        }else {
            row = getRow(rowIndex - 1);
//            row.add(0,1);
//            for (int i = 1;i<row.size() - 1;i++){
//                row.set(i,row.get(i) + row.get(i + 1));
//            }
            row.add(1);
            for (int i = row.size() - 2;i > 0; i--){
                row.set(i,row.get(i) + row.get(i -1));
            }
        }
        return row;
    }

    public List<Integer> getRowLeetCode(int rowIndex) {
        List<Integer> res = new ArrayList<Integer>(rowIndex + 1);
        for(int i = 0;i<rowIndex+1;i++) {
            res.add(1);
            for(int j=i-1;j>0;j--) {
                res.set(j, res.get(j-1)+res.get(j));
            }
        }
        return res;
    }
}
