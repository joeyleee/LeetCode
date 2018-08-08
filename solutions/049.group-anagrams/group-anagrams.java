/*
整体思想比较简单，就是对字符串进行排序，然后对比排序后的字符串是否相同，用一个hashmap来存储，但是这些基本方法的使用，很不熟悉，需要注意
*/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0){
            return new ArrayList();
        }
        Map<String,List> res= new HashMap<String,List>();
        for(String str:strs){
            char[] temp = str.toCharArray();
            Arrays.sort(temp);
            String key = String.valueOf(temp);
            if(!res.containsKey(key))res.put(key,new ArrayList<String>());
            res.get(key).add(str); 
        }
        return new ArrayList(res.values()); 
    }
}