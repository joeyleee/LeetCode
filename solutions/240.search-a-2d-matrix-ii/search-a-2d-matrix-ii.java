/*
这道题做过很多次了，就是从右上角开始找，这样是最方便的方法，需要注意的是while循环中的if要加上else，不然可能出现数组越界的错误
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         if(matrix == null || matrix.length < 1 || matrix[0].length <1) {
            return false;
        }
        int m=matrix.length;
        int n=matrix[0].length;
        int i=0,j=n-1;
        while(i<m&&j>=0){
            if(matrix[i][j]==target)return true;
            else if(matrix[i][j]<target)i++;
            else if(matrix[i][j]>target)j--;         
        }
        return false;     
    }
}