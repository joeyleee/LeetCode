class Solution {
    public String intToRoman(int num) {
        int[] i={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] j={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int index=12;
        StringBuffer sb=new StringBuffer();
        while(num>0){
            for(int k=index;k>=0;k--){
                if(i[k]<=num){
                    num-=i[k];
                    sb.append(j[k]);
                    index=k;
                    break;
                }
            }
        }
        return sb.toString();
        
    }
}