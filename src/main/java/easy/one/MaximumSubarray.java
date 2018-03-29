package easy.one;

public class MaximumSubarray {
//    Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

//    For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
//    the contiguous subarray [4,-1,2,1] has the largest sum = 6.

//    More practice:
//    If you have figured out the O(n) solution,
//    try coding another solution using the divide and conquer approach, which is more subtle.

    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        int nums1[] = {-2,-1};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {

        if(nums == null || nums.length == 0 ) return 0;
        if(nums.length == 1) return nums[0];
        int returnSum = nums[0];
        int value = nums[0]; // record per sum
        for(int i = 1; i<nums.length; i++){
            value = Math.max(value + nums[i] , nums[i]);
            returnSum = Math.max(value,returnSum);
        }
        return returnSum;
    }
}
