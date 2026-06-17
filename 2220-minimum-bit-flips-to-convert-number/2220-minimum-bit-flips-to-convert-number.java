class Solution {
    public int minBitFlips(int start, int goal) {
        int a = start ^ goal;
        String s = Integer.toBinaryString(a);
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '1')
            {
                c++;
            }
        }
        return c;
    }
}