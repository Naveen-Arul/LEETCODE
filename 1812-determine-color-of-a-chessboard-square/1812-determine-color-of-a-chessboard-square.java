class Solution {
    public boolean squareIsWhite(String coordinates) {
        char[] arr=coordinates.toCharArray();
        int num=arr[0]+arr[1];
        if(num%2==0)
        {
            return false;
        }
        else{
            return true;
        }
    }
}