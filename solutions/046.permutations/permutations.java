//遇见这种需要存储中间节点，并且还要求出所有的可能情况时，大多是用回溯法解决，并用递归实现
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res =new ArrayList<>();
      genAll(res,nums,new ArrayList());
        return res;
        
        
    }
    public void genAll(List<List<Integer>> res, int[] nums,List<Integer> cur){
        if(cur.size()==nums.length){
            res.add(new ArrayList<>(cur) );
            return;
        }
        for(int i = 0 ;i<nums.length;i++){
            if(cur.contains(nums[i]))continue;
            cur.add(nums[i]);
            genAll(res,nums,cur);
            cur.remove(cur.size()-1);
        }
        
    }
}