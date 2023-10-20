class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        recurse(res, 0, 0, "", n);
        return res;
    }

    public void recurse(List<String> res, int open, int close,String curr, int max){
        if(curr.length()==max*2){
            res.add(curr); 
            return;
        }

        if(open < max) recurse(res, open+1, close, curr + "(", max);

        if(open > close) recurse(res, open, close+1, curr + ")", max);
    }
    
}