class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res= new ArrayList<>();
        if (words.length == 0) { return res; }
        Map<String,Integer> counts = new HashMap<>();
        for(String ss:words){
            counts.put(ss,counts.getOrDefault(ss,0)+1);
        }
        int len=words[0].length();
        int n=s.length();
        int nums=words.length;
        for(int i=0;i<n-nums*len+1;i++){
            final Map<String,Integer> seen =new HashMap<>();
            int j=0;
            while(j<nums){
                String str= s.substring(i+j*len,i+(j+1)*len);
                if(counts.containsKey(str)){
                    seen.put(str,seen.getOrDefault(str,0)+1);
                    if(seen.get(str)>counts.getOrDefault(str,0)){
                        break;
                    }
                }
                else{
                    break;
                }
                j++;
            }
            if(j==nums)res.add(i);
        }
        return res;
        
    }
}