class MRUQueue {
    List <Integer> queue;
    public MRUQueue(int n) {
        queue = new ArrayList<>();
        for(int i = 1; i<n+1;i++){
            queue.add(i);
        }
    }
    
    public int fetch(int k) {
        queue.add(queue.get(k-1));
        queue.remove(queue.get(k-1)); 
        return(queue.get(queue.size()-1));
    }
}

/**
 * Your MRUQueue object will be instantiated and called as such:
 * MRUQueue obj = new MRUQueue(n);
 * int param_1 = obj.fetch(k);
 */