class BrowserHistory {

    Stack <String> bHis;
    Stack <String> fHis;
    String curr;

    public BrowserHistory(String homepage) {
        bHis = new Stack <>(); 
        fHis = new Stack <>(); 
        curr = homepage; 
    }
    
    public void visit(String url) {
        fHis.clear();
        bHis.push(curr);
        curr = url;  
    }
    
    public String back(int steps) {
        while(!bHis.empty() && steps != 0){
            fHis.push(curr);
            curr = bHis.pop(); 
            steps--;
        }
        return curr;
    }
    
    public String forward(int steps) {
        while(!fHis.empty() && steps != 0){
            bHis.push(curr);
            curr = fHis.pop(); 
            steps--;
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