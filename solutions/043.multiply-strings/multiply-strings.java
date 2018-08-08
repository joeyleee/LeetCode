class Solution {
    public String multiply(String num1, String num2) {
        int l1=num1.length();
        int l2=num2.length();
        int[] temp =new int[l1+l2];
        for(int i=l1-1;i>=0;i--){
            for(int j=l2-1;j>=0;j--){
                int mul =((num1.charAt(i)-'0')*(num2.charAt(j)-'0'));
                int l=i+j,r=l+1;
                mul+=temp[r];
                temp[l]+=mul/10;
                temp[r]=mul%10;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i:temp){
            if(!(sb.length() == 0 && i == 0))
            sb.append(i);
        }
        return sb.length()==0?"0":sb.toString();
        
        
    }
}