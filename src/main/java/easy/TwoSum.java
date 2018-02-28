import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

//    Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
//    Example:
//    Given nums = [2, 7, 11, 15], target = 9,
//    Because nums[0] + nums[1] = 2 + 7 = 9,
//            return [0, 1].

    public static void  main(String[] args){
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15},9)));
    }


    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numsMap = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            numsMap.put(nums[i],i);
        }
        int remainedNum;
        for(int i=0;i<nums.length;i++){
            remainedNum = target - nums[i];
            if(numsMap.containsKey(remainedNum) && numsMap.get(remainedNum)!= i){
                return new int[]{i,numsMap.get(remainedNum)};
            }
        }

        return null;
    }
}
