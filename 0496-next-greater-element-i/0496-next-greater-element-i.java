class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int res[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            int n1=nums1[i];
            boolean isFound=false;
            res[i]=-1;
            for(int j=0;j<nums2.length;j++)
            {
                int n2=nums2[j];
                if(n1==n2)
                {
                    isFound=true;
                }
                if(isFound && n2>n1)
                {
                    res[i]=n2;
                    break;
                }
            }
        }
        return res;
    }
}