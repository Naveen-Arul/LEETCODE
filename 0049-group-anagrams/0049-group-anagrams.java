class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String st:strs){
            char[] carr=st.toCharArray();
            Arrays.sort(carr);
            String now=new String(carr);
            map.putIfAbsent(now,new ArrayList<>());
            map.get(now).add(st);
        }
        return new ArrayList<>(map.values());
    }
}