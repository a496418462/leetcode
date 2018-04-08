package easy.one;

public class SameTree {

//    Given two binary trees, write a function to check if they are the same or not.
//    Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

//    Example 1:
//    Input:     1         1
//              / \       / \
//             2   3     2   3
//            [1,2,3],   [1,2,3]
//    Output: true

//    Example 2:
//    Input:     1         1
//              /           \
//             2             2
//            [1,2],     [1,null,2]
//    Output: false

//    Example 3:
//    Input:     1         1
//              / \       / \
//             2   1     1   2
//            [1,2,1],   [1,1,2]
//    Output: false

    public static void main(String[] args) {

    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }else if(p == null && q != null){
            return false;
        }else if(p != null & q ==null){
            return false;
        }
        boolean left,right;
        left = isSameTree(p.left,q.left);
        right = isSameTree(p.right,q.right);
        return (p.val == q.val) && left && right;
    }

    public static boolean isSameTreeLeetCode(TreeNode p, TreeNode q) {
        if (p == null || q == null) return (p == q);
        return (p.val == q.val) && isSameTree(p.left,q.left) &&  isSameTree(p.right,q.right);
    }
}

/**
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}
