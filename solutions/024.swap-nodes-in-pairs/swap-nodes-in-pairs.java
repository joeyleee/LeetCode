/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode node=head;
        ListNode temp=node.next.next;
        ListNode pre;
        head=node.next;
        node.next.next=node;
        node.next=temp;
        pre=node;
        node=temp;
        while(node!=null&&node.next!=null){
            temp=node.next.next;
            node.next.next=node;
            pre.next=node.next;
            node.next=temp;
            pre=node;
            node=temp;
        }
        return head;
        
    }
}