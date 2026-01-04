class Solution {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length <= 1) return nums.length;
        List<Integer> res = new ArrayList<>();
        res.add(nums[0]);
        int prevDiff = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int diff = nums[i + 1] - nums[i];
            if ((diff > 0 && prevDiff <= 0) || (diff < 0 && prevDiff >= 0)) {
                if (diff != 0) {
                    res.add(nums[i + 1]);
                    prevDiff = diff;
                }
            }
        }
        return res.size();
    }
}
