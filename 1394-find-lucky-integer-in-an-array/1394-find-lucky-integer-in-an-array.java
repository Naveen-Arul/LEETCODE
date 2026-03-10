class Solution {
    public int findLucky(int[] arr) {
        int result=-1;
        int[] freq=new int[501];
        for(int i : arr)
        {
            freq[i]++;
        }
        for(int i=1;i<=500;i++)
        {
            if(freq[i]==i)
            {
            result=Math.max(result,i);
            }
        }
        return result;
    }
}