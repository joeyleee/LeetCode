//开始想到了类似方法，可是没想到这种字母之间位置也可以设置索引的方法，这种方法很简单，不然要考虑的情况太多了
class Solution {
    public int countSubstrings(String s) {
        int n = s.length(),res=0;
    
        for(int cen = 0 ; cen <= 2*n-1; ++cen){
            int left = cen / 2;
            int right = left + cen % 2;
            while(left>=0&&right<n&&s.charAt(left)==s.charAt(right)){
                res++;
                left--;
                right++;
            }
            
        }
        return res;
        
    }
}
