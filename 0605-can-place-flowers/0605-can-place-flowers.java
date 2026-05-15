class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        int count=0;
        for(int i=0;i<f.length;i++){
            if(f[i]==0){
                boolean prev=i==0||f[i-1]==0;
                boolean next=i==f.length-1||f[i+1]==0;
                if(prev&&next){
                    count++;
                    f[i]=1;
                }
            }
        }
        return count>=n;
    }
}