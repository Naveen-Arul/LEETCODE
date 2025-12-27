class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int max=0;
        while(start<end)
        {
            int heightt=Math.min(height[start],height[end]);
            int width=end-start;
            int area=heightt*width;
            if(area>max)
            {
                max=area;
            }
            if(height[start]<height[end])
            {
                start++;
            }
            else if(height[start]>height[end]){
                end--;
            }
            else 
            {
                start++;
                end--;
            }
        }
        return max;
    }
}