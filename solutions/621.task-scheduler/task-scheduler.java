//计数方法
// class Solution {
//     public int leastInterval(char[] tasks, int n) {
//         int max = 0;
//         int count = 0;
//         int[] map = new int[26];
//         for(char c :tasks){
//             map[c-'A']++;    
//         }
//         Arrays.sort(map);
//         int idle = (map[25]-1)*n;
//         for(int i=24;i>=0&&map[i]!=0;i--){
//             idle -=Math.min(map[i],map[25]-1);
            
//         }
//         return idle>0?tasks.length+idle:tasks.length;
        
        
//     }
// }
class Solution {
    public int leastInterval(char[] tasks, int n) {
       int[] map = new int[26];
        int time =0;
        for(char c :tasks){
            map[c-'A']++;    
        }
        Arrays.sort(map);
        while(map[25]>0){
            int i=0;
            while(i<=n){
                if (map[25] == 0)
                    break;
                if(i<26){
                map[25-i]--;
                }
                i++;
                time++;
                
                
            }
            Arrays.sort(map);
            
            
        }
        return time;
        
        
        
    }
}