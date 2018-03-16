package easy;


public class MergeTwoSortedLists {
//    Merge two sorted linked lists and return it as a new list.
//    The new list should be made by splicing together the nodes of the first two lists.

//    Example:
//    Input: 1->2->4, 1->3->4
//    Output: 1->1->2->3->4->4



    public static void main(String[] args) {
        ListNode nodeL11 = new ListNode(1);
        ListNode nodeL12 = new ListNode(2);
        ListNode nodeL13 = new ListNode(4);
        ListNode nodeL21 = new ListNode(1);
        ListNode nodeL22 = new ListNode(3);
        ListNode nodeL23 = new ListNode(4);
        nodeL11.next = nodeL12;
        nodeL12.next = nodeL13;
        nodeL21.next = nodeL22;
        nodeL22.next = nodeL23;
        print(nodeL11);
        print(nodeL21);
        print(mergeTwoLists(nodeL11,nodeL21));
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode node = new ListNode(0);
        ListNode returnNode = node;

        if(l1 == null){
            return l2;
        }else if(l2 == null){
            return l1;
        }else{
            while(l1 != null && l2 != null){
                if(l1.val <= l2.val){
                    node.next = l1;
                    l1 = l1.next;

                }else{
                    node.next = l2;
                    l2 = l2.next;
                }
                node = node.next;
            }
            if(l1 == null){
                node.next = l2;
            }else {
                node.next = l1;
            }
        }
        return returnNode.next;
    }

    public static void print(ListNode l){
        System.out.print(l.val);
        while(l.next != null){
            ListNode node = l.next;
            System.out.print("->" + node.val);
            l = node;
        }
        System.out.println();
    }


    public static ListNode mergeTwoListsLeetCode(ListNode l1, ListNode l2) {

        if(l1 == null) return l2;
        if(l2 == null) return l1;

        if(l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l2.next, l1);
            return l2;
        }
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}



