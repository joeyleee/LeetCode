//此方法是讨论区中的方法，直接用了java内置的stack结构，属于轻微作弊，哈哈哈！！！
// class MinStack {
//     int min=Integer.MAX_VALUE;
//     Stack<Integer> stack=new Stack<>();

//     /** initialize your data structure here. */
//     public MinStack() {
//         }
//     public void push(int x) {
//         if(x<=min){
//             stack.push(min);
//             min=x;
//         }
//         stack.push(x);
//     }
//     public void pop() {
//         if(stack.pop()==min) min=stack.pop();
//         }
//     public int top() {
//         return stack.peek();
//         }
//     public int getMin() {
//         return min;
//         }
// }
//此方法是自己用链表创建一个stack，比较符合题目要求
class MinStack{
    class Node{
        int value,min;
        Node next;
        public Node(int value,int min){
            this.value=value;
            this.min=min;
            next=null;
            }
        
    }
    Node head;
    public void push(int x){
        if(head==null){
            head=new Node(x,x);
            
        }
        else{
            Node node=new Node(x,Math.min(head.min,x));
            node.next=head;
            head=node;
        }
    }
    public void pop(){
        if(head!=null)head = head.next;
        }
    public int top(){
        if(head!=null)return head.value;
        return -1;
    }
    public int getMin(){
        if(head!=null)return head.min;
        return -1;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */