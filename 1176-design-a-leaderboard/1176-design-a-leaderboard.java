class Leaderboard {

    HashMap<Integer, Integer> scores; 

    public Leaderboard() {
        scores = new HashMap<>();
    }
    
    public void addScore(int playerId, int score) {
        scores.compute(playerId, (k, v) -> v == null? score: v + score);
    }
    
    public int top(int K) {
        int sum = 0;
        List<Integer> values = new ArrayList<>(scores.values());
        Collections.sort(values, Collections.reverseOrder());
        for (int i = 0; i < K; i++){
            sum += values.get(i);
        }
        return sum;
    }
    
    public void reset(int playerId) {
        scores.remove(playerId);
    }
}

/**
 * Your Leaderboard object will be instantiated and called as such:
 * Leaderboard obj = new Leaderboard();
 * obj.addScore(playerId,score);
 * int param_2 = obj.top(K);
 * obj.reset(playerId);
 */