class Solution {
    public String countAndSay(int n) {
        StringBuilder sb=new StringBuilder();
        if(n==0)return sb.toString();
        sb.append('1');
        for(int i=1;i<n;i++){
            String temp=sb.toString();
            sb=new StringBuilder();
            int j=0;
            while(j<temp.length()){
                int count =1;
                char c=temp.charAt(j);
                while(j+1<temp.length()&&c==temp.charAt(j+1)){
                    count++;
                    j++;
                }
                sb.append(String.valueOf(count));
                sb.append(c);
                j++; 
            }
            
            
        }
        return sb.toString();
        
    }
}