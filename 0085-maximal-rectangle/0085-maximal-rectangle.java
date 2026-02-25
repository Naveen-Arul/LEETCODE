class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix==null || matrix.length==0||matrix[0].length==0)
        {
            return 0;
        }
        int r=matrix.length;
        int c=matrix[0].length;
        int maxArea=0;
        int height[]=new int[c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(matrix[i][j]=='1')
                {
                    height[j]++;
                }
                else{
                    height[j]=0;
                }
            }
        for(int start=0;start<c;start++)
        {
            int min=height[start];
            for(int end=start;end<c;end++)
            {
                if(height[end]==0)
                {
                    break;
                }
                min=Math.min(min,height[end]);
                int width=end-start+1;
                int area=min*width;
                maxArea=Math.max(maxArea,area);
            }
        }
        }
        return maxArea;
    }
}