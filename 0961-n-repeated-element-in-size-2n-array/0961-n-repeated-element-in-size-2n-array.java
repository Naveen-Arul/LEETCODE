class Solution {
    public int repeatedNTimes(int[] nums) {
        int l=nums.length;
        int n=l/2;
        Arrays.sort(nums);
        for(int i=0;i<l-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                return nums[i];
            }
        }
        return -1;
    }
}