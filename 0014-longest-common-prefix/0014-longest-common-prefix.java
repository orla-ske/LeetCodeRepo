class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder(); 
        Arrays.sort(strs);
        String f = strs[0]; 
        String l = strs[strs.length-1];
        int max = 0; 
        
        if(strs.length==1){
            return strs[0];
        }

        if(f.length() > l.length()){
            max = f.length();
        }else{
            max= l.length();
        }

        for(int i = 0; i<max;i++){
            if(i<l.length() && i<f.length() && f.charAt(i)==l.charAt(i)){
                sb.append(f.charAt(i));
            }else{
                return sb.toString();
            }
        }
        return sb.toString();
    }
}