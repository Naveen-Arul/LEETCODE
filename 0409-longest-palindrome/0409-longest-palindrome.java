class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int ans=0;
        for(int n:map.values()){
            ans+=(n/2)*2;
        } 
        if(s.length()>ans) ans+=1;
        return ans;
    }
}