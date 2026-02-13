class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int j=0;
        int sum=0;
        int minlen = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) 
        {
            sum += nums[i];
            while(sum >= target) 
            {
                minlen = Math.min(minlen, i - j + 1);
                sum-=nums[j];
                j++;
            }

        }
        return (minlen == Integer.MAX_VALUE) ? 0 : minlen;
    }
}