class Solution {
    public int lengthOfLongestSubstring(String s) {
        List <Character> clist = new ArrayList<Character>();
        int len = 0; 
        int i = 0; 
        int j =0;

        while(i<s.length()){
            if(clist.contains(s.charAt(i))){
                clist.remove(Character.valueOf(s.charAt(j)));
                j++; 
            }else{
                clist.add(s.charAt(i));
                len = Math.max(len,clist.size()); 
                i++;
            }
        }

        return len;
        
    }
}