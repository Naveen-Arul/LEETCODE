class Solution {
    public int[] shuffle(int[] nums, int n) {
        int x=0,y=n;
        int a[]=new int[2*n];
        for(int i=0;i<n;i++){
            a[2*i]=nums[x];
            a[2*i+1]=nums[y];
            x++;
            y++;
        }
        return a;
    }

}