class Solution {
    public int minimumDeletions(int[] nums) {

        int n = nums.length;

        if (n == 1) return 1;

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int minIdx = 0, maxIdx = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minIdx = i;
            }
            if (nums[i] > max) {
                max = nums[i];
                maxIdx = i;
            }
        }

        int left = Math.min(minIdx, maxIdx);
        int right = Math.max(minIdx, maxIdx);

        int way1 = right + 1;                 // front only
        int way2 = n - left;                  // back only
        int way3 = (left + 1) + (n - right);  // front + back

        return Math.min(way1, Math.min(way2, way3));
    }
}
