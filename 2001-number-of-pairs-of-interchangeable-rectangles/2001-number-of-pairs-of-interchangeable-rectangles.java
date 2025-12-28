
class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        Map<Double, Integer> ratioCount = new HashMap<>();
        long count = 0;

        for (int[] rect : rectangles) {
            double ratio = (double) rect[0] / rect[1]; 
            count += ratioCount.getOrDefault(ratio, 0); 
            ratioCount.put(ratio, ratioCount.getOrDefault(ratio, 0) + 1);
        }

        return count;
    }
}
