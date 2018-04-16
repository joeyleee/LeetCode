//这道题看答案做的，首先根据身高排序，身高高的在前，身高低的在后，如果相等，按后边的值大的在后，小的在前，此时，该子数组就是正确的排序，之后在插入次高的子数组，而这时，因为比他高的元素都已经插进来了，所以在插入不会影响到之前的顺序，而他们就放到k值的位置就可以了
class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                return (a[0]==b[0]?a[1]-b[1]:b[0]-a[0]);
                }
            });
        LinkedList<int[]> res = new LinkedList<>();
        for(int[] cur : people){
            res.add(cur[1],cur);
        }
        return res.toArray(new int [people.length][2]);
        
        
        
    }
}