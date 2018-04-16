class Solution{
    public int[] countBits(int num){
        int[] results = new int[num+1];
        for(int i =1;i<=num;i++){
            results[i]=results[i>>1]+(i&1);
        }
        return results;
    }
}
//超出了时间复杂度限制
// class Solution {
//     public int[] countBits(int num) {
//         int[] results=new int [num+1];
//         int result=0;
//         for(int i =num;i>=0;i--){
//             while(i!=0){
//                 result+=num&1;
//             }
//             results[i]=result;
//         }
//         return results;
//     }
// }