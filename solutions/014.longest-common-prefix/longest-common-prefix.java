class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)return "";
        String pre=strs[0];
        int i=0;
      while(i<strs.length){
          while(strs[i].indexOf(pre)!=0){
                pre=pre.substring(0,pre.length()-1);
              }
          i++;
          }
      
        return pre;
        
    }
}