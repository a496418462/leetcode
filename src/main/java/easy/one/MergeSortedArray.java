package easy.one;

public class MergeSortedArray {

//    Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

//    Note:
//    You may assume that nums1 has enough space(size that is greater or equal to m + n)
//    to hold additional elements from nums2.
//    The number of elements initialized in nums1 and nums2 are m and n respectively.

    public static void main(String[] args) {
        int[] nums1 = new int[10];
        nums1[0]=1;
        nums1[1]=3;
        nums1[2]=4;
        int[] nums2 = new int[2];
        nums2[0]=2;
        nums2[1]=4;
        merge(nums1,3,nums2,2);
        for (int i = 0;i<nums1.length;i++){
            System.out.println(nums1[i]);
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m <= 0 || n <= 0 ) return;
        int i = m + n -1;
        m = m - 1;
        n = n - 1;
        while(m >= 0 && n >= 0){
            if(nums1[m] > nums2[n]){
                nums1[i--] = nums1[m--];
            }else {
                nums1[i--] = nums2[n--];
            }
        }
        while (n >= 0){
            nums1[i--] = nums2[n--];
        }
    }
}
