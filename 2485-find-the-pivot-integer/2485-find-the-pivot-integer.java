class Solution {
    public int pivotInteger(int n) {
        long t=(long) (n*(n+1))/2;
        long s=(long) Math.sqrt(t);
        if(s*s==t) return (int)s;
        return -1;
    }
}