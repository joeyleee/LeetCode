// class Solution {
//     public int maxProfit(int[] prices) {
//         int max=0;
//         for(int i =0;i<prices.length;i++){
//             for(int j=i+1;j<prices.length;j++){
//                 if(prices[j]-prices[i]>max)max=prices[j]-prices[i];
//             }
//         }
//         return max;
//     }
// }
//上面的程序是时间复杂度过高的暴力解法，下边的程序由于没有加输入数组的长度判断，开始出现了数组越界的异常
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0){
            return 0;
        }
        else{
        int min=prices[0];
        int max=0;
        for(int price:prices){
            if(price<min)min=price;
            if(price-min>max)max=price-min;
            
        }
        return max;
        }
    }
}