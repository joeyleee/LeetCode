//遇见这种需要存储中间节点，并且还要求出所有的可能情况时，大多是用回溯法解决，并用递归实现
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        genAll(res,nums,new ArrayList<>(),0);
        return res;
    }
    public void genAll(List<List<Integer>> res,int[] nums,List<Integer> cur,int start){
        res.add(new ArrayList(cur));
        
        for(int i = start;i<nums.length;i++)
        {
            //if(cur.contains(nums[i]))continue;
            cur.add(nums[i]);
            genAll(res,nums,cur,++start);
            cur.remove(cur.size()-1);
        }  
        return;
        
    }
}