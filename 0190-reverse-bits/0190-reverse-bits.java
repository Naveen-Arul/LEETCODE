public class Solution {
    public int reverseBits(int n) {
        String s=Integer.toBinaryString(n);
        String res="";
        while(s.length()<32)
        {
            s="0"+s;
        }
        for(int i=s.length()-1;i>=0;i--)
        {
            res+=s.charAt(i);
        }
        return (int)Long.parseLong(res,2);
    }
}