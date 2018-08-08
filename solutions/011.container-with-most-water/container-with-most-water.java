//暴力解法非常简单，就是一个循环嵌套，下面这种方法是参考其他人的做法，感觉和爬山法有点类似，移动较短的那根线，这样可能使面积增加
class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int max=0;
        while(i<j){
            int area=Math.min(height[i],height[j])*(j-i);
            if(height[i]>height[j]){
                j--;
            }
            else{
                i++;
            }
            if(area>max)max=area;
        }
        return max;
    }
}
// class Solution {
//     public int maxArea(int[] height) {
//         int max=0;
//         for(int i=0;i<height.length;i++){
//             for(int j=i;j<height.length;j++){
//                 int temp =(j-i)*Math.min(height[i],height[j]);
//                 if(temp>max){
//                     max=temp;
//                 }
//             }
//         }
//         return max;
        
//     }
// }