class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res =new ArrayList<>();
        List<Integer> temp =new ArrayList<>();
        re(res,temp,candidates,target,0);
        return res;
    }
    public void re(List<List<Integer>> res,List<Integer> temp,int[] ca,int target,int index){
        if(target==0)res.add(new ArrayList(temp));
        if(target<0)return;
        for(int i=index;i<ca.length;i++){
            if(i>index&&ca[i]==ca[i-1])continue;
            temp.add(ca[i]);
            re(res,temp,ca,target-ca[i],i+1);
            temp.remove(temp.size()-1);
        }
    }
}