//一般这种找所有解的题目都是采用回溯方法的
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res =new ArrayList<>();
        LinkedList<Integer> temp =new LinkedList<>();
        int len =candidates.length;
        re(res,candidates,target,temp,0);
        return res;
        
    }
    public void re(List<List<Integer>> res,int[] cnd,int target,List<Integer> temp,int index ){
        if(target==0){
            res.add(new ArrayList(temp));
        }
        if(target<0){
            return;
        }
        else{
            for(int i=index;i<cnd.length;i++){
            temp.add(cnd[i]);
            re(res,cnd,target-cnd[i],temp,i);
             temp.remove(temp.size() - 1);
        }
    }
        
        
    }
}