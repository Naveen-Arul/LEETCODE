class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int res[]=new int[nums.length];
        int right=nums.length-1;
        int index=nums.length-1;
        while(left<=right){
            int leftsquare=nums[left]*nums[left];
            int rightsquare=nums[right]*nums[right];
            if(leftsquare>rightsquare){
                res[index]=leftsquare;
                left++;
            }
            else{
                res[index]=rightsquare;
                right--;
            }
            index--;
        }
        return res;
    }
}