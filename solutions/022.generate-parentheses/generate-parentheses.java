//遇见这种需要存储中间节点，并且还要求出所有的可能情况时，大多是用回溯法解决，并用递归实现
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> results = new ArrayList<>();
        genAll("(",n,1,0,results);
        return results; 
    }
    public void genAll(String cur,int max,int left,int right,List<String> results){
            if(cur.length()==2*max){
                results.add(cur);
                return;
                }
            if(left<max)
                genAll(cur+"(",max,left+1,right,results);
            if(right<left)
                genAll(cur+")",max,left,right+1,results);
        }
}