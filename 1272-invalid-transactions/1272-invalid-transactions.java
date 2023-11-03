class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        List<String> invalid = new ArrayList<String> (); 
        int i = 0;
        int j = 0;

        for(i = 0; i<transactions.length;i++){
            String [] trans = transactions[i].split(",");
            String cName = trans[0]; 
            int cAmount = Integer.parseInt(trans[2]); 
            int cTime = Integer.parseInt(trans[1]); 
            String cCity = trans[3]; 

            if(cAmount> 1000){
                invalid.add(transactions[i]); 
                continue;
            }

            boolean isInvalid = false; 

            for( j = 0; j<transactions.length;j++){
                String [] next = transactions[j].split(","); 
                String nName = next[0]; 
                int nAmount = Integer.parseInt(next[2]); 
                int nTime = Integer.parseInt(next[1]); 
                String nCity = next[3];

                if(i!=j){
                    if(cName.equals(nName) && !cCity.equals(nCity) && Math.abs(cTime-nTime)<=60){
                        isInvalid=true;
                        break;
                    }
                }
            }
            if(isInvalid){
                invalid.add(transactions[i]);
            }
        }
        return invalid;
    }
}