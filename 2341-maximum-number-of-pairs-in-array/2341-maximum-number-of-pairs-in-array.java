class Solution {
    public int[] numberOfPairs(int[] nums) {
        int freq[]=new int[101];
        for(int i:nums) freq[i]++;
        int pairs=0,left=0;
        for(int i:freq){
            pairs+=i/2;
            left+=i%2;
        }
        return new int[]{pairs,left};
    }
}