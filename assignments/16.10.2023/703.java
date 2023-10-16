class MyHashSet {
    List<Integer> lsd;

    public MyHashSet() {
        lsd = new ArrayList<>();
    }
    
    public void add(int key) {
        if(!lsd.contains(key)){
            lsd.add(key);
        }
    }
    
    public void remove(int key) {
        if(lsd.contains(key)){
            lsd.remove(Integer.valueOf(key));
        }
    }
    
    public boolean contains(int key) {
        return lsd.contains(key); 
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */