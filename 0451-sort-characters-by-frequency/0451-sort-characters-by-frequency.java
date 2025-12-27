class Solution {
    public String frequencySort(String s) {
      HashMap<Character,Integer> map=new HashMap<>();
      for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        map.put(c,map.getOrDefault(c,0)+1);
      }
      List<Character> keys=new ArrayList<>(map.keySet());
      Collections.sort(keys,(a,b)->map.get(a)-map.get(b));
      Collections.reverse(keys);
      StringBuilder ans=new StringBuilder();
      for(char c:keys){
            int count=map.get(c);
            for(int i=0;i<count;i++){
                ans.append(c);
            }
      }
    return ans.toString();
    }
}