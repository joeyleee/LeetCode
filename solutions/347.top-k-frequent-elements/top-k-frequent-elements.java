//一种新的排序方法，桶排序，牺牲大量的空间复杂度，来换取时间复杂度的减少
public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer>[] bucket = new List[nums.length+1];
        for(int num:map.keySet()){
            int freq = map.get(num);
            if(bucket[freq]==null)
                bucket[freq] = new LinkedList<Integer>();
            bucket[freq].add(num);
            }
        List<Integer> res = new LinkedList<>();
       
            for(int n = bucket.length-1;n>0&&k>0;n--){
                if(bucket[n]!=null){
                    res.addAll(bucket[n]);
                    k-=bucket[n].size();
                
            }
        }
        return res;
        
        

    }
}