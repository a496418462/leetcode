package easy.two;

public class LinkedListCycle {

//    Given a linked list, determine if it has a cycle in it.

//    Follow up:
//    Can you solve it without using extra space?

    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        while (slow != fast){
            if(fast == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}


// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
