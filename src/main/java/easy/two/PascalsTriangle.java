package easy.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {

//    Given numRows, generate the first numRows of Pascal's triangle.

//    For example, given numRows = 5,
//    Return
//          [
//            [1],
//            [1,1],
//            [1,2,1],
//            [1,3,3,1],
//            [1,4,6,4,1]
//           ]

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> total = new ArrayList<>();
        if (numRows == 0) return total;
        if(numRows == 1) {
            total.add(Arrays.asList(1));
        }else {
            total = generate(numRows - 1);
            List<Integer> lastList = total.get(total.size() - 1);
            List<Integer> newList = new ArrayList<>();
            newList.add(1);
            for(int i = 1;i<lastList.size();i++){
                newList.add(lastList.get(i-1) + lastList.get(i));
            }
            newList.add(1);
            total.add(newList);
        }
        return total;
    }

    public List<List<Integer>> generateLeetCode(int numRows) {
        List<List<Integer>> allrows = new ArrayList<List<Integer>>();
        ArrayList<Integer> row = new ArrayList<Integer>();
        for(int i=0;i<numRows;i++)
        {
            row.add(0, 1);
            for(int j=1;j<row.size()-1;j++)
                row.set(j, row.get(j)+row.get(j+1));
            allrows.add(new ArrayList<Integer>(row));
        }
        return allrows;

    }

}
