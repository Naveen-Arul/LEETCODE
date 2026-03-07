class Solution {
    public int dominantIndex(int[] nums) {
     int large=-1;
     int sec_large=-1;
     int max_ind=-1;
     for(int i=0;i<nums.length;i++){
        if(nums[i]>large){
            sec_large=large;
            large=nums[i];
            max_ind=i;
        }
        else if(sec_large!=large && nums[i]>sec_large){
            sec_large=nums[i];
        }
     }   
     if(large>=2*sec_large){
        return max_ind;
     }
     else{
        return -1;
     }
    }
}