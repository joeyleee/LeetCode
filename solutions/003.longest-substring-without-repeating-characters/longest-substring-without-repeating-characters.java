class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash=new int[128];
        char[] str = s.toCharArray();
        int left=0,right=0;
        int max=0;

        while(right<s.length()){
            int temp=str[right];
            hash[temp]++;
            while(hash[temp]>1){
                hash[str[left]]--;
                left++;
            }
            int len =right-left+1;
            if(len>max){
                max=len;
            }
            right++;
            
        }
        return max;
        
    }
}