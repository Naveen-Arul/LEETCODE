class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        long count=0;
        HashMap<Double,Integer> map=new HashMap<>();
        for(int i=0;i<rectangles.length;i++){
            double ratio=(double)rectangles[i][0]/rectangles[i][1];
            count+=map.getOrDefault(ratio,0);
            map.put(ratio,map.getOrDefault(ratio,0)+1);
        }
        return count;
    }
}