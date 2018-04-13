package easy.two;

public class MinimumDepthOfBinaryTree {

//    Given a binary tree, find its minimum depth.

//    The minimum depth is the number of nodes along the shortest path from
//    the root node down to the nearest leaf node.


    //null is a leaf node
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left != null && root.right != null){
            return Math.min(minDepth(root.left),minDepth(root.right)) + 1;
        }else{
            return 1;
        }
    }

    //null is not a leaf node
    public int minDepthLeetCode(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null) return minDepthLeetCode(root.right) + 1;
        if(root.right == null) return minDepthLeetCode(root.left) + 1;
        return Math.min(minDepthLeetCode(root.right) ,minDepthLeetCode(root.left)) + 1;
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