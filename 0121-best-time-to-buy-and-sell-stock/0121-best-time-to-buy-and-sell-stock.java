class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int res=0;
        for(int n:prices){
            if(n<buy){
                buy=n;
            }
            else{
                res=Math.max(res,n-buy);
            }
        }
        return res;
    }
}