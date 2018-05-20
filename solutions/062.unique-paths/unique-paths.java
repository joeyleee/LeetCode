class Solution {
    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m+1][n+1];
        grid[0][0]=1;
        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                grid[i][j+1]+=grid[i][j];
                grid[i+1][j]+=grid[i][j];
                
            }
        }
        return grid[m-1][n-1];
        
    }
}