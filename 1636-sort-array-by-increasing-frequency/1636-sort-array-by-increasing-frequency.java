class Solution {
    public int[] frequencySort(int[] nums) {
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int n:nums){
        map.put(n,map.getOrDefault(n,0)+1);
      }
      List<Integer> keys=new ArrayList<>(map.keySet());
      Collections.sort(keys,(a,b)->{
        if(map.get(a)==map.get(b)){
            return b-a;
        }
        return map.get(a)-map.get(b);
      });
      int[] ans=new int[nums.length];
      int idx=0;
      for(int k:keys){
            int count=map.get(k);
            for(int i=0;i<count;i++){
                ans[idx++]=k;
            }
      }
      return ans;
    }
}