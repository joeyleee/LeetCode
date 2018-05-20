class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp =matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
               
            }
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                int temp =matrix[i][j];
                matrix[i][j]=matrix[n-1-j][n-1-i];
                matrix[n-1-j][n-1-i]=temp;
                
            }
        }
        
    }
    
}