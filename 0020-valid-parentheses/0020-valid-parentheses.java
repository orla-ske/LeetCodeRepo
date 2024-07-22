class Solution {
    public boolean isValid(String s) {
        Stack <Character> st = new Stack <>(); 
        HashMap <Character, Character> map = new HashMap <>();

        

        map.put(')','('); 
        map.put(']','[');
        map.put('}','{'); 

        for(int i = 0; i<s.length();i++){
            char topEl = 'm';
            if(map.containsKey(s.charAt(i))){
                if(!st.isEmpty()){
                    topEl = st.pop();
                }
                if(topEl != map.get(s.charAt(i))){
                    return false;
                }
            }else{
                st.push(s.charAt(i));
            }
               
        }

        return st.isEmpty();
    }
}