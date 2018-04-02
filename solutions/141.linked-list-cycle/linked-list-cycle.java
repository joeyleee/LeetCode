/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null)return false;
        ListNode n1,n2;
        n1=head;
        n2=head;
        while(n2!=null&&n2.next!=null){
            n1=n1.next;
            n2=n2.next.next;
            if(n1==n2)return true;
        }
        return false;
    }
}
