class Solution {
    public String convert(String s, int numRows) {
        int len=s.length();
        StringBuffer[] sb =new StringBuffer[numRows];
        for(int i=0;i<numRows;i++){
            sb[i]=new StringBuffer();
        }
        int i=0;
        while(i<len){
            for(int index =0;index<numRows&&i<len;index++){
                sb[index].append(s.charAt(i++));
            }
            for(int index=numRows-2;index>=1&&i<len;index--){
                sb[index].append(s.charAt(i++));
            }
        }
        for(i=1;i<numRows;i++){
            sb[0].append(sb[i]);
        }
        return sb[0].toString();
        
        
    }
}