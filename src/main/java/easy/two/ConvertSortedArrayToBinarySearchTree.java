package easy.two;

public class ConvertSortedArrayToBinarySearchTree {
//    Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
//    For this problem, a height-balanced binary tree is defined as a binary tree in which
//    the depth of the two subtrees of every node never differ by more than 1.

//    Example:
//    Given the sorted array: [-10,-3,0,5,9],
//    One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:

//            0
//           / \
//         -3   9
//        /   /
//      -10  5

    public static void main(String[] args) {

    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0) return null;
        return getTreeNode(nums, 0, nums.length - 1);
    }

    private TreeNode getTreeNode(int nums[], int start, int end){
        if(start > end) return null;
        int middle = start + (end - start) / 2;
        TreeNode node = new TreeNode(nums[middle]);
        node.left = getTreeNode(nums, start, middle - 1);
        node.right = getTreeNode(nums, middle + 1, end);
        return node;
    }
}

/**
 * Definition for a binary tree node. path:easy.two.SymmetricTree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
