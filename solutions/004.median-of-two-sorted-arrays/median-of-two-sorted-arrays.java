class Solution {
   public double findMedianSortedArrays(int[] A, int[] B){
    int m = A.length;
    int n = B.length;
    if(m > n){
        return findMedianSortedArrays(B, A);
    }
    int minIndex = 0, maxIndex = m, halfLen = (m + n + 1) / 2;
    int maxLeft, minRight;
    while(minIndex <= maxIndex){
        int i = (minIndex + maxIndex) / 2;
        int j = halfLen - i;
        if(i < m && B[j - 1] > A[i]){
            minIndex = i + 1;
        } else if(i > 0 && A[i - 1] > B[j]){
            maxIndex = i - 1;
        } else{
            if(i == 0){
                maxLeft = B[j - 1];
            } else if(j == 0){
                maxLeft = A[i - 1];
            } else{
                maxLeft = Math.max(A[i - 1], B[j - 1]);
            }
            if((m + n) % 2 == 1){
                return maxLeft;
            }
            if(i == m){
                minRight = B[j];
            } else if(j == n){
                minRight = A[i];
            } else{
                minRight = Math.min(A[i], B[j]);
            }
            return (maxLeft + minRight) / 2.0;
        }
    }
    return 0;
}
     
}