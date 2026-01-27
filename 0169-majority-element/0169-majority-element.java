class Solution {
    public int majorityElement(int[] nums) {
       int l=nums.length;
       Map<Integer,Integer> map=new HashMap<>();
       for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
        if(map.get(num)>l/2){
            return num;
        }
       } 
       return -1;

    }
}