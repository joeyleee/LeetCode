/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//基本算法和讨论中的相同，但是他们在确定中点时使用了快慢指针的方法这种方法很好，在之前的问题当中也有见到过
//slow,fast两个指针，slow每次移动一次，fast每次移动两次，要牢记这种方法，有很多使用的地方。
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null)return true;
        int length=0;
        ListNode node=head;
        while(node!=null){
            length++;
            node=node.next;
        }
        if(length==1)return true;
        if(length==2){
            if(head.val==head.next.val)return true;
            else return false;
        }
        ListNode pre=head,cur,suf,tail=head;
        for(int i=1;i<length/2;i++){
            pre=pre.next;
            }
        cur=pre.next;
        while(cur!=null){
            suf=cur.next;
            cur.next=pre;
            pre=cur;
            if(suf==null){
                tail=cur;
                break;
            }
            cur=suf;
            suf=suf.next;
            
        }
        for(int i=0;i<length/2;i++){
            if(head.val!=tail.val)return false;
            head=head.next;
            tail=tail.next;
        }
        return true;
        
    }
}