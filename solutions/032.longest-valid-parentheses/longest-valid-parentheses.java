class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st =new Stack<>();
        int res=0;
        st.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }else{
                res=Math.max(res,i-st.peek());
                }
            }
            else{
                st.push(i);
            }
        }
        return res;
    }
}
// class Solution {
//     public int longestValidParentheses(String s) {
//         int max =0;
//         for(int i=0;i<s.length();i++){
//             int temp=0;
//             for(int j=i;j<s.length();j++){
//                 if(s.charAt(j)=='('){
//                     temp++;
//                 }
//                 if(s.charAt(j)==')'){
//                     temp--;
//                 }
//                 if(temp<0){
//                     max=Math.max(max,j-i);
//                     break;
//                 }if(temp==0){
//                  max=Math.max(max,j-i+1);
//                 }
//             }
//         }
//         return max;
        
//     }
// }