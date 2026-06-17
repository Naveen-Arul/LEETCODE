class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        Set<Integer> set=new TreeSet();
        for(int num:bulbs){
            if(set.contains(num)){
                set.remove(num);
            }
            else{
                set.add(num);
            }
        }
        return new ArrayList<>(set);
    }
}