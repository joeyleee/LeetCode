//这是一种滑动窗口的解决字符串子串的通用方法，需要好好牢记！！！
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result=new LinkedList<>();
        if(p.length()>s.length())return result;
        Map<Character,Integer> m =new HashMap<>();
        for(char c : p.toCharArray()){
            m.put(c,m.getOrDefault(c,0)+1);
        }
        int counter=m.size();
        int begin=0,end=0;
        while(end<s.length()){
            char c = s.charAt(end);
            if(m.containsKey(c)){
                m.put(c,m.get(c)-1);
                if(m.get(c)==0) counter--;
            }
            end++;
            while(counter==0){
                char temp = s.charAt(begin);
                if(m.containsKey(temp)){
                    m.put(temp,m.get(temp)+1);
                    if(m.get(temp)>0) counter++;
                }
                if(end-begin==p.length()) result.add(begin);
                begin++;
            
            }
        }
        return result;
    }
}