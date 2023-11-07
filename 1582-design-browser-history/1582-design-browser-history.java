class BrowserHistory {
    Stack <String> back; 
    Stack <String> forward; 
    String curr;

    public BrowserHistory(String homepage) {
        back= new Stack <String>(); 
        forward = new Stack <String>();
        curr = homepage;
    }
    
    public void visit(String url) {
        back.push(curr); 
        curr = url;
        forward.clear();
    }
    
    public String back(int steps) {
        while(!back.isEmpty()){
            forward.push(curr);
            curr = back.pop();
            steps--; 
            if(steps==0){
                break;
            }
        }
        return curr;
    }
    
    public String forward(int steps) {
        while(!forward.isEmpty()){
            back.push(curr);
            curr = forward.pop();
            steps--; 
            if(steps==0){
                break;
            }
        }
        return curr;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */