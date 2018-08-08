class Solution {
    public int strStr(String haystack, String needle) {
     for(int i=0;;i++){
         for(int j=0;;j++){
             if(j==needle.length())return i;
             if(j+i==haystack.length())return -1;
             if(needle.charAt(j)!=haystack.charAt(i+j))break;
         }
     }   
    }
}
// class Solution {
//     public int strStr(String haystack, String needle) {
//         if(needle.length()==0)return 0;
//         if(needle.length()>haystack.length())return -1;
//         for(int i=0;i<haystack.length();i++){
//             int j=0;
//             while((i+j)<haystack.length()&&haystack.charAt(i+j)==needle.charAt(j)){
//                 j++;
//                 if(j==needle.length()){
//                     return i;
//                 }
//             }
//         }
//         return -1;
        
//     }
// }