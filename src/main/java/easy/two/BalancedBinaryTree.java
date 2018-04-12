package easy.two;

public class BalancedBinaryTree {
//    Given a binary tree, determine if it is height-balanced.
//    For this problem, a height-balanced binary tree is defined as:
//    a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

//    Example 1:
//    Given the following tree [3,9,20,null,null,15,7]:
//                3
//               / \
//              9  20
//                /  \
//               15   7
//    Return true.

    //    Example 2:
//    Given the following tree [1,2,2,3,3,null,null,4,4]:
//              1
//             / \
//            2   2
//           / \
//          3   3
//         / \
//        4   4
//    Return false.
    public boolean isBalanced(TreeNode root) {
        return getTreeHeight(root) != -1;
    }

    private int getTreeHeight(TreeNode node){
        if(node == null) return 0;
        if(node.left == null && node.right == null) return 1;
        int left = getTreeHeight(node.left);
        int right =  getTreeHeight(node.right);
        if (Math.abs(left - right) > 1 || left == -1 || right == -1) return -1;
        return Math.max(left,right) + 1;
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
