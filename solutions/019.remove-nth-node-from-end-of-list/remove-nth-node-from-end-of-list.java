/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=0;
        ListNode node=head;
        while(node!=null){
            node=node.next;
            len++;
        }
        ListNode temp= new ListNode(0); 
        temp.next=head;
        node=temp;
        len=len-n;
        while(len>0){
            node=node.next;
            len--;
        }
        node.next=node.next.next;
        return temp.next;        
    }
}