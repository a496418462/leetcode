package easy.two;

import java.util.*;

public class BinaryTreeLevelOrderTraversalII {
//    Given a binary tree, return the bottom-up level order traversal of its nodes' values.
//    (ie, from left to right, level by level from leaf to root).

//    For example:
//    Given binary tree [3,9,20,null,null,15,7],
//               3
//              / \
//             9  20
//               /  \
//              15   7

//    return its bottom-up level order traversal as:
//          [
//            [15,7],
//            [9,20],
//            [3]
//          ]

    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> returnList = new ArrayList<>();
        if(root == null) return returnList;
        List<Integer> listValue = new ArrayList<>();
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        while (list != null && list.size() != 0) {
            for (TreeNode t : list) {
                listValue.add(t.val);
            }
            returnList.add(listValue);
            list = getNextLevelList(list);
            listValue = new ArrayList<>();
        }
        Collections.reverse(returnList);
        return returnList;
    }

    private List<TreeNode> getNextLevelList(List<TreeNode> list) {
        List<TreeNode> treeNodeList = new ArrayList<>();
        for (TreeNode t: list) {
            if (t.left != null) treeNodeList.add(t.left);
            if (t.right != null) treeNodeList.add(t.right);
        }
//        list.stream().forEach(x -> {
//            if (x.left != null) treeNodeList.add(x.left);
//            if (x.right != null) treeNodeList.add(x.right);
//        });
        return treeNodeList;
    }

    public List<List<Integer>> levelOrderBottomLeetCode(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();

        if(root == null) return wrapList;

        queue.offer(root);
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            for(int i=0; i<levelNum; i++) {
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            wrapList.add(0, subList);
        }
        return wrapList;
    }
}


/**
 * Definition for a binary tree node.  path:easy.two.SymmetricTree
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
