/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//参考讨论区的代码,这种方法非常巧妙，而且代码写的很漂亮，值得学习！
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA,b=headB;
        while(a!=b){
            a=(a==null?headB:a.next);
            b=(b==null?headA:b.next);
            if(a==headA&&b==headB)return null;
        }
        return a;
    
    
    }
}
//这是自己想出方法已经达到了最难的要求，但是上面是一种更巧妙的方法
// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         int lengthA=0,lengthB=0;
//         ListNode a=headA,b=headB;
//         while(a!=null){
//             a=a.next;
//             lengthA++;
//             }
//         while(b!=null){
//             b=b.next;
//             lengthB++;
//             }
//         a=headA;
//         b=headB;
//         if(lengthA>lengthB){
//             for(int i=0;i<lengthA-lengthB;i++){
//                 a=a.next;
//                 }
//             while(a!=null){
//                 if(a==b)return a;
//                 a=a.next;
//                 b=b.next;
//             }
//             return null;
//         }
//          if(lengthA<lengthB){
//             for(int i=0;i<lengthB-lengthA;i++){
//                 b=b.next;
//                 }
//             while(a!=null){
//                 if(a==b)return a;
//                 a=a.next;
//                 b=b.next;
//             }
//             return null;
//         }
//          if(lengthA==lengthB){
         
//             while(a!=null){
//                 if(a==b)return a;
//                 a=a.next;
//                 b=b.next;
//             }
//             return null;
//         }
//         return null;
        
        
        
        
//     }
// }