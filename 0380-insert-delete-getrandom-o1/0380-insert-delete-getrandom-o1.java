class RandomizedSet {
    HashSet<Integer> set=new HashSet<>();
    Random rand=new Random();
    public RandomizedSet() {
    }
    
    public boolean insert(int val) {
        return set.add(val);
    }
    
    public boolean remove(int val) {
        return set.remove(val);
    }
    
    public int getRandom() {
        int index=rand.nextInt(set.size());
        int i=0;
        for(int val:set){
            if(i==index) return val;
            i++;
        }
        return -1;
    }
}

