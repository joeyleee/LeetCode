class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> row =new HashSet<>();
        Set<Character> column =new HashSet<>();
        Set<Character> cube =new HashSet<>();
        for(int i=0;i<9;i++){
            row.clear();
            column.clear();
            cube.clear();
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'&&!row.add(board[i][j]))return false;
                if(board[j][i]!='.'&&!column.add(board[j][i]))return false;
                int rInd=3*(i/3);
                int cInd=3*(i%3);
                if(board[rInd+j/3][cInd+j%3]!='.'&&!cube.add(board[rInd+j/3][cInd+j%3]))return false;
            }
        }
       
        
        return true;
    }
}