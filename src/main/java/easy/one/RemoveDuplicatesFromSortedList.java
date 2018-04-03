package easy.one;

public class RemoveDuplicatesFromSortedList {

//    Given a sorted linked list, delete all duplicates such that each element appear only once.

//    For example,
//    Given 1->1->2, return 1->2.
//    Given 1->1->2->3->3, return 1->2->3.

    

    public static void main(String[] args) {
        Node nodeL11 = new Node(1);
        Node nodeL12 = new Node(1);
        Node nodeL13 = new Node(4);
        nodeL11.next = nodeL12;
        nodeL12.next = nodeL13;
        print(nodeL11);
        deleteDuplicates(nodeL11);
        print(nodeL11);
    }

    public static Node deleteDuplicates(Node head) {
        if(head == null) return null;
        Node tempHead = head;
        while(head.next != null){
            if(head.val == head.next.val){
                head.next = head.next.next;
            }else {
                head = head.next;
            }
        }
        return tempHead;
    }

    public static void print(Node l){
        System.out.print(l.val);
        while(l.next != null){
            Node node = l.next;
            System.out.print("->" + node.val);
            l = node;
        }
        System.out.println();
    }
}
/**
 * Definition for singly-linked list.
 */
class Node {
    int val;
    Node next;

    Node(int x) {
        val = x;
    }
}