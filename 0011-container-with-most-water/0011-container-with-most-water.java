class Solution {
    public int maxArea(int[] height) {
        int s=0;
        int e=height.length-1;
        int max=0;
        while(s<e){
            int h=Math.min(height[s],height[e]);
            int w=e-s;
            int a=h*w;
            max=Math.max(a,max);
            if(height[s]<height[e]){
                s++;
            }
            else{
                e--;
            }
        }
        return max;
    }
}