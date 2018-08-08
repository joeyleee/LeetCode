class Solution {
    public int myAtoi(String str) {
        boolean sign=true;
        int res=0;
        int index = 0;
        int len = str.length();
        if(len==0)return 0;
        while(index<len&&str.charAt(index)==' '){
            index++;
            if (index == str.length()) return 0;
        }
        if(str.charAt(index)=='+'||str.charAt(index)=='-'){
            sign=(str.charAt(index)=='+'?true:false);
            index++;
        }
        while(index<len){
            int num =str.charAt(index)-'0';
            if(num>9||num<0)break;
            if(Integer.MAX_VALUE / 10 < res || Integer.MAX_VALUE / 10 == res && Integer.MAX_VALUE % 10 < num)
                return sign == true ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            res=res*10+num;
            index++;
            
        }
        if(!sign)return -res;
        return res;
        
        
    }
}