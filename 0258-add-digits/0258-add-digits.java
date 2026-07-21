class Solution {
    public int addDigits(int n) {
        int sum=0;
        while(n!=0){
            int d=n%10;
            sum+=d;
            n=n/10;
        }
        if(sum<10){
            return sum;
        }
        else{
            return addDigits(sum);
        } 
    }
}