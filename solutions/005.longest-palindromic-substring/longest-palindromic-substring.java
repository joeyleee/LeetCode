class Solution {
    
    int left,right;
    int max =0;
    public String longestPalindrome(String s) {
        int len =s.length();
        if(len<2)return s;
        for(int i =0;i<len;i++){
            check(s,i,i);
            check(s,i,i+1);
        }
        return s.substring(left,right);
        
    }
    public void check(String str,int i ,int j){
        while(i>=0&&j<str.length()&&str.charAt(i)==str.charAt(j)){
            i--;
            j++;
            
        }
        if((j-i+1)>max){
            max=j-i+1;
            left=i+1;
            right=j;
        }
       
    }
}