class Solution {
    public int romanToInt(String s) {
        int len=s.length();
        int sum=0;
        int[] temp=new int[len];
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='M')temp[i]=1000;
            if(s.charAt(i)=='D')temp[i]=500;
            if(s.charAt(i)=='C')temp[i]=100;
            if(s.charAt(i)=='L')temp[i]=50;
            if(s.charAt(i)=='X')temp[i]=10;
            if(s.charAt(i)=='V')temp[i]=5;
            if(s.charAt(i)=='I')temp[i]=1;
        }
        for(int i=0;i<len-1;i++){
            if(temp[i]>=temp[i+1]){
                sum+=temp[i];
            }
            else{
                sum-=temp[i];
            }
        }
        sum+=temp[len-1];
        return sum;
        
    }
}