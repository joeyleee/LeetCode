//这道题目比较简单，就是考察代码实现能力，但是在处理溢出问题时出现了问题，参考了别人的方法，非常不错，一旦溢出了，则当前结果除以10不等于原来的结果了
class Solution {
    public int reverse(int x) {
        int res=0;
        while(x!=0){
            int newRes=res*10+x%10;
            if(newRes/10!=res)return 0;
            res=newRes;
            x=x/10;
        }
        return res;
    }
}