class Solution {
    public void sortColors(int[] nums) {
        int c0=0,c1=0,c2=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int d=nums[i];
            if(d==0)
            {
                c0++;
            }
            else if(d==1)
            {
                c1++;
            }
            else{
                c2++;
            }
        }
        int inc=0;
        for(int i=0;i<c0;i++)
        {
            nums[inc++]=0;
        }
        for(int i=0;i<c1;i++)
        {
            nums[inc++]=1;
        }
        int n2=0;
        for(int i=0;i<c2;i++)
        {
            nums[inc++]=2;
        }
    }
}