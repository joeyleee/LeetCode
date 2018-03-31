class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        while(x>0||y>0){
            int temp = (x&1)^(y&1);
            count+=temp;
            x=x>>1;
            y=y>>1;
            }
        return count;
        
    }
}