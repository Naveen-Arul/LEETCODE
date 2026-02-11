class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if ((long)m * k > n) return -1;
        int low = 1;
        int high = 0;
        for (int d : bloomDay) {
            high = Math.max(high, d);
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canMake(bloomDay, m, k, mid)) {
                high = mid;   // try smaller day
            } else {
                low = mid + 1;  // need more days
            }
        }
        return low;
    }
    private boolean canMake(int[] bloomDay, int m, int k, int day) {
        int bouquets = 0;
        int count = 0;
        for (int bloom : bloomDay) {
            if (bloom <= day) {
                count++;
                if (count == k) {
                    bouquets++;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }
        return bouquets >= m;
    }
}
