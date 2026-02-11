class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int max=0;
        for(int n:prices){
            if(n<buy){
                buy=n;
            }
            else{
                 max=Math.max(max,n-buy);
            }
        }
        return max;
    }
}