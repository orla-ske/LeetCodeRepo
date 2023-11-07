class Leaderboard {
    Map <Integer, Integer> leaderBoard;
    public Leaderboard() {
        leaderBoard = new HashMap <>(); 
    }
    
    public void addScore(int playerId, int score) {
        if(leaderBoard.containsKey(playerId)){
            leaderBoard.replace(playerId, leaderBoard.get(playerId)+score);
        }else{
            leaderBoard.put(playerId, score);
        }
    }
    
    public int top(int K) {
        List <Integer> lead = new ArrayList <>(leaderBoard.values());
        Collections.sort(lead, Collections.reverseOrder()); 
        int res = 0;
        for(int i = 0; i<K; i++){
            res += lead.get(i);
        }
        return res;
    }
    
    public void reset(int playerId) {
        leaderBoard.replace(playerId, 0);
    }
}

/**
 * Your Leaderboard object will be instantiated and called as such:
 * Leaderboard obj = new Leaderboard();
 * obj.addScore(playerId,score);
 * int param_2 = obj.top(K);
 * obj.reset(playerId);
 */