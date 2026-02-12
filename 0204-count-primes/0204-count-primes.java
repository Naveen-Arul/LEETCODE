class Solution {
    public int countPrimes(int n) {
        if(n<2) return 0;
        int c=0;
        boolean[] arr = new boolean[n];
        Arrays.fill(arr,true);
        arr[0] = false;
        arr[1] = false;
        for(int i=2;i<n;i++)
        {
            if(arr[i])
            {
                c++;
                for(long j = (long)i*i;j<n;j+=i)
                {
                    arr[(int)j]=false;
                }
            }
        }
        return c;
    }
}