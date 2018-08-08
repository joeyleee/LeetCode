class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res=new LinkedList<>();
        String[] patterns ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int len=digits.length();
        if(len==0)return res;
        res.add("");
        for(int i=0;i<len;i++){
            String temp=patterns[digits.charAt(i)-'0'];
            List<String> tempRes=new LinkedList<>();
            for(int j=0;j<temp.length();j++){
                for(int k=0;k<res.size();k++){
                    tempRes.add(res.get(k)+temp.charAt(j));
                }
            }
            res=tempRes; 
        }
        return res;
        
        
    }
}