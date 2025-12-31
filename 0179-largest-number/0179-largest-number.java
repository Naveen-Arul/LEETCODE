class Solution {
    public String largestNumber(int[] nums) {
        String[] a=new String[nums.length];
        for(int i=0;i<a.length;i++)
        {
            a[i]=String.valueOf(nums[i]);
        }
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                String first=a[i]+a[j];
                String second=a[j]+a[i];
                if(first.compareTo(second)<0)
                {
                    String temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }
        }
        if(a[0].equals("0"))
        {
            return "0";
        }
        String res="";
        for(String s:a)
        {
            res+=s;
        }
        return res;
    }
}