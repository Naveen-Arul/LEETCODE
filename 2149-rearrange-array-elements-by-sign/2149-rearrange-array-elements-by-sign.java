class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> p=new ArrayList<>();
        List<Integer> n=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        for(int num:nums){
            if(num>0){
                p.add(num);
            }
            if(num<0){
                n.add(num);
            }
        }
        for(int i=0;i<p.size();i++){
            res.add(p.get(i));
            res.add(n.get(i));
        }
        int[] r=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            r[i]=res.get(i);
        }
        return r;
    }
}