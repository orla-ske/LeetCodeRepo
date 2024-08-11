class Solution {
    public boolean isValid(String s) {
        HashMap <Character, Character> map = new HashMap<>(); 
        Stack <Character> st = new Stack<>();

        map.put(')','('); 
        map.put(']','['); 
        map.put('}','{'); 

        for(int i = 0;i<s.length();i++){
            if(map.containsKey(s.charAt(i)) && !st.isEmpty() ){
                if(st.peek()==map.get(s.charAt(i))){
                    st.pop();
                }else{
                    return false;
                }
            }else{
                st.push(s.charAt(i));
            }
        } 

        return st.isEmpty();
    }
}