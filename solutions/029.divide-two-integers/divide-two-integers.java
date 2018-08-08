class Solution {
    public int divide(int dividend, int divisor) {
       int sign = 1;
       if((dividend>0&&divisor<0)||(dividend<0&&divisor>0)){
           sign=-1;
       }
           long ldividend = Math.abs((long)dividend);
           long ldivisor = Math.abs((long)divisor);
       
        if(ldividend==0||ldividend<ldivisor)return 0;
        long ans=subDivide(ldividend,ldivisor);
        if(ans>Integer.MAX_VALUE){
            return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
        }
        else{
            return (int)(sign*ans);
        }          
    }
    public long subDivide(long dividend,long divisor){
        if(divisor>dividend)return 0;
        long sum =divisor;
        long res=1;
        while((sum+sum)<=dividend){
            sum+=sum;
            res+=res;
        }
        return res+subDivide(dividend-sum,divisor);
    }
}