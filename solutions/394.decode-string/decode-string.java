class Solution {
    public String decodeString(String s) {
        String res="";
        Stack<Integer> a =new Stack<>();
        Stack<String> b =new Stack<>();
        int index=0;
       while(index<s.length()){
            char c=s.charAt(index);
           if(Character.isDigit(c)){
               int i=0;
               while(Character.isDigit(s.charAt(index))){
                   i=i*10+(s.charAt(index)-'0');
                   index++;
               }
               a.push(i); 
           }
            
           else if(c=='['){
               b.push(res);
               res="";
               index++;
           }
           else if(c==']'){
               StringBuilder sb =new StringBuilder(b.pop());
               int i =a.pop();
               for(int j=0;j<i;j++){
                   sb.append(res);
               }
               res=sb.toString();
               index++;
               
           }
           else{
               res+=c;
               index++;
           }
            
    }
        return res;  
  }
    
}