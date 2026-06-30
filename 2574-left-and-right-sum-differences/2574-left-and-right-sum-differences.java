class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] leftsum=new int[n];
        int[] rightsum=new int[n];
        leftsum[0]=0;
        rightsum[n-1]=0;
        int index=1;
        int sum=0;
        for(int i=0;i<n-1;i++){
            sum+=nums[i];
            leftsum[index++]=sum;
        } 
        index=n-2;
        sum=0;
        for(int i=n-1;i>=1;i--){
            sum+=nums[i];
            rightsum[index--]=sum;
        }
        int result[]=new int[n];
        for(int i=0;i<n;i++){
            result[i]=Math.abs(leftsum[i]-rightsum[i]);
        }
        return result;
    }
}