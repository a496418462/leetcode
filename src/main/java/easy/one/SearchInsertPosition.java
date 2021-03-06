package easy.one;

public class SearchInsertPosition {
//    Given a sorted array and a target value,
//    return the index if the target is found.
//    If not, return the index where it would be if it were inserted in order.
//    You may assume no duplicates in the array.

//    Example 1:
//    Input: [1,3,5,6], 5
//    Output: 2

//    Example 2:
//    Input: [1,3,5,6], 2
//    Output: 1

//    Example 3:
//    Input: [1,3,5,6], 7
//    Output: 4

//    Example 1:
//    Input: [1,3,5,6], 0
//    Output: 0

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;
        System.out.println(searchInsert(nums,target));
    }

    public static int searchInsert(int[] nums, int target) {
        if(nums == null || nums.length == 0 || target == 0) return 0;
        int low = 0;
        int high = nums.length;
        int mid = 0;
        while(low < high){
            mid = low + (high - low)/2;
            if(nums[mid] == target){
                return mid;
            }else if (nums[mid] > target){
                high = mid;
            }else {
                //if nums[low] > target,high will decrease , until low = high.
                low = mid + 1;
            }
        }
        return low;
    }
}
