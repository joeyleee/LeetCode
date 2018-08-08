/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/*
这道题想法比较简单，但是实现的时候也是有一定难度的，主要考察代码的实现能力。
*/
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node =new ListNode(0);
        ListNode head =node;
        int carry =0;
        while(l1!=null||l2!=null||carry!=0){
            if(l1!=null)
            {
                carry+=l1.val;
                l1=l1.next;
            }
            if(l2!=null)
            {
                carry+=l2.val;
                l2=l2.next;
            }
            int val = carry%10;
            carry/=10;
            ListNode next=new ListNode(val);
            node.next=next;
            node=next;
        }
        return head.next;
    }
}