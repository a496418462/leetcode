package easy.one;

public class RemoveElement {
//    Given an array and a value, remove all instances of that value in-place and return the new length.
//    Do not allocate extra space for another array,
//    you must do this by modifying the input array in-place with O(1) extra memory.
//    The order of elements can be changed. It doesn't matter what you leave beyond the new length.

//    Example:
//    Given nums = [3,2,2,3], val = 3,

//    Your function should return length = 2, with the first two elements of nums being 2.

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        System.out.println(removeElement(nums,3));
    }

    public static int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0) return 0;
        int i = 0;//number of elements
        for(int cursor = 0;cursor< nums.length;cursor++ ){
            if(nums[cursor] != val){
                if(i != cursor && nums[i] != nums[cursor]){ // avoid unnecessary copy
                    nums[i] = nums[cursor];
                }
                i++;
            }
        }
        return i;
    }
}
