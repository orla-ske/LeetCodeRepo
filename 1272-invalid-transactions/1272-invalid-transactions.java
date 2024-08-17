class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        List <String> res = new ArrayList <>(); 
        HashMap <String, List<Transaction>> map = new HashMap<>(); 

        
        for(String str : transactions){
            String [] s = str.split(",");
            Transaction trans = new Transaction(s[0],s[1],s[2],s[3]);
            map.putIfAbsent(trans.name, new ArrayList()); 
            map.get(trans.name).add(trans);
        }

        for(String str: transactions){
            String [] s = str.split(",");
            Transaction trans = new Transaction(s[0],s[1],s[2],s[3]);

            if(!isValid(trans, map.get(trans.name))){
                res.add(str);
            }
        }

        return res;
        
    }

    public boolean isValid(Transaction trans, List<Transaction> l){
            if(trans.amount > 1000){
                return false;
            }

            for(Transaction t : l){
                if(!trans.location.equals(t.location) && (Math.abs(trans.time - t.time)<=60)){
                    return false;
                }
            }
            return true;
    }
}

public class Transaction{
    String name;
    int time; 
    int amount; 
    String location;

    Transaction(String name, String time, String amount, String location){
        this.name = name; 
        this.time = Integer.parseInt(time); 
        this.amount = Integer.parseInt(amount); 
        this.location = location;
    }

}