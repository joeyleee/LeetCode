class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        if(x<10)return true;
        int num1=0;
        int num2=x;
        while(num2!=0){
            num1 = num1*10+num2%10;
            num2/=10;
            
        }
       return x==num1;
    }
}