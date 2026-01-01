class Solution {
    public int maximumCount(int[] nums) {
        int c=0;
        int c1=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] > 0)
            {
                c++;
            }
            if( nums[i] < 0)
            {
                c1++;
            }
        }
        if(c > c1)
        {
            return c;
        }
        return c1;
    }
}